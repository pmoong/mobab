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
	
	public void findIdSucPopup() {
		this.setTitle("아이디찾기 성공");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel Smessage = new JLabel("등록된 이메일로 ID정보를 발송했습니다.");
		Smessage.setSize(300, 30);
		Smessage.setLocation(30, 20);
		
		JButton okButton = new JButton("확인");
		okButton.setSize(100, 30);
		okButton.setLocation(100, 80);
		Smessage.setLayout(null);
		
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				closePage();
			}
		});
		
		panel.add(Smessage);
		panel.add(okButton);
		
		this.add(panel);
	}
	public void findIdFailPopup() {
		this.setTitle("아이디찾기 오류");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel Fmessage = new JLabel("해당 정보와 일치하는 아이디가 없습니다.");
		Fmessage.setSize(300, 30);
		Fmessage.setLocation(30, 20);
		
		JButton okButton = new JButton("확인");
		okButton.setSize(100, 30);
		okButton.setLocation(100, 80);
		Fmessage.setLayout(null);
		
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				closePage();
			}
		});
		
		panel.add(Fmessage);
		panel.add(okButton);
		
		this.add(panel);
		}

	public void findPwdSucPopup() {
		this.setTitle("비밀번호 찾기 성공");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel Smessage = new JLabel("등록된 이메일로 비밀번호 정보 발송했습니다.");
		Smessage.setSize(300, 30);
		Smessage.setLocation(30, 20);
		
		JButton okButton = new JButton("확인");
		okButton.setSize(100, 30);
		okButton.setLocation(100, 80);
		Smessage.setLayout(null);
		
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				closePage();
			}
		});
		
		panel.add(Smessage);
		panel.add(okButton);
		
		this.add(panel);
	}
	public void findPwdFailPopup() {
		this.setTitle("비밀번호 찾기 오류");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel Fmessage = new JLabel("해당 정보와 일치하는 비밀번호가 없습니다.");
		Fmessage.setSize(300, 30);
		Fmessage.setLocation(30, 20);
		
		JButton okButton = new JButton("확인");
		okButton.setSize(100, 30);
		okButton.setLocation(100, 80);
		Fmessage.setLayout(null);
		
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				closePage();
			}
		});
		
		panel.add(Fmessage);
		panel.add(okButton);
		
		this.add(panel);
		}
	
}
