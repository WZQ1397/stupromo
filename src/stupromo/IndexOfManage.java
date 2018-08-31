/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupromo;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class IndexOfManage extends JFrame{

    JButton b1=new JButton("Show");
	JButton b2=new JButton("Cancel");
	JButton b3=new JButton("Save");
	JTextArea text=new JTextArea(15,40);
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JScrollPane scroll=new JScrollPane(text);
	
public IndexOfManage(){
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(p1,BorderLayout.NORTH);
		getContentPane().add(scroll,BorderLayout.CENTER);
		getContentPane().add(p2,BorderLayout.SOUTH);
		
		setBounds(500, 250, 100, 100);
		pack();
		setVisible(true);
	}
}

