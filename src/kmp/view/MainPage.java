package kmp.view;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kmp.view.MainFrame;


public class MainPage extends JPanel {
	private MainFrame mf;
	private JPanel mainPage;
	
	public MainPage(MainFrame mf) {
		this.mf = mf;
		this.mainPage = this;
		this.setSize(400, 700);
		this.setLayout(null);
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);
		
		//�궗�슜�븷 �씠誘몄� �븷�떦
		Image homeImg = new ImageIcon("images/home.png").getImage().getScaledInstance(240, 50, 0);
		Image sikImg = new ImageIcon("images/mRestaurant.png").getImage().getScaledInstance(100, 100, 0);
		Image favoriteImg = new ImageIcon("images/mFavorites.png").getImage().getScaledInstance(100, 100, 0);
		Image chartImg = new ImageIcon("images/mChart.png").getImage().getScaledInstance(100, 100, 0);
		Image chargeImg = new ImageIcon("images/mCharge.png").getImage().getScaledInstance(100, 100, 0);
		Image userinfoImg = new ImageIcon("images/user.png").getImage().getScaledInstance(80, 50, 0);
		Image backImg = new ImageIcon("images/back.png").getImage().getScaledInstance(80, 50, 0);
		Image bannerImg = new ImageIcon("images/banner.png").getImage().getScaledInstance(300, 180, 0);
		Image todayMenuImg = new ImageIcon("images/todayMenu.png").getImage().getScaledInstance(300, 180, 0);
		
		
		//�긽�떒 �뙣�꼸
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
				ChangePanel.changePanel(mf,mainPage, new MainPage(mf));
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
				ChangePanel.changePanel(mf, mainPage, new MemberInfoPage(mf));
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
				ChangePanel.changePanel(mf,mainPage, new SikdangPage(mf));
			}
			
		});
		
		JButton fav = new JButton(new ImageIcon(favoriteImg));
		fav.setBorderPainted(false);
		fav.setContentAreaFilled(false);
		fav.setSize(100,100);
		fav.setLocation(100,50);
		
		fav.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, mainPage, new FavoritePage(mf));
			}
		});
		
		
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
				ChangePanel.changePanel(mf, mainPage, new ChargePage(mf));
				
			}
		});

		
		panel1.add(sik);
		panel1.add(fav);
		panel1.add(hist);
		panel1.add(charge);
		
		//�븯�떒�뙣�꼸
		JPanel panel2 = new JPanel();
		panel2.setSize(400, 550);
		panel2.setLocation(0, 150);
		panel2.setBackground(backgcolor);
		
		JLabel todaymenu = new JLabel("< �삤�뒛�쓽 硫붾돱 >");
		todaymenu.setSize(200, 25);
		todaymenu.setLocation(50, 25);
		JLabel menuImg = new JLabel(new ImageIcon(todayMenuImg));
		menuImg.setSize(300, 200);
		menuImg.setLocation(50, 50);
		
		JLabel todaynews = new JLabel("< �삤�뒛�쓽 �돱�뒪 >");
		todaynews.setSize(200, 25);
		todaynews.setLocation(50, 300);
		JLabel banner = new JLabel(new ImageIcon(bannerImg));
		banner.setSize(300, 200);
		banner.setLocation(50, 325);
		panel2.add(todaymenu);
		panel2.add(menuImg);
		panel2.add(todaynews);
		panel2.add(banner);
		
		
		this.add(panel1);
		this.add(panel2);
		mf.add(this);

		
	}
}

