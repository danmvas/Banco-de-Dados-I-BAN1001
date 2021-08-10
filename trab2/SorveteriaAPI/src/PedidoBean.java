/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniv
 */
public class PedidoBean {
    
    private int id_pedido;
    private String tamanho;
    private String pagamento;
    private float total;
    private int id_sorvete;
    private SorveteBean sorvete;
    
   public PedidoBean(int id_pedido, String tamanho, String pagamento, float total, int id_sorvete) {
       this.id_pedido = id_pedido;
       this.pagamento = pagamento;
       this.tamanho = tamanho;
       this.total = total;
       this.id_sorvete = id_sorvete;
   }

    public int getId_Pedido() {
        return id_pedido;
    }

    public void setId_Pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

        public String getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getPagamento() {
        return pagamento;
    }
    
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    
    public float getTotal() {
        return total;
    }
    
    public void setTotal(float total) {
        this.total = total;
    }
    
    public int getId_Sorvete() {
        return id_sorvete;
    }

    public void setId_Sorvete(int id_sorvete) {
        this.id_sorvete = id_sorvete;
    }
    
    public SorveteBean getSorvete(){
        return sorvete;
    }
    
    public void setSorvete (SorveteBean sorvete){
        this.sorvete = sorvete;
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("id_pedido: "+id_pedido+
                " | tamanho: "+tamanho+
                " | pagamento: "+pagamento+
                " | total: "+total);
        if(sorvete!= null)
            sb.append(" | id_sorvete: "+sorvete.getId_Sorvete()+" | sabor: "+sorvete.getSabor());
        return sb.toString();
    }
    
}
