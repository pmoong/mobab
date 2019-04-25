package kmp.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FindIdPage extends JPanel{
	private MainFrame mf;
	private JPanel findIdPage;
	
	public FindIdPage(MainFrame mf) {
		this.mf = mf;
		this.findIdPage = this;
		this.setSize(400, 700);
		this.setLayout(null);
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);
		
		
		Image homeImg = new ImageIcon("images/home.png").getImage().getScaledInstance(240, 50, 0);
		Image backImg = new ImageIcon("images/back.png").getImage().getScaledInstance(80, 50, 0);
		Image mobobMain = new ImageIcon("images/mobobMain.png").getImage().getScaledInstance(500, 500, 0);
		Image fidImg = new ImageIcon("images/fID_c.png").getImage().getScaledInstance(200, 100, 0);
		
		JPanel panel1 = new JPanel();
		panel1.setSize(400, 150);
		panel1.setLocation(0, 0);

		JButton back = new JButton(new ImageIcon(backImg));
		back.setSize(80,50);
		back.setLocation(0,0);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);

		JButton home = new JButton(new ImageIcon(homeImg));
		home.setSize(240,50);
		home.setLocation(80,0);
		home.setBorderPainted(false);
		home.setContentAreaFilled(false);
		home.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf,findIdPage, new MainPage(mf));
			}
			
		});
		JButton idv = new JButton(new ImageIcon(fidImg));
		idv.setBorderPainted(false);
		idv.setContentAreaFilled(false);
		idv.setSize(200,100);
		idv.setLocation(0,50);
		
		panel1.add(idv);
		panel1.add(back);
		panel1.add(home);
		this.add(panel1);
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setSize(400, 550);
		panel2.setLocation(0, 150);
		panel2.setBackground(backgcolor);
		
		JTextField tname = new JTextField(20);
		JTextField email = new JTextField(20);
		tname.setSize(220,40);
		email.setSize(220,40);
		tname.setLocation(120,50);
		email.setLocation(120, 110);
		panel2.add(tname);
		panel2.add(email);
		
		JButton button1 = new JButton("확인");
		button1.setSize(220,50);
		button1.setLocation(60, 170);
		panel2.add(button1);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf,findIdPage, new MainPage(mf));
				
			}
		});
		this.add(panel2);
	}
}
