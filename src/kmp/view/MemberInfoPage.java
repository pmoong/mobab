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

import kmp.model.vo.Member;

public class MemberInfoPage extends JPanel {
	private MainFrame mf;
	private JPanel memberInfoPage;
	
	public MemberInfoPage(MainFrame mf) {
		this.mf = mf;
		this.memberInfoPage = this;
		this.setSize(400, 700);
		this.setLayout(null);
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);
		
		//사용할 이미지 할당
		Image homeImg = new ImageIcon("images/home.png").getImage().getScaledInstance(240, 50, 0);
		Image sikImg = new ImageIcon("images/mRestaurant.png").getImage().getScaledInstance(100, 100, 0);
		Image favoriteImg = new ImageIcon("images/mFavorites.png").getImage().getScaledInstance(100, 100, 0);
		Image chartImg = new ImageIcon("images/mChart.png").getImage().getScaledInstance(100, 100, 0);
		Image chargeImg = new ImageIcon("images/mCharge.png").getImage().getScaledInstance(100, 100, 0);
		Image userinfoImg = new ImageIcon("images/user_c.png").getImage().getScaledInstance(80, 50, 0);
		Image backImg = new ImageIcon("images/back.png").getImage().getScaledInstance(80, 50, 0);
		
		Image academyImg = new ImageIcon("images/academy.png").getImage().getScaledInstance(60, 30, 0);
		Image classroomImg = new ImageIcon("images/classroom.png").getImage().getScaledInstance(20, 30, 0);
		Image emailImg = new ImageIcon("images/email.png").getImage().getScaledInstance(60, 30, 0);
		Image genderImg = new ImageIcon("images/gender.png").getImage().getScaledInstance(60, 30, 0);
		Image idImg = new ImageIcon("images/id.png").getImage().getScaledInstance(60, 30, 0);
		Image nameImg = new ImageIcon("images/name.png").getImage().getScaledInstance(60, 30, 0);
		Image phoneNumImg = new ImageIcon("images/phoneNum.png").getImage().getScaledInstance(60, 30, 0);
		Image pwdImg = new ImageIcon("images/pwd.png").getImage().getScaledInstance(60, 30, 0);
		Image userInfo = new ImageIcon("images/userInfo.png").getImage().getScaledInstance(360, 50, 0);
		
		
		//상단 패널
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
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf,memberInfoPage, new MainPage(mf));
			}
		});
		
		JButton infor = new JButton(new ImageIcon(userinfoImg));
		infor.setSize(80,50);
		infor.setLocation(320,0);
		infor.setBorderPainted(false);
		infor.setContentAreaFilled(false);
		infor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, memberInfoPage, new MemberInfoPage(mf));
			}
			
		});
		
		panel1.add(back);
		panel1.add(home);
		panel1.add(infor);
		JButton sik = new JButton(new ImageIcon(sikImg));
		sik.setSize(100,100);
		sik.setLocation(0,50);
		sik.setBorderPainted(false);
		sik.setContentAreaFilled(false);
		sik.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf,memberInfoPage, new SikdangPage(mf));
			}
		});
		JButton fav = new JButton(new ImageIcon(favoriteImg));
		fav.setSize(100,100);
		fav.setLocation(100,50);
		fav.setBorderPainted(false);
		fav.setContentAreaFilled(false);
		fav.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, memberInfoPage, new FavoritePage(mf));

			}
		});
		
		JButton hist = new JButton(new ImageIcon(chartImg));
		hist.setSize(100,100);
		hist.setLocation(200,50);
		hist.setBorderPainted(false);
		hist.setContentAreaFilled(false);
		fav.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, memberInfoPage, new FavoritePage(mf));

			}
		});
		
		JButton charg = new JButton(new ImageIcon(chargeImg));
		charg.setSize(100,100);
		charg.setLocation(300,50);
		charg.setBorderPainted(false);
		charg.setContentAreaFilled(false);
		charg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, memberInfoPage, new ChargePage(mf));

			}
		});
		
		panel1.add(sik);
		panel1.add(fav);
		panel1.add(hist);
		panel1.add(charg);
		
		//하단패널
		JPanel panel2 = new JPanel();
		panel2.setSize(400, 550);
		panel2.setLocation(0, 150);
		panel2.setBackground(backgcolor);
		
		JPanel panel3 = new JPanel();
		panel3.setSize(340, 420);
		panel3.setLocation(30, 80);
		panel3.setBackground(color.WHITE);
		
		//회원정보 아이콘 
		JLabel userInfoIcon = new JLabel(new ImageIcon(userInfo));
		userInfoIcon.setSize(360, 50);
		userInfoIcon.setLocation(20, 20);
		
//		JButton userInfoinfoText = new JButton("회원 정보");
//		infoText.setSize(360, 50);
//		infoText.setLocation(20, 20);
////		infoText.setContentAreaFilled(false);
//		infoText.setBackground(backgcolor);
	
		//id정보

		JLabel idIcon = new JLabel(new ImageIcon(idImg));
		JTextField idInfo = new JTextField();
		idIcon.setSize(60,30);
		idInfo.setSize(270,30);
		idIcon.setLocation(5, 20);
		idInfo.setLocation(65, 20);
		
		//pwd정보
		JLabel pwdIcon = new JLabel(new ImageIcon(pwdImg));
		JTextField pwdInfo = new JTextField();
		pwdIcon.setSize(60,30);
		pwdInfo.setSize(270,30);
		pwdIcon.setLocation(5, 80);
		pwdInfo.setLocation(65, 80);
		
		//이름정보
		JLabel nameIcon = new JLabel(new ImageIcon(nameImg));
		JTextField nameInfo = new JTextField(30);
		nameIcon.setSize(60, 30);
		nameInfo.setSize(270, 30);
		nameIcon.setLocation(5, 140);
		nameInfo.setLocation(65, 140);
		
		//이메일 정보
		JLabel emailIcon = new JLabel(new ImageIcon(emailImg));
		JTextField emailInfo = new JTextField(30);
		emailIcon.setSize(60, 30);
		emailInfo.setSize(270, 30);
		emailIcon.setLocation(5, 200);
		emailInfo.setLocation(65, 200);
		
		//전화번호 정보
		JLabel phoneNumIcon = new JLabel(new ImageIcon(phoneNumImg));
		JTextField phoneNumInfo = new JTextField(30);
		phoneNumIcon.setSize(60, 30);
		phoneNumInfo.setSize(270, 30);
		phoneNumIcon.setLocation(5, 260);
		phoneNumInfo.setLocation(65, 260);
		
		//학원정보
		JLabel academyIcon = new JLabel(new ImageIcon(academyImg));
		JTextField academyInfo = new JTextField(20);
		academyIcon.setSize(60, 30);
		academyInfo.setSize(120, 30);
		academyIcon.setLocation(5, 320);
		academyInfo.setLocation(65, 320);
		
		//반정보
		JLabel classroomIcon = new JLabel(new ImageIcon(classroomImg));
		JTextField classroomInfo = new JTextField(20);
		classroomIcon.setSize(30, 30);
		classroomInfo.setSize(120, 30);
		classroomIcon.setLocation(190, 320);
		classroomInfo.setLocation(215, 320);

		//성별정보
		JLabel genderIcon = new JLabel(new ImageIcon(genderImg));
		JTextField genderInfo = new JTextField(20);
		genderIcon.setSize(60, 30);
		genderInfo.setSize(120, 30);
		genderIcon.setLocation(5, 380);
		genderInfo.setLocation(65, 380);
		
		
		
		
		panel3.add(idIcon);
		panel3.add(idInfo);
		panel3.add(pwdIcon);
		panel3.add(pwdInfo);
		panel3.add(nameIcon);
		panel3.add(nameInfo);
		panel3.add(emailIcon);
		panel3.add(emailInfo);
		panel3.add(phoneNumIcon);
		panel3.add(phoneNumInfo);
		panel3.add(academyIcon);
		panel3.add(academyInfo);
		panel3.add(classroomIcon);
		panel3.add(classroomInfo);
		panel3.add(genderIcon);
		panel3.add(genderInfo);
		
		
		
		panel2.add(userInfoIcon);
		panel2.add(panel3);
		this.add(panel1);
		this.add(panel2);
		mf.add(this);

		
	}


}
