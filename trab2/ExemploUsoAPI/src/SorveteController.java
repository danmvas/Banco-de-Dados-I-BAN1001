
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniv
 */
public class SorveteController {
    
    public void createSorvete(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a criar um novo Sorvete: ");
        System.out.print("id_sorvete: ");
        int id_sorvete = input.nextInt();
        System.out.print("sabor: ");
        String sabor = input.next();
        SorveteBean sorvete = new SorveteBean(id_sorvete, sabor);
        SorveteModel.create(sorvete, con);
        System.out.println("Sorvete criado com sucesso!!");
    }

    void listarSorvete(Connection con) throws SQLException {
        HashSet all = SorveteModel.listAll(con);
        Iterator<SorveteBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
}
