package kmp.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import kmp.view.sikdangList.BeerStorePage;
import kmp.view.sikdangList.GramPage;
import kmp.view.sikdangList.NoodlesPage;
import kmp.view.sikdangList.SandwichPage;

public class FavoritePage extends JPanel{
	private static final LayoutManager GridLayout = null;
	private MainFrame mf;
	private JPanel favoritepage;
	LoginPage lp = new LoginPage();


	public FavoritePage(MainFrame mf) {
		this.mf = mf;
		this.favoritepage = this;
		this.setSize(400, 700);
		this.setLayout(null);
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);

		//사용할 이미지 선언
		Image homeImg = new ImageIcon("images/home.png").getImage().getScaledInstance(240, 50, 0);
		Image sikImg = new ImageIcon("images/mRestaurant.png").getImage().getScaledInstance(100, 70, 0);
		Image favoriteImg = new ImageIcon("images/mFavorites_c.png").getImage().getScaledInstance(100, 70, 0);
		Image chartImg = new ImageIcon("images/mChart.png").getImage().getScaledInstance(100, 70, 0);
		Image chargeImg = new ImageIcon("images/mCharge.png").getImage().getScaledInstance(100, 70, 0);
		Image userinfoImg = new ImageIcon("images/user.png").getImage().getScaledInstance(80, 50, 0);
		Image backImg = new ImageIcon("images/back.png").getImage().getScaledInstance(80, 50, 0);
		Image bannerImg = new ImageIcon("images/banner.png").getImage().getScaledInstance(300, 180, 0);
		Image todayMenuImg = new ImageIcon("images/todayMenu.png").getImage().getScaledInstance(300, 180, 0);
		Image beerStoreImg = new ImageIcon("images/beerStoreF.png").getImage().getScaledInstance(125, 125, 0);
		Image gramImg = new ImageIcon("images/gramF.png").getImage().getScaledInstance(125, 125, 0);
		Image sandwichImg = new ImageIcon("images/sandwichF.png").getImage().getScaledInstance(125, 125, 0);
		Image noodlesImg = new ImageIcon("images/noodlesF.png").getImage().getScaledInstance(125, 125, 0);
		//상단패널
		JPanel panel1 = new JPanel();
		panel1.setSize(400, 140);
		panel1.setLocation(0, 0);

		JButton back = new JButton(new ImageIcon(backImg));
		back.setSize(80,50);
		back.setLocation(0,5);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);

		JButton home = new JButton(new ImageIcon(homeImg));
		home.setSize(240,50);
		home.setLocation(80,5);
		home.setBorderPainted(false);
		home.setContentAreaFilled(false);
		home.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf,favoritepage, new MainPage(mf));
			}

		});

		JButton infor = new JButton(new ImageIcon(userinfoImg));
		infor.setSize(80,50);
		infor.setLocation(320,5);
		infor.setBorderPainted(false);
		infor.setContentAreaFilled(false);
		infor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, favoritepage, new MemberInfoPage(mf));
			}

		});

		//		panel1.add(back);
		panel1.add(home);
		panel1.add(infor);
		panel1.setBackground(color);

		JButton sik = new JButton(new ImageIcon(sikImg));
		sik.setSize(100,100);
		sik.setLocation(0,55);
		sik.setBorderPainted(false);
		sik.setContentAreaFilled(false);

		sik.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf,favoritepage, new SikdangPage(mf));
			}

		});

		JButton fav = new JButton(new ImageIcon(favoriteImg));
		fav.setBorderPainted(false);
		fav.setContentAreaFilled(false);
		fav.setSize(100,100);
		fav.setLocation(100,55);

		JButton hist = new JButton(new ImageIcon(chartImg));
		hist.setSize(100,100);
		hist.setLocation(200,55);
		hist.setBorderPainted(false);
		hist.setContentAreaFilled(false);
		hist.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, favoritepage, new UsingHistoryPage(mf));

			}
		});
		JButton charge = new JButton(new ImageIcon(chargeImg));
		charge.setSize(100,100);
		charge.setLocation(300,55);
		charge.setBorderPainted(false);
		charge.setContentAreaFilled(false);
		charge.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, favoritepage, new ChargePage(mf));

			}
		});


		panel1.add(sik);
		panel1.add(fav);
		panel1.add(hist);
		panel1.add(charge);

		//하단패널
		JPanel panel2 = new JPanel();
		panel2.setSize(400, 560);
		panel2.setLocation(0, 140);
		panel2.setBackground(backgcolor);


		BufferedReader br = null;
		String fileName = (lp.getId()+".txt");
		File member = new File(fileName);
		//맥주창고
		try {
			br = new BufferedReader(new FileReader(member));
			String line = br.readLine();
			String[] info = line.split(", ");
			if(info[2].equals("true")) {
				JButton beerStore = new JButton();
				beerStore.setSize(300, 125);
				beerStore.setLocation(50, 5);
				beerStore.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ChangePanel.changePanel(mf, favoritepage, new BeerStorePage(mf));
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
				panel2.add(beerStore);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//7Gram
		try {
			br = new BufferedReader(new FileReader(member));
			String line = br.readLine();
			String[] info = line.split(", ");
			if(info[3].equals("true")&&info[2].equals("true")) {
				JButton gram = new JButton();
				gram.setSize(300, 125);
				gram.setLocation(50, 135);
				gram.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						ChangePanel.changePanel(mf, favoritepage, new GramPage(mf));

					}
				});
				JLabel gramLabel = new JLabel(new ImageIcon(gramImg));
				gramLabel.setSize(125, 125);
				gramLabel.setLocation(0, 0);
				JTextArea gramTextArea = new JTextArea("아메리카노~\n쬬아~쬬아~쬬아~");
				gramTextArea.setSize(175, 125);
				gramTextArea.setLocation(125, 0);

				gram.add(gramLabel);
				gram.add(gramTextArea);
				panel2.add(gram);
			}else if(info[3].equals("true")) {
				JButton gram = new JButton();
				gram.setSize(300, 125);
				gram.setLocation(50, 5);
				gram.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						ChangePanel.changePanel(mf, favoritepage, new GramPage(mf));

					}
				});
				JLabel gramLabel = new JLabel(new ImageIcon(gramImg));
				gramLabel.setSize(125, 125);
				gramLabel.setLocation(0, 0);
				JTextArea gramTextArea = new JTextArea("아메리카노~\n쬬아~쬬아~쬬아~");
				gramTextArea.setSize(175, 125);
				gramTextArea.setLocation(125, 0);

				gram.add(gramLabel);
				gram.add(gramTextArea);
				panel2.add(gram);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		//JOS샌드위치
		try {
			br = new BufferedReader(new FileReader(member));
			String line = br.readLine();
			String[] info = line.split(", ");
			if(info[3].equals("true")&&info[2].equals("true")&&info[4].equals("true")) {
				JButton sandwich = new JButton();
				sandwich.setSize(300, 125);
				sandwich.setLocation(50, 265);
				sandwich.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						ChangePanel.changePanel(mf, favoritepage, new SandwichPage(mf));

					}
				});
				JLabel sandwichLabel = new JLabel(new ImageIcon(sandwichImg));
				sandwichLabel.setSize(125, 125);
				sandwichLabel.setLocation(0, 0);
				JTextArea sandwichTextArea = new JTextArea("샌드위치\n빵을 포개서 만든\n샌드위치");
				sandwichTextArea.setSize(175, 125);
				sandwichTextArea.setLocation(125, 0);

				sandwich.add(sandwichLabel);
				sandwich.add(sandwichTextArea);
				panel2.add(sandwich);
			}else if((info[3].equals("true")&&info[4].equals("true"))||(info[2].equals("true")&&info[4].equals("true"))) {
				JButton sandwich = new JButton();
				sandwich.setSize(300, 125);
				sandwich.setLocation(50, 135);
				sandwich.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						ChangePanel.changePanel(mf, favoritepage, new SandwichPage(mf));

					}
				});
				JLabel sandwichLabel = new JLabel(new ImageIcon(sandwichImg));
				sandwichLabel.setSize(125, 125);
				sandwichLabel.setLocation(0, 0);
				JTextArea sandwichTextArea = new JTextArea("샌드위치\n빵을 포개서 만든\n샌드위치");
				sandwichTextArea.setSize(175, 125);
				sandwichTextArea.setLocation(125, 0);

				sandwich.add(sandwichLabel);
				sandwich.add(sandwichTextArea);
				panel2.add(sandwich);
			}else if(info[4].equals("true")) {
				JButton sandwich = new JButton();
				sandwich.setSize(300, 125);
				sandwich.setLocation(50, 5);
				sandwich.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						ChangePanel.changePanel(mf, favoritepage, new SandwichPage(mf));

					}
				});
				JLabel sandwichLabel = new JLabel(new ImageIcon(sandwichImg));
				sandwichLabel.setSize(125, 125);
				sandwichLabel.setLocation(0, 0);
				JTextArea sandwichTextArea = new JTextArea("샌드위치\n빵을 포개서 만든\n샌드위치");
				sandwichTextArea.setSize(175, 125);
				sandwichTextArea.setLocation(125, 0);

				sandwich.add(sandwichLabel);
				sandwich.add(sandwichTextArea);
				panel2.add(sandwich);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

		//중리
		try {
			br = new BufferedReader(new FileReader(member));
			String line = br.readLine();
			String[] info = line.split(", ");
			if(info[2].equals("true")&&info[3].equals("true")&&info[4].equals("true")&&info[5].equals("true")) {
				JButton noodles = new JButton();
				noodles.setSize(300, 125);
				noodles.setLocation(50, 395);
				noodles.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						ChangePanel.changePanel(mf, favoritepage, new NoodlesPage(mf));

					}
				});
				JLabel  noodlesLabel = new JLabel(new ImageIcon(noodlesImg));
				noodlesLabel.setSize(125, 125);
				noodlesLabel.setLocation(0, 0);
				JTextArea noodlesTextArea = new JTextArea("짜장면\n길고 검은\n자장면");
				noodlesTextArea.setSize(175, 125);
				noodlesTextArea.setLocation(125, 0);

				noodles.add(noodlesLabel);
				noodles.add(noodlesTextArea);
				panel2.add(noodles);
			}else if((info[2].equals("true")&&info[3].equals("true")&&info[5].equals("true"))
					||(info[2].equals("true")&&info[4].equals("true")&&info[5].equals("true"))
					||(info[3].equals("true")&&info[4].equals("true")&&info[5].equals("true"))){
				JButton noodles = new JButton();
				noodles.setSize(300, 125);
				noodles.setLocation(50, 265);
				noodles.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						ChangePanel.changePanel(mf, favoritepage, new NoodlesPage(mf));

					}
				});
				JLabel  noodlesLabel = new JLabel(new ImageIcon(noodlesImg));
				noodlesLabel.setSize(125, 125);
				noodlesLabel.setLocation(0, 0);
				JTextArea noodlesTextArea = new JTextArea("짜장면\n길고 검은\n자장면");
				noodlesTextArea.setSize(175, 125);
				noodlesTextArea.setLocation(125, 0);

				noodles.add(noodlesLabel);
				noodles.add(noodlesTextArea);
				panel2.add(noodles);
			}else if((info[2].equals("true")&&info[5].equals("true"))
					||(info[3].equals("true")&&info[5].equals("true"))
					||(info[4].equals("true")&&info[5].equals("true"))){
				JButton noodles = new JButton();
				noodles.setSize(300, 125);
				noodles.setLocation(50, 135);
				noodles.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						ChangePanel.changePanel(mf, favoritepage, new NoodlesPage(mf));

					}
				});
				JLabel  noodlesLabel = new JLabel(new ImageIcon(noodlesImg));
				noodlesLabel.setSize(125, 125);
				noodlesLabel.setLocation(0, 0);
				JTextArea noodlesTextArea = new JTextArea("짜장면\n길고 검은\n자장면");
				noodlesTextArea.setSize(175, 125);
				noodlesTextArea.setLocation(125, 0);

				noodles.add(noodlesLabel);
				noodles.add(noodlesTextArea);
				panel2.add(noodles);
			}else if(info[5].equals("true")) {
				JButton noodles = new JButton();
				noodles.setSize(300, 125);
				noodles.setLocation(50, 5);
				noodles.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						ChangePanel.changePanel(mf, favoritepage, new NoodlesPage(mf));

					}
				});
				JLabel  noodlesLabel = new JLabel(new ImageIcon(noodlesImg));
				noodlesLabel.setSize(125, 125);
				noodlesLabel.setLocation(0, 0);
				JTextArea noodlesTextArea = new JTextArea("짜장면\n길고 검은\n자장면");
				noodlesTextArea.setSize(175, 125);
				noodlesTextArea.setLocation(125, 0);

				noodles.add(noodlesLabel);
				noodles.add(noodlesTextArea);
				panel2.add(noodles);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

		this.add(panel1);
		this.add(panel2);
		mf.add(this);

	}

}
