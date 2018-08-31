package stupromo;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LookAllStudents extends IndexOfManage implements ActionListener{

    public LookAllStudents(){
		
		super();
		//注册监听
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		pack();
		setVisible(true);
	}
public void actionPerformed(ActionEvent e) {
	if(e.getActionCommand()=="Show"){
		b1.setEnabled(false);
		try{
			Connection con=DataBaseCreate.getConnection();
			Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=sql.executeQuery("select * from student");
			text.append("WholeStudentInfo:\r\n");
			text.append("Stuid                Name                Sex                Birth                Major                         Grade                Class                Computer                        English                        Math                        TotalScore\r\n");
			while(rs.next()){
				text.append(rs.getString("Num")+"           "+rs.getString("Name")+"           "+rs.getString("Sex")+"           "+rs.getString("Birth")+"           "+rs.getString("Major")
						+"              "+rs.getString("Grade")+"                      "+rs.getString("Class")+
						"                      "+rs.getFloat("Computer")+"                      "+rs.getFloat("English")
						+"                      "+rs.getFloat("Math")+"                      "+rs.getFloat("Total")+"\r\n");
			}
			
			
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

