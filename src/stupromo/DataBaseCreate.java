/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupromo;
import java.sql.*;
public class DataBaseCreate {

	public static Connection getConnection()throws SQLException,java.lang.ClassNotFoundException{
		String url="jdbc:mysql://localhost:3306/stupromo?useUnicode=true&characterEncoding=utf8";
		Class.forName("com.mysql.jdbc.Driver");
		String userName="root";
		Connection con=DriverManager.getConnection(url, userName, "");
		return con;
	}
}
