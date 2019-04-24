package kmp.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import kmp.view.sikdangList.BeerStorePage;

public class SikdangPage extends JPanel {
	private MainFrame mf;
	private JPanel sikdangPage;
	
	public SikdangPage(MainFrame mf) {
		this.mf = mf;
		this.sikdangPage = this;
		this.setSize(400, 700);
		this.setLayout(null);
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
				ChangePanel.changePanel(mf,sikdangPage, new MainPage(mf));
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
				ChangePanel.changePanel(mf, sikdangPage, new MemberInfoPage(mf));
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
		JButton charg = new JButton(new ImageIcon(chargeImg));
		charg.setSize(100,100);
		charg.setLocation(300,50);
		charg.setBorderPainted(false);
		charg.setContentAreaFilled(false);
		panel1.add(sik);
		panel1.add(fav);
		panel1.add(hist);
		panel1.add(charg);
		
		//하단패널
		JPanel panel2 = new JPanel();
		panel2.setSize(400, 550);
		panel2.setLocation(0, 150);
		panel2.setBackground(backgcolor);
		
		JButton beerStore = new JButton();
		beerStore.setSize(300, 125);
		beerStore.setLocation(50, 5);
		beerStore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, sikdangPage, new BeerStorePage(mf));
			}
			
		});
		JLabel beerLabel = new JLabel(new ImageIcon(beerStoreImg));
		beerLabel.setSize(125, 125);
		beerLabel.setLocation(0, 0);
		JTextArea beerTextArea = new JTextArea("고기잡내 지려주는 맥주창고~\n낮에는 지나가고\n밤에 술마시러 오세요.");
		beerTextArea.setSize(175, 125);
		beerTextArea.setLocation(125, 0);
		beerStore.add(beerLabel);
		beerStore.add(beerTextArea);
		
		JButton gram = new JButton();
		gram.setSize(300, 125);
		gram.setLocation(50, 135);
		JLabel gramLabel = new JLabel(new ImageIcon(gramImg));
		gramLabel.setSize(125, 125);
		gramLabel.setLocation(0, 0);
		JTextArea gramTextArea = new JTextArea("아메리카노~\n쬬아~쬬아~쬬아~");
		gramTextArea.setSize(175, 125);
		gramTextArea.setLocation(125, 0);
		gram.add(gramLabel);
		gram.add(gramTextArea);
		
		JButton sandwich = new JButton();
		sandwich.setSize(300, 125);
		sandwich.setLocation(50, 265);
		JLabel sandwichLabel = new JLabel(new ImageIcon(sandwichImg));
		sandwichLabel.setSize(125, 125);
		sandwichLabel.setLocation(0, 0);
		JTextArea sandwichTextArea = new JTextArea("샌드위치\n빵을 포개서 만든\n샌드위치");
		sandwichTextArea.setSize(175, 125);
		sandwichTextArea.setLocation(125, 0);
		sandwich.add(sandwichLabel);
		sandwich.add(sandwichTextArea);
		
		JButton noodles = new JButton();
		noodles.setSize(300, 125);
		noodles.setLocation(50, 395);
		JLabel noodlesLabel = new JLabel(new ImageIcon(noodlesImg));
		noodlesLabel.setSize(125, 125);
		noodlesLabel.setLocation(0, 0);
		JTextArea noodlesTextArea = new JTextArea("짜장면\n길고 검은\n자장면");
		noodlesTextArea.setSize(175, 125);
		noodlesTextArea.setLocation(125, 0);
		noodles.add(noodlesLabel);
		noodles.add(noodlesTextArea);
		
		panel2.add(beerStore);
		panel2.add(gram);
		panel2.add(sandwich);
		panel2.add(noodles);
		
		
		this.add(panel1);
		this.add(panel2);
		mf.add(this);

		
	}
}

