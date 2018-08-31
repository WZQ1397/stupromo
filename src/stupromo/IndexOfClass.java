/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupromo;

import java.awt.BorderLayout;//布局管理器之边界布局
import java.awt.event.ActionEvent;//包含用于创建用户界面和绘制图形图像的所有类
import java.awt.event.ActionListener;//关于事件处理的一个接口，监听器
import java.sql.Connection;//与数据库连接的类
import java.sql.ResultSet;//ResultSet 对象具有指向其当前数据行的指针,默认的 ResultSet 对象不可更新，仅有一个向前移动的指针;
                          //ResultSet 对象的列的编号、类型和属性由 ResultSet.getMetaData 方法Return的 ResulSetMetaData 对象提供。
import java.sql.SQLException;//无效的列索引
import java.sql.Statement;//是 Java 执行数据库操作的一个重要方法，用于在已经建立数据库连接的基础上，向数据库发送要执行的SQL语句。
                         //Statement对象，用于执行不带参数的简单SQL语句。

import javax.swing.JButton;//建立一个按钮；Button是在java.awt.*中的,JButton是在javax.swing.*中的,swing类是awt的一个扩展
import javax.swing.JComboBox;//Show一个项列表,扩展的是ListModel接口的模型,它的Show绘制器通过实现ListCellBenderer接口来绘制列表下拉列表
                             //JComboBox类是一个组件，它结合了一个按钮或可编辑字段与下拉列表
import javax.swing.JFrame;//创建一个窗口
import javax.swing.JLabel;//Show文本
import javax.swing.JOptionPane;//构建使用消息提示框
import javax.swing.JPanel;//利用JPanel可以使版面的排列方式更生动
import javax.swing.JScrollPane;//滚动面板
import javax.swing.JTextArea;//Show文本

public class IndexOfClass extends IndexOfManage implements ActionListener{

    String[] classes={"","1","2","3"};
	JComboBox clas=new JComboBox(classes);
	JLabel la=new JLabel("Select Which Class");
	
public IndexOfClass(){
		
		super();
		p1.add(la);
		p1.add(clas);
		//注册监听
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		pack();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="Show"){
			text.setText("");
			
			if(clas.getSelectedItem().equals("")){
				JOptionPane.showMessageDialog(null, "Can`t find this Class", "Message",
						JOptionPane.INFORMATION_MESSAGE);
			}
			else
			try{
				Connection con=DataBaseCreate.getConnection();
				Statement sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet rs=sql.executeQuery("select * from student where Class like '%"+clas.getSelectedItem()+"%'");
				text.append("School"+clas.getSelectedItem()+"ClassStudentInfo:\r\n");
				text.append("Stuid                Name                Sex               Birth                Major                     Grade                Class                Computer                        English                        Math                        TotalScore\r\n");
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
