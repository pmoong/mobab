package kmp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kmp.view.sikdangList.BeerStorePage;

public class PopUp extends JFrame{
	BeerStorePage bd = new BeerStorePage();
	

	public PopUp() {
		this.setSize(300, 150);
		this.setLayout(null);
		this.setLocation(50, 50);
		
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
	
	public void joinCheck() {
		this.setTitle("가입 완료");
		this.setLayout(null);

		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);

		JLabel message = new JLabel("회원가입이 완료되었습니다.");
		message.setSize(300, 30);
		message.setLocation(30, 20);
		JButton okButton = new JButton("확인");
		okButton.setSize(100, 30);
		okButton.setLocation(100, 80);
		message.setLayout(null);
		
		

		panel.add(message);
		panel.add(okButton);

		this.add(panel);
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				closePage();
			}
			
		});
	}
	
	public void joinFail() {
		this.setTitle("가입 실패");
		this.setLayout(null);

		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);

		JLabel message = new JLabel("회원 정보를 전부 입력해주세요.");
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
		Smessage.setSize(320, 30);
		Smessage.setLocation(15, 20);

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
	
	public void IdCheckF() {
		this.setTitle("중복확인");
		this.setLayout(null);

		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);

		JLabel message = new JLabel("이미 존재하는 ID입니다.");
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
	
	public void IdCheckT() {
		this.setTitle("중복확인");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel message = new JLabel("사용 가능한 ID입니다.");
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
	public void IdCheckNull() {
		this.setTitle("중복확인");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel message = new JLabel("ID를 입력하세요.");
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
	
	public void PhoneCheckF() {
		this.setTitle("중복확인");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel message = new JLabel("이미 등록된 번호입니다.");
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
	
	public void PhoneCheckT() {
		this.setTitle("중복확인");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel message = new JLabel("등록 가능한 번호입니다.");
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
	public void PhoneCheckNull() {
		this.setTitle("중복확인");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		JLabel message = new JLabel("번호를 입력하세요.");
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

	
	
	
	public void CheckPay(int price) {
		this.setTitle("결제확인");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		
		JLabel message = new JLabel(price+" 원 결제를 진행하시겠습니까?");
		message.setSize(300, 30);
		message.setLocation(30, 20);
		
		JButton okButton = new JButton("확인");
		okButton.setSize(90, 30);
		okButton.setLocation(30, 80);
		message.setLayout(null);
		
		JButton noButton = new JButton("취소");
		noButton.setSize(90, 30);
		noButton.setLocation(150, 80);
		
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				closePage();
			}
		});
		
		
	
		
		
		
		noButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				closePage();
			}
		});


				
		panel.add(message);
		panel.add(okButton);
		panel.add(noButton);
		
		this.add(panel);
	}

	public void callPopUp() {
		this.setTitle("전화연결");
		this.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(300, 150);
		panel.setLayout(null);
		
		System.out.println(bd.getPrice());
		
		JLabel message = new JLabel("전화 연결하시겠습니까?");
		message.setSize(300, 30);
		message.setLocation(70, 20);
		JButton okButton = new JButton("확인");
		okButton.setSize(60, 30);
		okButton.setLocation(70, 80);
		message.setLayout(null);
		
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				closePage();
			}
		});
		
		JButton noButton = new JButton("취소");
		noButton.setSize(60, 30);
		noButton.setLocation(150, 80);
		message.setLayout(null);
				
		panel.add(message);
		panel.add(okButton);
		panel.add(noButton);
		
		this.add(panel);
	}
	


}
