/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Allanderson Nunes
 */
public class ConnectionFactory {

    Connection conexao = null;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/sap";
    private String root = "root";
    private String senha = "2408";

    public Connection getConnectionFactory() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, root, senha);
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            System.out.println(sqlex);
        } catch (ClassNotFoundException cfe) {
            cfe.printStackTrace();
            System.out.println(cfe);
        }
        return conexao = new ConnectionFactory().getConnectionFactory();
    }
}
