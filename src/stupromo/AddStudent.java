/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupromo;

import java.awt.event.*;
import java.sql.*;

import javax.swing.JOptionPane;

public class AddStudent extends StudentEdit implements ActionListener{

    public AddStudent(){
		super();
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="OK"){

			float total=Float.parseFloat(Computer.getText())+Float.parseFloat(english.getText())+Float.parseFloat(Math.getText());
			
			try{

				Connection con=DataBaseCreate.getConnection();
				Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

				sql.executeUpdate("insert into student(Num,Name,Sex,Grade,Class,Major,Birth,Computer,English,Math,Total)" +
						" values('"+num.getText()+"','"+name.getText()+"','"+s.getSelectedItem()+
						"','"+grade.getSelectedItem()+"','"+clas.getSelectedItem()+"','"+major.getSelectedItem()+
						"','"+birth.getText()+"',"+Computer.getText()+","+english.getText()+","+Math.getText()+","+total+")");

				sql.close();
				con.close();
				JOptionPane.showMessageDialog(null, "Record Success!", "Message",
						JOptionPane.INFORMATION_MESSAGE);
				setVisible(false);
				
			}catch(java.lang.ClassNotFoundException err){

				JOptionPane.showMessageDialog(null, err.getMessage(), "ClassNotFoundException:",
						JOptionPane.INFORMATION_MESSAGE);
			}catch (SQLException ex){
				JOptionPane.showMessageDialog(null, ex.getMessage(), "SQLException: ", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(e.getActionCommand()=="Cancel"){
			setVisible(false);
		}
	}

}

