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

public class LoginPage extends JPanel{
	private MainFrame mf;
	private JPanel loginPage;

	public LoginPage(MainFrame mf) {
		this.mf = mf;
		this.loginPage = this;
		this.setSize(400, 700);		
		this.setLayout(null);
		Color color = new Color(234,255,236);
		
			
		//�긽�떒 硫붿씤�씠誘몄�
		JPanel panel1= new JPanel();
		panel1.setSize(400, 300);
		panel1.setLocation(0, 0);
		panel1.setBackground(color);

		Image mobobMain = new ImageIcon("images/mobobMain.png").getImage().getScaledInstance(300, 300, 0);
		JLabel mobob = new JLabel(new ImageIcon(mobobMain));
		mobob.setLocation(50, 0);
		panel1.add(mobob);
		
		//以묎컙 濡쒓렇�씤李�
		JPanel panel2= new JPanel();
		panel2.setSize(400, 400);
		panel2.setLocation(0, 300);
		panel2.setLayout(null);
		
		panel2.setBackground(color);
		Image login_ID = new ImageIcon("images/login_ID.png").getImage().getScaledInstance(60, 40, 0);
		JLabel label1 = new JLabel(new ImageIcon(login_ID));
		Image login_Pwd = new ImageIcon("images/login_Pwd.png").getImage().getScaledInstance(60, 40, 0);
		JLabel label2 = new JLabel(new ImageIcon(login_Pwd));
		JTextField tf = new JTextField();
		JPasswordField password = new JPasswordField();
		label1.setSize(60,40);
		label1.setLocation(60, 50);
		panel2.add(label1);
		label2.setSize(60,40);
		label2.setLocation(60, 100);
		panel2.add(label2);
		tf.setSize(220,40);
		password.setSize(220,40);
		panel2.add(tf);
		tf.setLocation(120,50);
		password.setLocation(120, 100);
		panel2.add(password);
	
		
		//�븯�떒 踰꾪듉
		JButton button1 = new JButton("濡쒓렇�씤");
		JButton button2 = new JButton("ID/PWD 李얘린");
		JButton button3 = new JButton("�쉶�썝媛��엯");
		button1.setSize(120,50);
		button1.setLocation(60, 170);
		button2.setSize(120,50);
		button2.setLocation(220, 170);
		button3.setSize(280,50);
		button3.setLocation(60,250);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf,loginPage, new MainPage(mf));
				
			}
		});
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, loginPage, new JoinPage(mf));
				
			}
		});

		this.add(panel1);
		this.add(panel2);


		

		mf.add(this);
	}

}
