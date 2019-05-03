package kmp.view.sikdangList;


import java.awt.Color;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kmp.controller.Controller;
import kmp.model.vo.Gram;
import kmp.model.vo.Images;
import kmp.view.ChangePanel;
import kmp.view.ChargePage;
import kmp.view.FavoritePage;
import kmp.view.LoginPage;
import kmp.view.MainFrame;
import kmp.view.MainPage;
import kmp.view.MapPage;
import kmp.view.MemberInfoPage;
import kmp.view.SikdangPage;
import kmp.view.UsingHistoryPage;


public class GramPage extends JPanel{
	private MainFrame mf;
	private JPanel gramPage;
	LoginPage lp = new LoginPage();
	Images img = new Images();

	public GramPage(MainFrame mf) {
		this.mf = mf;
		this.gramPage = this;
		this.setSize(400, 700);
		this.setLayout(null);
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);
		Image imv;

	      //상단패널
	      JPanel panel1 = new JPanel();
	      panel1.setSize(400, 140);
	      panel1.setLocation(0, 0);

	      JButton back = new JButton(new ImageIcon(img.getBackImg()));
	      back.setSize(80,50);
	      back.setLocation(0,5);
	      back.setBorderPainted(false);
	      back.setContentAreaFilled(false);

	      JButton home = new JButton(new ImageIcon(img.getHomeImg()));
	      home.setSize(240,50);
	      home.setLocation(80,5);
	      home.setBorderPainted(false);
	      home.setContentAreaFilled(false);
	      home.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	            // TODO Auto-generated method stub
	            ChangePanel.changePanel(mf, gramPage, new MainPage(mf));
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
	            ChangePanel.changePanel(mf, gramPage, new MemberInfoPage(mf));
	         }
	         
	         
	         
	         
	         
	      });
	      
//	      panel1.add(back);
	      panel1.add(home);
	      panel1.add(infor);
	      panel1.setBackground(color);
			
	      JButton sik = new JButton(new ImageIcon(img.getSikImg()));
	      sik.setSize(100,100);
	      sik.setLocation(0,55);
	      sik.setBorderPainted(false);
	      sik.setContentAreaFilled(false);
	      sik.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	            // TODO Auto-generated method stub
	            ChangePanel.changePanel(mf, gramPage, new SikdangPage(mf));
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
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, gramPage, new FavoritePage(mf));
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
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, gramPage, new UsingHistoryPage(mf));
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
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, gramPage, new ChargePage(mf));
			}
	    	  
	      });
		panel1.add(sik);
		panel1.add(fav);
		panel1.add(hist);
		panel1.add(charg);

		this.add(panel1);
		mf.add(this);

		JPanel panel2 = new JPanel();
		panel2.setSize(400, 560);
		panel2.setLocation(0, 140);
		panel2.setBackground(backgcolor);


		//----------------------
		
		Gram g = new Gram();
		Image gramname = new ImageIcon("images/gramName.png").getImage().getScaledInstance(100, 25, 0);
		JPanel panel3 = new JPanel();
		panel3.setSize(350, 65);
		panel3.setLocation(20, 20);
		panel3.setBackground(color);
		JLabel gramLabel = new JLabel(new ImageIcon(gramname));
		gramLabel.setSize(100, 20);
		gramLabel.setLocation(120, 0);
		gramLabel.setBackground(color);
		JTextArea num = new JTextArea("000-000-0000");
		num.setSize(100, 20);
		num.setLocation(15, 35);

		JTextArea address = new JTextArea("강남구 역삼동");
		address.setSize(120, 20);
		address.setLocation(215, 35);
		
		BufferedReader br = null;
		String fileName = (lp.getId()+".txt");
		File member = new File(fileName);
		
		imv=img.getStarImg();
		try {
			br = new BufferedReader(new FileReader(member));
			String line = br.readLine();
			String[] info = line.split(", ");
			if(info[3].equals("false")) {
				imv=img.getStarImg();
			}else {
				imv=img.getStar1Img();
			}
			}catch (IOException e1) {
				e1.printStackTrace();
			}
    
		JButton star = new JButton(new ImageIcon(imv));
		star.setSize(35, 35);
		star.setLocation(146, 27);
		star.setBorderPainted(false);
		star.setContentAreaFilled(false);

		star.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				BufferedWriter wr = null;
				BufferedReader br = null;
				String fileName = (lp.getId()+".txt");
				File member = new File(fileName);
				boolean Bs = false;
				boolean Js = false;
				boolean Nd = false;

				try {
					br = new BufferedReader(new FileReader(member));
					String save ="";
					String line ="";
					while((line = br.readLine()) !=null){
						String[] info = line.split(", ");
						if(info[0].equals(lp.getId())) {
							if(info[2].equals("false")) {
								Bs=false;
							}else {
								Bs=true;
							}
							if(info[4].equals("false")) {
								Js=false;
							}else {
								Js=true;
							}
							if(info[5].equals("false")) {
								Nd=false;
							}else {
								Nd=true;
							}
					
							if(info[3].equals("false")) {
								boolean favoriteBeer = Bs, favoriteGram = true, favoriteSandwich = Js, favoriteNoodles = Nd;
										
								save += lp.getId() +  ", " + info[1] + ", " 
										+ favoriteBeer + ", " + favoriteGram + ", " + favoriteSandwich + ", " + favoriteNoodles + "\n";
								star.setIcon(new ImageIcon(img.getStar1Img()));
							}else {
								boolean favoriteBeer = Bs, favoriteGram = false, favoriteSandwich = Js, favoriteNoodles = Nd;
								
								save += lp.getId() +  ", " + info[1] + ", " 
										+ favoriteBeer + ", " + favoriteGram + ", " + favoriteSandwich + ", " + favoriteNoodles + "\n";
								star.setIcon(new ImageIcon(img.getStarImg()));

							}
						}else {
							if(line.equals("0")) {
								break;
							}
							if(!info[0].equals("sandwich")) {
							save += info[0] + ", " + info[1] +"\n"; 
							}else {
								save += info[0] + ", " + info[1];	
							}
						}
						
						wr = new BufferedWriter(new FileWriter(lp.getId() + ".txt"));
						wr.write(save);
						wr.flush();
					}
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		panel3.add(gramLabel);
		panel3.add(num);
		panel3.add(address);
		panel3.add(star);

		//--------------------------------------------------------------

		String [] count = {"1","2","3","4","5"};

		JPanel panel4 = new JPanel();
		panel4.setSize(350, 270);
		panel4.setLocation(20, 85);
		panel4.setBackground(Color.WHITE);

		JTextField menu1 = new JTextField("메뉴1");
		menu1.setSize(100, 20);
		menu1.setLocation(25, 25);
		menu1.setEditable(false);

		
		JTextField menu1p = new JTextField("가격");
		menu1p.setSize(70, 20);
		menu1p.setLocation(160, 25);
		menu1p.setEditable(false);

		List listmenu1 = new List(3, false);
		listmenu1.add("1");
		listmenu1.add("2");
		listmenu1.add("3");
		listmenu1.setLocation(270,25);
		listmenu1.setSize(30,18);
		listmenu1.setVisible(true);



		JTextField menu2 = new JTextField("메뉴2");
		menu2.setSize(100, 20);
		menu2.setLocation(25, 70);
		menu2.setEditable(false);

		JTextField menu2p = new JTextField("가격");
		menu2p.setSize(70, 20);
		menu2p.setLocation(160, 70);
		menu2p.setEditable(false);

		List listmenu2 = new List(3, false);
		listmenu2.add("1");
		listmenu2.add("2");
		listmenu2.add("3");
		listmenu2.setLocation(270,70);
		listmenu2.setSize(30,18);
		listmenu1.setVisible(true);



		JTextField menu3 = new JTextField("메뉴3");
		menu3.setSize(100, 20);
		menu3.setLocation(25, 110);
		menu3.setEditable(false);

		JTextField menu3p = new JTextField("가격");
		menu3p.setSize(70, 20);
		menu3p.setLocation(160, 110);
		menu3p.setEditable(false);

		List listmenu3 = new List(3, false);
		listmenu3.add("1");
		listmenu3.add("2");
		listmenu3.add("3");
		listmenu3.setLocation(270,110);
		listmenu3.setSize(30,18);
		listmenu1.setVisible(true);

		JTextField menu4 = new JTextField("메뉴4");
		menu4.setSize(100, 20);
		menu4.setLocation(25, 150);
		menu4.setEditable(false);

		JTextField menu4p = new JTextField("가격");
		menu4p.setSize(70, 20);
		menu4p.setLocation(160, 150);
		menu4p.setEditable(false);

		List listmenu4 = new List(3, false);
		listmenu4.add("1");
		listmenu4.add("2");
		listmenu4.add("3");
		listmenu4.setLocation(270,150);
		listmenu4.setSize(30,18);
		listmenu1.setVisible(true);

		JTextField total = new JTextField("합계");
		total.setSize(100, 20);
		total.setLocation(110,210);



		panel4.add(menu1);
		panel4.add(menu1p);
		panel4.add(listmenu1);

		panel4.add(menu2);
		panel4.add(menu2p);
		panel4.add(listmenu2);

		panel4.add(menu3);
		panel4.add(menu3p);
		panel4.add(listmenu3);


		panel4.add(menu4);
		panel4.add(menu4p);
		panel4.add(listmenu4);


		panel4.add(total);      

		//---------------------------------------

		/*JTextArea ta = new JTextArea("000-000-0000");
	      ta.setSize(100, 50);
	      ta.setLocation(20, 20);
	      ta.setBackground(Color.pink);
	      ta.setEditable(false);*/

		JPanel panel5 = new JPanel();
		panel5.setSize(350, 120);
		panel5.setLocation(20, 335);
		panel5.setBackground(Color.GRAY);

		JButton map = new JButton("위치보기");
		map.setSize(100 ,30 );
		map.setLocation(35,50);
		panel5.add(map);
		map.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, gramPage, new MapPage(mf, 2));
	               Controller ctr = new Controller();
	               ctr.map(2);
			}
		});



		panel2.add(panel3);
		panel2.add(panel4);
		panel2.add(panel5);


		this.add(panel1);
		this.add(panel2);

		mf.add(this);

	}
}
