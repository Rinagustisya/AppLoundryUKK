/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apploundryukk;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class koneksi {
    public String url = "jdbc:mysql://localhost/loundry";
    public String user = "root";
    public String pass = "";
    public Connection con;
    public void connect() {
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR KONEKSI KE DATABASE:\n" +e);
        }
    }
    
    public Connection getCon() {
        return con;
    }
}
