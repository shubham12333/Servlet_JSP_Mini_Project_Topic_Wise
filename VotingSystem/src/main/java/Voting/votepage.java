package Voting;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class votepage extends JFrame
{
	votepage()
	{
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/ShivSena.png"));
		Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(50,50,400,300);
		add(l1);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/ShivSena.png"));
		Image i5 = i4.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel l2 = new JLabel(i6);
		l2.setBounds(50,50,400,300);
		add(l1);
		
		setBounds(0,0,1600,700);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		 new votepage();
	}
}
