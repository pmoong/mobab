package kmp.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import kmp.controller.Controller;

public class FindIdPage extends JPanel{
	private MainFrame mf;
	private JPanel findIdPage;
	Controller ctr = new Controller();

	
	public FindIdPage(MainFrame mf) {
		this.mf = mf;
		this.findIdPage = this;
		this.setSize(400, 700);
		this.setLayout(null);
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);
		
		//사용할 이미지 할당
		Image homeImg = new ImageIcon("images/home.png").getImage().getScaledInstance(240, 50, 0);
		Image backImg = new ImageIcon("images/back.png").getImage().getScaledInstance(80, 50, 0);
		Image mobobMain = new ImageIcon("images/mobobMain.png").getImage().getScaledInstance(260, 260, 0);
		Image fidImg = new ImageIcon("images/fID_c.png").getImage().getScaledInstance(200, 100, 0);
		Image fpwImg = new ImageIcon("images/fPwd.png").getImage().getScaledInstance(200, 100, 0);
		
		//상단 패널
		JPanel panel1 = new JPanel();
		panel1.setSize(400, 150);
		panel1.setLocation(0, 0);
		panel1.setBackground(new Color(35,212,177));

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
				ChangePanel.changePanel(mf,findIdPage, new LoginPage(mf)); 
			}
			
		});
		JButton fid = new JButton(new ImageIcon(fidImg));
		fid.setBorderPainted(false);
		fid.setContentAreaFilled(false);
		fid.setSize(200,100);
		fid.setLocation(0,50);
		
		JButton fpw = new JButton(new ImageIcon(fpwImg));
		fpw.setBorderPainted(false);
		fpw.setContentAreaFilled(false);
		fpw.setSize(200,100);
		fpw.setLocation(200, 50);
		fpw.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, findIdPage, new FindPwdPage(mf));
				
			}
		});
		panel1.add(fid);
		panel1.add(fpw);
		panel1.add(back);
		panel1.add(home);
		
		
		//하단 패널
		JPanel panel2 = new JPanel();
		panel2.setSize(400, 550);
		panel2.setLocation(0, 150);
		panel2.setBackground(backgcolor);
		
		JTextField tName = new JTextField();
		JTextField tEmail = new JTextField();
		tName.setSize(220, 40);
		tEmail.setSize(220, 40);
		tName.setLocation(120, 50);
		tEmail.setLocation(120, 120);
		panel2.add(tName);
		panel2.add(tEmail);
		

		JLabel label1 = new JLabel("이름");
		JLabel label2 = new JLabel("E-MAIL");
		label1.setSize(60,40);
		label1.setLocation(60, 50);
		panel2.add(label1);
		label2.setSize(60,40);
		label2.setLocation(60, 120);
		panel2.add(label2);
		JLabel label3 = new JLabel(new ImageIcon(mobobMain));
		label3.setSize(260, 260);
		label3.setLocation(70, 250);
		panel2.add(label3);
		
		JButton button1 = new JButton("확인");
		button1.setSize(280,60);
		button1.setLocation(60, 213);
		panel2.add(button1);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUp popup = new PopUp();
				String inputName = tName.getText();
				String inputEmail = tEmail.getText();
				if(ctr.findId(inputName, inputEmail)) {
					popup.findIdSucPopup();
				}else {
					popup.findIdFailPopup();
				}
//				ChangePanel.changePanel(mf, findIdPage, new FindIdPage(mf));
				
			}
		});
		
		
		this.add(panel1);
		this.add(panel2);
		
	}
}
