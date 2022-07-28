/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotoin.com;

import com.sun.jndi.ldap.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adhim
 */
public class jumlahRow implements count {

    dbConnection dbcon = new dbConnection();
    java.sql.Connection con = dbcon.getConnection();
    @Override
    public String countRow() {
        try {
            Statement st = con.createStatement();
            String query = "SELECT count(*) FROM admin";
            ResultSet rs = st.executeQuery(query);
            rs.next();
            int count = rs.getInt(1);
            
            return String.valueOf(count);
        } catch (SQLException ex) {
            Logger.getLogger(jumlahRow.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
    
}
