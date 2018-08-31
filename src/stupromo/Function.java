/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupromo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Function extends JFrame implements ActionListener{
    JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p6=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	SpecBtn add=new SpecBtn("AddStudent");
	SpecBtn del=new SpecBtn("DeleteStudent");
	SpecBtn look=new SpecBtn("ShowAll");
	SpecBtn b11=new SpecBtn("FindByGrade");
	SpecBtn b12=new SpecBtn("FindByClass");
	JLabel la1=new JLabel("StudentManage");
	JLabel la2=new JLabel("ScoreManage");
	JLabel la3=new JLabel("Search Student");
	SpecBtn b1=new SpecBtn("SubjectScoreRanking");
	SpecBtn b2=new SpecBtn("TotalScoreRanking");


	
	public Function(){
//		ImageIcon bgpng = new ImageIcon("../pic/bg.jpg");
//		JLabel bglbl = new JLabel(bgpng);
//		bglbl.setBounds(0, 0, bgpng.getIconWidth(),
//				bgpng.getIconHeight());
		JPanel ImgPanel = (JPanel) getContentPane();
		setTitle("Student Score Precdit&Manage System");

		ImgPanel.setLayout(new GridLayout(7,1));
		ImgPanel.setOpaque(false);
		ImgPanel.add(p1);
		ImgPanel.add(p2);
		ImgPanel.add(p6);
		ImgPanel.add(p3);
		ImgPanel.add(p4);
		ImgPanel.add(p5);
//		getLayeredPane().add(bglbl,Integer.MAX_VALUE);
//		setSize(bgpng.getIconWidth(), bgpng.getIconHeight());
		p1.add(la1);
		p2.add(add);
		p2.add(del);
		p6.add(la3);
		p3.add(look);
		p3.add(b11);
		p3.add(b12);
		p4.add(la2);
		p5.add(b1);
		p5.add(b2);
//		getLayeredPane().setLayout(null);
//		getLayeredPane().add(bglbl,0);
	    setBounds(500, 250, 100, 100);
//		setSize(bgpng.getIconWidth(),bgpng.getIconHeight());
		pack();
		//setResizable(false);
		setVisible(true);
		
		add.addActionListener(this);
		del.addActionListener(this);
		look.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="AddStudent"){
			AddStudent addStudent =new AddStudent();
		}
		else if(e.getActionCommand()=="ShowAll"){
			LookAllStudents look=new LookAllStudents();
		}
		else if(e.getActionCommand()=="FindByClass"){
			IndexOfClass ic=new IndexOfClass();
		}
		else if(e.getActionCommand()=="TotalScoreRanking"){
			//TotalScoreRanking subject= new TotalScoreRanking();
		}
		else if(e.getActionCommand()=="Return"){
			setVisible(false);
			Login login=new Login();
			login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(e.getActionCommand()=="Exit"){
			System.exit(0);
		}
	}

}
