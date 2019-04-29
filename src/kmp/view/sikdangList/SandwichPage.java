package kmp.view.sikdangList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import kmp.view.ChangePanel;
import kmp.view.ChargePage;
import kmp.view.FavoritePage;
import kmp.view.MainFrame;
import kmp.view.MainPage;
import kmp.view.MapPage;
import kmp.view.MemberInfoPage;
import kmp.view.SikdangPage;
import kmp.view.UsingHistoryPage;

public class SandwichPage extends JPanel {
	private MainFrame mf;
	private JPanel sandwichPage;

	public SandwichPage(MainFrame mf) {
		this.mf = mf;
		this.sandwichPage = this;
		this.setSize(400, 700);
		this.setLayout(null);
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);


		//����� �̹��� ����
		Image homeImg = new ImageIcon("images/home.png").getImage().getScaledInstance(240, 50, 0);
		Image sikImg = new ImageIcon("images/mRestaurant.png").getImage().getScaledInstance(100, 100, 0);
		Image favoriteImg = new ImageIcon("images/mFavorites.png").getImage().getScaledInstance(100, 100, 0);
		Image chartImg = new ImageIcon("images/mChart.png").getImage().getScaledInstance(100, 100, 0);
		Image chargeImg = new ImageIcon("images/mCharge.png").getImage().getScaledInstance(100, 100, 0);
		Image userinfoImg = new ImageIcon("images/user.png").getImage().getScaledInstance(80, 50, 0);
		Image backImg = new ImageIcon("images/back.png").getImage().getScaledInstance(80, 50, 0);
		Image bannerImg = new ImageIcon("images/banner.png").getImage().getScaledInstance(300, 180, 0);



		//����г�
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
				ChangePanel.changePanel(mf, sandwichPage, new MainPage(mf));
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
				ChangePanel.changePanel(mf, sandwichPage, new MemberInfoPage(mf));
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
				ChangePanel.changePanel(mf, sandwichPage, new SikdangPage(mf));
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
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, sandwichPage, new FavoritePage(mf));
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
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, sandwichPage, new UsingHistoryPage(mf));
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
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, sandwichPage, new ChargePage(mf));
			}

		});
		panel1.add(sik);
		panel1.add(fav);
		panel1.add(hist);
		panel1.add(charg);

		this.add(panel1);
		mf.add(this);

		JPanel panel2 = new JPanel();
		panel2.setSize(400, 550);
		panel2.setLocation(0, 150);
		panel2.setBackground(backgcolor);


		//----------------------
		Image sandwichname = new ImageIcon("images/beername.png").getImage().getScaledInstance(100, 25, 0);
		JPanel panel3 = new JPanel();
		panel3.setSize(350, 65);
		panel3.setLocation(20, 20);
		panel3.setBackground(color);
		JLabel sandwichLabel = new JLabel(new ImageIcon(sandwichname));
		sandwichLabel.setSize(100, 20);
		sandwichLabel.setLocation(120, 0);
		sandwichLabel.setBackground(color);
		JTextArea num = new JTextArea("000-000-0000");
		num.setSize(100, 20);
		num.setLocation(15, 35);
		JTextArea address = new JTextArea("������ ���ﵿ");
		address.setSize(120, 20);
		address.setLocation(215, 35);

		panel3.add(sandwichLabel);
		panel3.add(num);
		panel3.add(address);

		//--------------------------------------------------------------

		String [] count = {"1","2","3","4","5"};

		JPanel panel4 = new JPanel();
		panel4.setSize(350, 270);
		panel4.setLocation(20, 85);
		panel4.setBackground(Color.WHITE);

		JTextField menu1 = new JTextField("�޴�1");
		menu1.setSize(100, 20);
		menu1.setLocation(25, 25);
		menu1.setEditable(false);

		JTextField menu1p = new JTextField("����");
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



		JTextField menu2 = new JTextField("�޴�2");
		menu2.setSize(100, 20);
		menu2.setLocation(25, 70);
		menu2.setEditable(false);

		JTextField menu2p = new JTextField("����");
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



		JTextField menu3 = new JTextField("�޴�3");
		menu3.setSize(100, 20);
		menu3.setLocation(25, 110);
		menu3.setEditable(false);

		JTextField menu3p = new JTextField("����");
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

		JTextField menu4 = new JTextField("�޴�4");
		menu4.setSize(100, 20);
		menu4.setLocation(25, 150);
		menu4.setEditable(false);

		JTextField menu4p = new JTextField("����");
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

		JTextField total = new JTextField("�հ�");
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

		JButton map = new JButton("��ġ����");
		map.setSize(100 ,30 );
		map.setLocation(35,50);
		panel5.add(map);
		map.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, sandwichPage, new MapPage(mf));

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





