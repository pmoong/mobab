package kmp.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import kmp.model.vo.Images;

public class MainMenu extends JPanel{
	private MainFrame mf;
//	private JPanel mainMenu;
	Images img = new Images();
	Color color = new Color(35,212,177);
	Color backgcolor = new Color(234,255,236);
	JPanel currentPage;
	

	public MainMenu() {}
	public MainMenu(MainFrame mf, JPanel currentPage) {
		this.mf = mf;
//		this.mainMenu = this;
		this.currentPage = this;
//		this.setVisible(true);
		
		//상단 패널
		JPanel panel1 = new JPanel();
		panel1.setSize(400, 140);
		panel1.setLocation(0, 0);

		JButton back = new JButton(new ImageIcon(img.getBackImg()));
		back.setSize(80,50);
		back.setLocation(0,5);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);
		
		JButton logout = new JButton(new ImageIcon(img.getLogoutImg()));
		logout.setSize(50,50);
		logout.setLocation(10,5);
		logout.setBorderPainted(false);
		logout.setContentAreaFilled(false);
		logout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPage lp = new LoginPage();
				lp.setId(null);
				ChangePanel.changePanel(mf,currentPage, new LoginPage(mf));
				
			}
		});
		
		JButton home = new JButton(new ImageIcon(img.getHomeImg()));
		home.setSize(240,50);
		home.setLocation(80,5);
		home.setBorderPainted(false);
		home.setContentAreaFilled(false);
		home.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf,currentPage, new MainPage(mf));
			}
		});
		
		JButton infor = new JButton(new ImageIcon(img.getUserinfoImg()));
		infor.setSize(80,50);
		infor.setLocation(320,5);
		infor.setBorderPainted(false);
		infor.setContentAreaFilled(false);
		infor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, currentPage, new MemberInfoPage(mf));
			}
			
		});
		
		
		JButton sik = new JButton(new ImageIcon(img.getSikImg()));
		sik.setSize(100,100);
		sik.setLocation(0,55);
		sik.setBorderPainted(false);
		sik.setContentAreaFilled(false);
		sik.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentPage.setVisible(false);
				ChangePanel.changePanel(mf,currentPage, new SikdangPage(mf));
//				setVisible(true);
			}
		});
		JButton fav = new JButton(new ImageIcon(img.getFavoriteImg()));
		fav.setSize(100,100);
		fav.setLocation(100,55);
		fav.setBorderPainted(false);
		fav.setContentAreaFilled(false);
		fav.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, currentPage, new FavoritePage(mf));

			}
		});
		
		JButton hist = new JButton(new ImageIcon(img.getChartImg()));
		hist.setSize(100,100);
		hist.setLocation(200,55);
		hist.setBorderPainted(false);
		hist.setContentAreaFilled(false);
		hist.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, currentPage, new FavoritePage(mf));

			}
		});
		
		JButton charg = new JButton(new ImageIcon(img.getChargeImg()));
		charg.setSize(100,100);
		charg.setLocation(300,55);
		charg.setBorderPainted(false);
		charg.setContentAreaFilled(false);
		charg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, currentPage, new ChargePage(mf));

			}
		});
//		panel1.add(back);
		panel1.setBackground(color);
		panel1.add(home);
		panel1.add(infor);
//		panel1.add(logout);
		panel1.add(sik);
		panel1.add(fav);
		panel1.add(hist);
		panel1.add(charg);
		mf.add(panel1);
	}

	public Color getBackgcolor() {
		return backgcolor;
	}
	public void setBackgcolor(Color backgcolor) {
		this.backgcolor = backgcolor;
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
}
