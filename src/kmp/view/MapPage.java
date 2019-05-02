package kmp.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kmp.controller.Controller;
import kmp.view.sikdangList.BeerStorePage;
import kmp.view.sikdangList.GramPage;
import kmp.view.sikdangList.NoodlesPage;
import kmp.view.sikdangList.SandwichPage;

public class MapPage extends JPanel {

	private MainFrame mf;
	private JPanel mapPage;

	public MapPage(MainFrame mf, int i) {
		this.mf = mf;
		this.mapPage = this;
		this.setSize(400, 700);
		this.setLayout(null);
		Controller ctr = new Controller();
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);

		//사용할 이미지 할당
		Image homeImg = new ImageIcon("images/home.png").getImage().getScaledInstance(240, 50, 0);
		Image sikImg = new ImageIcon("images/mRestaurant_c.png").getImage().getScaledInstance(100, 100, 0);
		Image favoriteImg = new ImageIcon("images/mFavorites.png").getImage().getScaledInstance(100, 100, 0);
		Image chartImg = new ImageIcon("images/mChart.png").getImage().getScaledInstance(100, 100, 0);
		Image chargeImg = new ImageIcon("images/mCharge.png").getImage().getScaledInstance(100, 100, 0);
		Image userinfoImg = new ImageIcon("images/user.png").getImage().getScaledInstance(80, 50, 0);
		Image backImg = new ImageIcon("images/back.png").getImage().getScaledInstance(80, 50, 0);
		Image bannerImg = new ImageIcon("images/banner.png").getImage().getScaledInstance(300, 180, 0);
		Image beerStoreImg = new ImageIcon("images/beerStoreF.png").getImage().getScaledInstance(125, 125, 0);
		Image gramImg = new ImageIcon("images/gramF.png").getImage().getScaledInstance(125, 125, 0);
		Image sandwichImg = new ImageIcon("images/sandwichF.png").getImage().getScaledInstance(125, 125, 0);
		Image noodlesImg = new ImageIcon("images/noodlesF.png").getImage().getScaledInstance(125, 125, 0);
		Image mapNameImg = new ImageIcon("images/map.png").getImage().getScaledInstance(350, 65, 0);

		
		//상단 패널
		JPanel panel1 = new JPanel();
		panel1.setSize(400, 150);
		panel1.setLocation(0, 0);

		JButton back = new JButton(new ImageIcon(backImg));
		back.setSize(80,50);
		back.setLocation(0,0);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(i == 1) {
					ChangePanel.changePanel(mf, mapPage, new BeerStorePage(mf)); 
				}
				else if(i == 2) {
					ChangePanel.changePanel(mf, mapPage, new GramPage(mf)); 

				}else if(i == 3) {
					ChangePanel.changePanel(mf, mapPage, new NoodlesPage(mf)); 

				}else if(i == 4) {
					ChangePanel.changePanel(mf, mapPage, new SandwichPage(mf)); 

				}
			}
		});
		
		JButton home = new JButton(new ImageIcon(homeImg));
		home.setSize(240,50);
		home.setLocation(80,0);
		home.setBorderPainted(false);
		home.setContentAreaFilled(false);
		home.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, mapPage, new MainPage(mf));
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
				ChangePanel.changePanel(mf, mapPage, new MemberInfoPage(mf));
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
				ChangePanel.changePanel(mf, mapPage, new SikdangPage(mf));
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
				ChangePanel.changePanel(mf, mapPage, new FavoritePage(mf));

			}
		});
		
		JButton hist = new JButton(new ImageIcon(chartImg));
		hist.setSize(100,100);
		hist.setLocation(200,50);
		hist.setBorderPainted(false);
		hist.setContentAreaFilled(false);
		hist.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, mapPage, new UsingHistoryPage(mf));

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
				ChangePanel.changePanel(mf, mapPage, new ChargePage(mf));

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
        panel3.setSize(350, 65);
        panel3.setLocation(20, 20);
		panel3.setBackground(color);
        
        JLabel mapLabel = new JLabel(new ImageIcon(mapNameImg));
        mapLabel.setSize(350, 65);
        mapLabel.setLocation(0, 0);
        mapLabel.setBackground(color);
        
        panel3.add(mapLabel);
		
        JPanel panel4 = new JPanel();
        panel4.setSize(350, 300);
        panel4.setLocation(20, 85);
        panel4.setBackground(Color.WHITE);
       
 
        panel4.add(ctr.map(i));
    
        
        panel2.add(panel3);
        panel2.add(panel4);
        
		this.add(panel1);
		this.add(panel2);
		mf.add(this);

		
	}
	
}