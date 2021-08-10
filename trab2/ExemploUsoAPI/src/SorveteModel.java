
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniv
 */
public class SorveteModel {
    
        public static void create(SorveteBean a, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO sorvete (id_sorvete, sabor) VALUES (?,?)");
            st.setInt(1, a.getId_Sorvete());
            st.setString(2, a.getSabor());
            st.execute();
            st.close();  
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT id_sorvete, sabor FROM sorvete";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new SorveteBean(result.getInt(1), result.getString(2)));
            }
        return list;
    }
    
}
