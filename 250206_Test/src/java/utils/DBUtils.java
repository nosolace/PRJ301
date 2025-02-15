/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DBUtils {

    private static String DB_Name = "UserDB";
    private static String DB_Username = "sa";
    private static String DB_Password = "12345";

    // Có thể tạo Unicode ngay đây để dễ thực hiên N'' hơn
    public static String preUni(String name) {
        return "N'" + name + "'";
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" + DB_Name;
        conn = DriverManager.getConnection(url, DB_Username, DB_Password);
        return conn;
    }

    public static String insertInto(String table, String value) {
        return "INSERT INTO " + table + " VALUES (" + value + ")";
    }

    public static void main(String[] args) {
        try {
            Connection c = getConnection();
            System.out.println(c);
            String table = "Users (username,password)";
            String value = preUni("sf555draven") + "," + preUni("kamsezoko");
            String sql = insertInto(table, value);
            System.out.println(sql);
            Statement st = c.createStatement();
            int i = st.executeUpdate(sql);
            System.out.println(i);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
