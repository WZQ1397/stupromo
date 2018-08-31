/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupromo;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class StudentEdit extends JFrame{

    JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	JPanel p6=new JPanel();
	JPanel p7=new JPanel();
	JPanel p8=new JPanel();
	JPanel p9=new JPanel();
	JPanel p10=new JPanel();
	JPanel p11=new JPanel();
	JPanel p12=new JPanel();
	
	JLabel la1=new JLabel("Stuid");
	JLabel la2=new JLabel("Name");
	JLabel la3=new JLabel("Sex");
	JLabel la4=new JLabel("Birth");
	JLabel la5=new JLabel("Grade");
	JLabel la6=new JLabel("Class");
	JLabel la7=new JLabel("Computer");
	JLabel la8=new JLabel("English");
	JLabel la9=new JLabel("Math");
	JLabel la10=new JLabel("Major");
	
	JButton b1=new JButton("Confirm");
	JButton b2=new JButton("Cancel");
	
	JTextField num=new JTextField(10);
	JTextField name=new JTextField(10);
	JTextField Computer=new JTextField(10);
	JTextField english=new JTextField(10);
	JTextField Math=new JTextField(10);
	JTextField birth=new JTextField(10);
	
	String[] sex={"","Male","Female"};
	JComboBox s=new JComboBox(sex);
	String[] grades={"","2012","2013","2014","2015","2016","2017","2018","2019"};
	JComboBox grade=new JComboBox(grades);
	String[] classes={"","1","2","3"};
	JComboBox clas=new JComboBox(classes);
	String[] majors={"","InfoManger","Network","C&S","Bigdata","AI"};
	JComboBox major=new JComboBox(majors);
	
	public StudentEdit(){
		p1.add(la1);
		p1.add(num);
		
		p2.add(la2);
		p2.add(name);
		
		p3.add(la3);
		p3.add(s);
		
		p4.add(la4);
		p4.add(birth);
		
		p5.add(la5);
		p5.add(grade);
		
		p6.add(la6);
		p6.add(clas);
		
		p7.add(la7);
		p7.add(Computer);
		
		p8.add(la8);
		p8.add(english);
		
		p9.add(la9);
		p9.add(Math);
		
		p10.add(la10);
		p10.add(major);
		
		p11.add(b1);
		p11.add(b2);
		//设计布局
		getContentPane().setLayout(new GridLayout(6,2));
		getContentPane().add(p1);
		getContentPane().add(p2);
		getContentPane().add(p3);
		getContentPane().add(p4);
		getContentPane().add(p5);
		getContentPane().add(p6);
		getContentPane().add(p7);
		getContentPane().add(p8);
		getContentPane().add(p9);
		getContentPane().add(p10);
		getContentPane().add(p11);
		getContentPane().add(p12);
		
		setBounds(500, 250, 100, 100);
		pack();
		setVisible(true);
		
	}
}

