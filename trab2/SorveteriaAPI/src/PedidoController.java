
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
public class PedidoController {
    
    public void createPedido(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a criar um novo Pedido: ");
        
        System.out.print("id_pedido: ");
        int id_pedido = input.nextInt();
        
        System.out.print("tamanho (p: pequeno / m: medio / g: grande): ");
        String tamanho = input.next();
        
        System.out.print("pagamento (c: credito / de: debito / di: dinheiro): ");
        String pagamento = input.next();
        
        System.out.print("total: ");
        float total = input.nextFloat();
        
        System.out.print("id_sorvete: ");
        switch(tamanho){
            case "p":
                int id_sorvete = input.nextInt();
                PedidoBean pedido = new PedidoBean(id_pedido, tamanho, pagamento, total, id_sorvete);
                PedidoModel.create(pedido, con);
                break;
                
            case "m":
                int id_sorvete1 = input.nextInt();
                PedidoBean pedido1 = new PedidoBean(id_pedido, tamanho, pagamento, total, id_sorvete1);
                int id_sorvete2 = input.nextInt();
                PedidoBean pedido2 = new PedidoBean(id_pedido, tamanho, pagamento, total, id_sorvete2);            
                PedidoModel.create(pedido1, con);
                PedidoModel.create(pedido2, con);
                break;
            
            case "g":
                int id_sorvete3 = input.nextInt();
                PedidoBean pedido3 = new PedidoBean(id_pedido, tamanho, pagamento, total, id_sorvete3);
                int id_sorvete4 = input.nextInt();
                PedidoBean pedido4 = new PedidoBean(id_pedido, tamanho, pagamento, total, id_sorvete4);
                int id_sorvete5 = input.nextInt();
                PedidoBean pedido5 = new PedidoBean(id_pedido, tamanho, pagamento, total, id_sorvete5);
                PedidoModel.create(pedido3, con);
                PedidoModel.create(pedido4, con);
                PedidoModel.create(pedido5, con);
                break;
        }
        
        if(tamanho.equals('p')){
            
        }

        if(tamanho.equals('m')){

        }
        if(tamanho.equals('g')) {

        }
        
        System.out.println("Pedido criado com sucesso!!");
    }

    void listarPedido(Connection con) throws SQLException {
        HashSet all = PedidoModel.listAll(con);
        Iterator<PedidoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
        void listarPedidoSorvete(Connection con) throws SQLException {
        HashSet all = PedidoModel.listAllWithSorvete(con);
        Iterator<PedidoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
        

    
}
