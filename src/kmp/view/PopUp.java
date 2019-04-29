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
		this.setTitle("�α��� ����");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel message = new JLabel("���̵� Ȥ�� ��й�ȣ�� Ʋ���̽��ϴ�.");
		message.setSize(300, 30);
		message.setLocation(30, 20);
		JButton okButton = new JButton("Ȯ��");
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
		this.setTitle("���̵�ã�� ����");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel Smessage = new JLabel("��ϵ� �̸��Ϸ� ID������ �߼��߽��ϴ�.");
		Smessage.setSize(300, 30);
		Smessage.setLocation(30, 20);
		
		JButton okButton = new JButton("Ȯ��");
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
		this.setTitle("���̵�ã�� ����");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel Fmessage = new JLabel("�ش� ������ ��ġ�ϴ� ���̵� �����ϴ�.");
		Fmessage.setSize(300, 30);
		Fmessage.setLocation(30, 20);
		
		JButton okButton = new JButton("Ȯ��");
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
		this.setTitle("��й�ȣ ã�� ����");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel Smessage = new JLabel("��ϵ� �̸��Ϸ� ��й�ȣ ���� �߼��߽��ϴ�.");
		Smessage.setSize(300, 30);
		Smessage.setLocation(30, 20);
		
		JButton okButton = new JButton("Ȯ��");
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
		this.setTitle("��й�ȣ ã�� ����");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel Fmessage = new JLabel("�ش� ������ ��ġ�ϴ� ��й�ȣ�� �����ϴ�.");
		Fmessage.setSize(300, 30);
		Fmessage.setLocation(30, 20);
		
		JButton okButton = new JButton("Ȯ��");
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
