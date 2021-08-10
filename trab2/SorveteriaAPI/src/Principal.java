/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author rebeca
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Conexao c = new Conexao();
        Connection con = c.getConnection();
        int op = 0;
        do{
            op = menu();
            try {
                switch (op) {
                    case 1: new SorveteController().createSorvete(con);
                            break;
                    case 2: new PedidoController().createPedido(con);
                            break;
                    case 3: new SorveteController().listarSorvete(con);
                            break;
                    case 4: new PedidoController().listarPedido(con);
                            break;
                    case 5: new PedidoController().listarPedidoSorvete(con);
                            break;
                    case 6: new PedidoController().listarSorveteLucro(con);
                            break;
                }
            }catch(SQLException ex) {
                //ex.printStackTrace();
                System.out.println(ex.getMessage());
                continue;
            }
        } while(op>0 && op<7);  
        con.close();
    }    
    
    private static int menu() {
        System.out.println("");
        System.out.println("Informe o número da opção que desejas executar: ");
        System.out.println("1 - Inserir um novo sorvete");
        System.out.println("2 - Inserir um novo pedido");
        System.out.println("3 - Exibir todos os sorvetes");
        System.out.println("4 - Exibir todos os pedidos");
        System.out.println("5 - Exibir todos os pedidos e seus respectivos sabores associados");
        System.out.println("6 - Exibir sabores de sorvete que dao mais lucro (compras de maior valor)");
        System.out.println("Digite qualquer outro valor para sair");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
