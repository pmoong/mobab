package kmp.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JoinPage extends JPanel{
	private MainFrame mf;
	private JPanel joinpage;
	
	public JoinPage(MainFrame mf) {
		this.mf = mf;
		this.joinpage = this;
		Color color = new Color(234,255,236);
		Color color1 = new Color(37,212,177);
		
		this.setSize(400,700);
		Image homeImg = new ImageIcon("images/home.png").getImage().getScaledInstance(240, 50, 0);
		Image joinImg = new ImageIcon("images/join.png").getImage().getScaledInstance(400, 100, 0);
		Image backImg = new ImageIcon("images/back.png").getImage().getScaledInstance(80, 50, 0);
		
		
		JPanel panel1 = new JPanel();
		panel1.setSize(400, 150);
		panel1.setBackground(color1);
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
				ChangePanel.changePanel(mf,joinpage, new LoginPage(mf));
			}
			
		});
		
		
		panel1.add(back);
		panel1.add(home);
		JButton join = new JButton(new ImageIcon(joinImg));
		join.setSize(400,100);
		join.setLocation(0,50);
		join.setBorderPainted(false);
		join.setContentAreaFilled(false);
		
		join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf,joinpage, new JoinPage(mf));
			}
			
		});
		JPanel panel2 = new JPanel();
		panel2.setSize(400, 550);
		panel2.setLocation(0, 150);
		
		JLabel label1 = new JLabel("ID");
		JButton button3 = new JButton("중복확인");
		JTextField tf1 = new JTextField(20);
		JPasswordField password = new JPasswordField(30);
		label1.setSize(40,30);
		button3.setSize(90,30);
		tf1.setSize(180,30);
		label1.setLocation(60, 40);
		tf1.setLocation(90, 40);
		button3.setLocation(268, 40);
		JLabel label2 = new JLabel("pwd");
		password.setSize(270,30);
		label2.setSize(40,30);
		label2.setLocation(40, 80);
		password.setLocation(90, 80);
		JLabel label3 = new JLabel("이름");
		label3.setSize(40,30);
		label3.setLocation(40, 120);
		JTextField tf2 = new JTextField(20);
		tf2.setSize(270,30);
		tf2.setLocation(90, 120);
		JLabel label4 = new JLabel("이메일");
		label4.setSize(50,30);
		label4.setLocation(40, 160);
		JTextField tf3 = new JTextField(20);
		tf3.setSize(270,30);
		tf3.setLocation(90, 160);
		JLabel label5 = new JLabel("전화번호");
		JTextField tf4 = new JTextField(20);
		JButton button4 = new JButton("중복확인");
		
		label5.setSize(60,30);
		tf4.setSize(180,30);
		button4.setSize(90,30);
		label5.setLocation(30, 200);
		tf4.setLocation(90, 200);
		button4.setLocation(268, 200);
		JLabel label6 = new JLabel("학원");
		JTextField tf5 = new JTextField(20);
		label6.setSize(40,30);
		tf5.setSize(120,30);
		label6.setLocation(50, 240);
		tf5.setLocation(90, 240);
		JLabel label7 = new JLabel("반");
		JTextField tf6 = new JTextField(20);
		label7.setSize(40,30);
		tf6.setSize(120,30);
		label7.setLocation(210, 240);
		tf6.setLocation(240, 240);
		JLabel label8 = new JLabel("성별");
		JTextField tf7 = new JTextField(20);
		label8.setSize(40,30);
		tf7.setSize(120,30);
		label8.setLocation(50, 280);
		tf7.setLocation(90, 280);
		JButton button5 = new JButton("확인");
		button5.setSize(300,80);
		button5.setLocation(50, 360);
		
		panel2.setBackground(color);
		
		panel2.add(button5);
		
		panel2.add(label8);
		panel2.add(tf7);
		
		panel2.add(label7);
		panel2.add(tf6);
		
		panel2.add(label6);
		panel2.add(tf5);
		
		panel2.add(label5);
		panel2.add(tf4);
		panel2.add(button4);
		
		panel2.add(label4);
		panel2.add(tf3);
		
		panel2.add(label3);
		panel2.add(tf2);
		panel2.add(label2);
		panel2.add(password);
	
		panel1.add(join);
		panel2.add(label1);
		panel2.add(tf1);
		panel2.add(button3);
		
		this.add(panel1);
		this.add(panel2);
		mf.add(this);
		
		
		
	}
}
