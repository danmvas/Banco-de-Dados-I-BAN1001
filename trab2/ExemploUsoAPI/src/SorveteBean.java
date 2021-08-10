/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniv
 */
public class SorveteBean {
    
   private int id_sorvete;
   private String sabor;
   
   public SorveteBean(int id_sorvete, String sabor) {
       this.id_sorvete= id_sorvete;
       this.sabor = sabor;
   }

    public int getId_Sorvete() {
        return id_sorvete;
    }

    public void setId_Sorvete(int id_sorvete) {
        this.id_sorvete = id_sorvete;
    }

    public String getSabor() {
        return sabor;
    }
    
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
   
    public String toString(){
        return "id_sorvete: "+id_sorvete+" | sabor: "+sabor;
    }
    
}
