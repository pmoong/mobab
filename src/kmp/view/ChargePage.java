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

public class ChargePage extends JPanel {
	private MainFrame mf;
	private JPanel chargePage;
	
	public ChargePage(MainFrame mf) {
		this.mf = mf;
		this.chargePage = this;
		this.setSize(400, 700);
		this.setLayout(null);
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);
		

		//사용할 이미지 할당
		Image homeImg = new ImageIcon("images/home.png").getImage().getScaledInstance(240, 50, 0);
		Image sikImg = new ImageIcon("images/mRestaurant.png").getImage().getScaledInstance(100, 100, 0);
		Image favoriteImg = new ImageIcon("images/mFavorites.png").getImage().getScaledInstance(100, 100, 0);
		Image chartImg = new ImageIcon("images/mChart.png").getImage().getScaledInstance(100, 100, 0);
		Image chargeImg = new ImageIcon("images/mCharge_c.png").getImage().getScaledInstance(100, 100, 0);
		Image userinfoImg = new ImageIcon("images/user.png").getImage().getScaledInstance(80, 50, 0);
		Image backImg = new ImageIcon("images/back.png").getImage().getScaledInstance(80, 50, 0);
		Image cashImg = new ImageIcon("images/cash.png").getImage().getScaledInstance(60, 60, 0);
		Image chargeMoneyImg = new ImageIcon("images/chargeMoney.png").getImage().getScaledInstance(60, 60, 0);
		Image allMoneyImg = new ImageIcon("images/allMoney.png").getImage().getScaledInstance(60, 60, 0);
		Image money1Img = new ImageIcon("images/money_50000.png").getImage().getScaledInstance(75, 20, 0);
		Image money2Img = new ImageIcon("images/money_30000.png").getImage().getScaledInstance(75, 20, 0);
		Image money3Img = new ImageIcon("images/money_10000.png").getImage().getScaledInstance(75, 20, 0);
		Image money4Img = new ImageIcon("images/money_5000.png").getImage().getScaledInstance(75, 20, 0);
		
		
		
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
				ChangePanel.changePanel(mf,chargePage, new MainPage(mf));
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
				ChangePanel.changePanel(mf, chargePage, new MemberInfoPage(mf));
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
				ChangePanel.changePanel(mf,chargePage, new SikdangPage(mf));
			}
			
		});
		
		JButton fav = new JButton(new ImageIcon(favoriteImg));
		fav.setSize(100,100);
		fav.setLocation(100,50);
		fav.setBorderPainted(false);
		fav.setContentAreaFilled(false);

		
		JButton hist = new JButton(new ImageIcon(chartImg));
		hist.setSize(100,100);
		hist.setLocation(200,50);
		hist.setBorderPainted(false);
		hist.setContentAreaFilled(false);

		
		JButton charge = new JButton(new ImageIcon(chargeImg));
		charge.setSize(100,100);
		charge.setLocation(300,50);
		charge.setBorderPainted(false);
		charge.setContentAreaFilled(false);

		charge.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, chargePage, new ChargePage(mf));
				
			}
		});
		
		
		panel1.add(sik);
		panel1.add(fav);
		panel1.add(hist);
		panel1.add(charge);
		
		

		//하단패널
		JPanel panel2 = new JPanel();
		panel2.setSize(400, 550);
		panel2.setLocation(0, 150);
		panel2.setBackground(backgcolor);
		
		JLabel cash = new JLabel(new ImageIcon(cashImg));
		cash.setSize(60, 60);
		cash.setLocation(40, 20);

		JTextField cashInt = new JTextField("잔액");
		cashInt.setEditable(false);	
		cashInt.setSize(260, 60);
		cashInt.setLocation(100, 20);
		
		JLabel chargeMoney = new JLabel(new ImageIcon(chargeMoneyImg));
		chargeMoney.setSize(60, 60);
		chargeMoney.setLocation(40, 120);

		JTextField chargeMoneyInt = new JTextField("충전금액");
		chargeMoneyInt.setEditable(false);	
		chargeMoneyInt.setSize(260, 60);
		chargeMoneyInt.setLocation(100, 120);
		
		JLabel allMoney = new JLabel(new ImageIcon(allMoneyImg));
		allMoney.setSize(60, 60);
		allMoney.setLocation(40, 230);

		JTextField allMoneyInt = new JTextField("총액");
		allMoneyInt.setEditable(false);	
		allMoneyInt.setSize(260, 60);
		allMoneyInt.setLocation(100, 230);
		
		JButton button1 = new JButton(new ImageIcon(money1Img));
		JButton button2 = new JButton(new ImageIcon(money2Img));
		JButton button3 = new JButton(new ImageIcon(money3Img));
		JButton button4 = new JButton(new ImageIcon(money4Img));
		button1.setSize(75, 20);
		button1.setLocation(30, 200);
		button2.setSize(75, 20);
		button2.setLocation(115, 200);
		button3.setSize(75, 20);
		button3.setLocation(200, 200);
		button4.setSize(75, 20);
		button4.setLocation(285, 200);
		

		JButton chargeButton = new JButton("충전하기");
		chargeButton.setSize(120, 40);
		chargeButton.setLocation(240,  320);
		
		panel2.add(cash);
		panel2.add(cashInt);
		
		panel2.add(chargeMoney);
		panel2.add(chargeMoneyInt);
		
		panel2.add(allMoney);
		panel2.add(allMoneyInt);
		
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		panel2.add(chargeButton);
		
		
		this.add(panel1);
		this.add(panel2);
		mf.add(this);

		
	}
}

