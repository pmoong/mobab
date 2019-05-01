package kmp.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import kmp.view.PopUp;

import kmp.controller.Controller;

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

		Image academyImg = new ImageIcon("images/academy.png").getImage().getScaledInstance(60, 30, 0);
		Image classroomImg = new ImageIcon("images/classroom.png").getImage().getScaledInstance(20, 30, 0);
		Image emailImg = new ImageIcon("images/email.png").getImage().getScaledInstance(60, 30, 0);
		Image genderImg = new ImageIcon("images/gender.png").getImage().getScaledInstance(60, 30, 0);
		Image idImg = new ImageIcon("images/id.png").getImage().getScaledInstance(60, 30, 0);
		Image nameImg = new ImageIcon("images/name.png").getImage().getScaledInstance(60, 30, 0);
		Image phoneNumImg = new ImageIcon("images/phoneNum.png").getImage().getScaledInstance(60, 30, 0);
		Image pwdImg = new ImageIcon("images/pwd.png").getImage().getScaledInstance(60, 30, 0);


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


//		panel1.add(back);
		panel1.add(home);
		panel1.setBackground(color);
		
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

		JLabel label1 = new JLabel(new ImageIcon(idImg));
		JButton button3 = new JButton("중복확인");
		JTextField tf1 = new JTextField();
		

		button3.addActionListener(new ActionListener() {

			String id;
			//
			@Override
			public void actionPerformed(ActionEvent e) {
				//
				id = new String(tf1.getText());
				System.out.println(id);
		
				Controller ct = new Controller();
				if(id.isEmpty()) {
					PopUp pu = new PopUp();
					pu.IdCheckNull();
				}else if(ct.isDuplicatedId(id)) {
					PopUp pu = new PopUp();
					pu.IdCheckF();
				}else{
					PopUp pu = new PopUp();
					pu.IdCheckT();		
				}

			}
		});


		JPasswordField password = new JPasswordField();
		label1.setSize(60,30);
		button3.setSize(90,30);
		tf1.setSize(180,30);
		label1.setLocation(30, 40);
		tf1.setLocation(90, 40);
		button3.setLocation(268, 40);

		JLabel label2 = new JLabel(new ImageIcon(pwdImg));
		password.setSize(270,30);
		label2.setSize(60,30);
		label2.setLocation(30, 80);
		password.setLocation(90, 80);

		JLabel label3 = new JLabel(new ImageIcon(nameImg));
		label3.setSize(60,30);
		label3.setLocation(30, 120);
		JTextField tf2 = new JTextField();
		tf2.setSize(270,30);
		tf2.setLocation(90, 120);

		JLabel label4 = new JLabel(new ImageIcon(emailImg));
		label4.setSize(60,30);
		label4.setLocation(30, 160);
		JTextField tf3 = new JTextField();
		tf3.setSize(270,30);
		tf3.setLocation(90, 160);
 
		JLabel label5 = new JLabel(new ImageIcon(phoneNumImg));
		JTextField tf4 = new JTextField();
		JButton button4 = new JButton("중복확인");
		button4.addActionListener(new ActionListener() {

			String phone;
			//
			@Override
			public void actionPerformed(ActionEvent e) {
				//JTextField
				phone = new String(tf4.getText());
		
				Controller ct = new Controller();

				if(phone.isEmpty()) {
					PopUp pu = new PopUp();
					pu.PhoneCheckNull();
				}else if(ct.isDuplicatedPhone(phone)) {
					PopUp pu = new PopUp();
					pu.PhoneCheckF();
				}else {
					PopUp pu = new PopUp();
					pu.PhoneCheckT();

				}

			}
		});
		label5.setSize(60,30);
		tf4.setSize(180,30);
		button4.setSize(90,30);
		label5.setLocation(30, 200);
		tf4.setLocation(90, 200);
		button4.setLocation(268, 200);

		JLabel label6 = new JLabel(new ImageIcon(academyImg));
		JTextField tf5 = new JTextField();
		label6.setSize(60,30);
		tf5.setSize(120,30);
		label6.setLocation(30, 240);
		tf5.setLocation(90, 240);

		JLabel label7 = new JLabel(new ImageIcon(classroomImg));
		JTextField tf6 = new JTextField();
		label7.setSize(20,30);
		tf6.setSize(120,30);
		label7.setLocation(220, 240);
		tf6.setLocation(240, 240);

		JLabel label8 = new JLabel("나이");
		//		JTextField tf7 = new JTextField();
		String ages[] = new String[30];
		int age1=20;
		for(int i=0;i<ages.length;i++) {
			ages[i]=age1+"";
			age1++;
		}
		JComboBox ageBox = new JComboBox(ages);
		ageBox.setSelectedItem(0);
		label8.setSize(60,30);
		ageBox.setSize(120,30);
		label8.setLocation(30, 280);
		ageBox.setLocation(90, 280);

		JLabel gendlabel = new JLabel(new ImageIcon(genderImg));
		String[] genders = {"남","여"};
		JComboBox gender1 = new JComboBox(genders);
		gender1.setSelectedIndex(0);
		gender1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});
		gendlabel.setHorizontalAlignment(JLabel.CENTER);
		gendlabel.setSize(60,30);
		gender1.setSize(80,30);
		gendlabel.setLocation(220, 280);
		gender1.setLocation(280, 280);
		
		JButton button5 = new JButton("회원가입");
	
		
		
		
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Controller ctr = new Controller();
				String id = tf1.getText();
				String pwd = new String(password.getPassword());
				String name = tf2.getText();
				String email = tf3.getText();
				String phone = tf4.getText();
				int age = Integer.parseInt((String) ageBox.getSelectedItem());
				String academy = tf5.getText();
				String cla = tf6.getText();
				String gen = (String)gender1.getSelectedItem();
				char gender = gen.charAt(0);

				
				if(id.isEmpty() || pwd.isEmpty() || name.isEmpty() || email.isEmpty() || phone.isEmpty() || age == 0 ||
						academy.isEmpty() || tf6.getText().isEmpty() || gen.isEmpty()) {
					
					PopUp pu = new PopUp();
					pu.joinFail();
					
				}else {
					char classroom = cla.charAt(0);
					ctr.join(id, pwd, name, email, phone, age, academy, classroom, gender);
					ChangePanel.changePanel(mf,joinpage, new LoginPage(mf));
					PopUp pu = new PopUp();
					pu.joinCheck();
					
				}




			}
			
		});
		

		button5.setSize(300,80);
		button5.setLocation(50, 360);

		panel2.setBackground(color);

		panel2.add(button5);
		panel2.add(gendlabel);
		panel2.add(gender1);
		
		panel2.add(label8);
		panel2.add(ageBox);

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
