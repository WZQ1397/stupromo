/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupromo;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//登录界面
public class Login extends JFrame implements ActionListener{
    JButton b1=new JButton("Login");
	JButton b2=new JButton("Exit");
	JLabel la1=new JLabel("  Username： ");
	JLabel la2=new JLabel("  Password： ");
	JLabel title=new JLabel("Student Score Precdit&Manage System");

	JPanel p0=new JPanel();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();


	JTextField name=new JTextField(20);
	JPasswordField pw=new JPasswordField(20);
	public Login(){

		b1.setBackground(Color.LIGHT_GRAY);
		b1.setSize(20,50);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setSize(20,50);
		title.setForeground(Color.red);
		title.setFont(new   java.awt.Font("Dialog",   1,   15));
		setTitle("Student Score Precdit&Manage System");
		getContentPane().setLayout(new GridLayout(4,1,2,2));
		getContentPane().add(p0);
		getContentPane().add(p1);
		getContentPane().add(p2);
		getContentPane().add(p3);

		p3.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
		p0.add(title);
		p1.add(la1);
		p1.add(name);
		p2.add(la2);
		p2.add(pw);
		p3.add(b1);
		p3.add(b2);
		setBounds(500, 250, 500, 100);
		pack();
		setResizable(false);
		setVisible(true);
		pw.setEchoChar('*');
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
	
		if(e.getActionCommand()=="Login"){
			String password=pw.getText();
			String user=name.getText();
			if(user.equals("zach") && password.equals("zach")){
				Function function=new Function();
				function.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(false);
			}
			else{
				JOptionPane.showMessageDialog(null, "Fault Username or Password!", "Error", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(e.getActionCommand()=="Exit"){
			System.exit(0);
		}
	}
	
}
