package kmp.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PopUp extends JFrame{
	
	public PopUp() {
		this.setSize(300, 150);
		this.setLayout(null);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	protected void closePage() {
		this.setVisible(false);
	}
	
	
	public void loginCheck() {
		this.setTitle("로그인 오류");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel message = new JLabel("아이디 혹은 비밀번호를 틀리셨습니다.");
		message.setSize(300, 30);
		message.setLocation(30, 20);
		JButton okButton = new JButton("확인");
		okButton.setSize(100, 30);
		okButton.setLocation(100, 80);
		message.setLayout(null);
		
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				closePage();
			}
		});
		
		
		panel.add(message);
		panel.add(okButton);
		
		this.add(panel);
		

	}

	
}
