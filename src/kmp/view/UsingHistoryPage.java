package kmp.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import kmp.controller.Controller;
import kmp.model.vo.Images;

public class UsingHistoryPage extends JPanel{
	private MainFrame mf;
	private JPanel usinghistorypage;

	public UsingHistoryPage(MainFrame mf) {
		this.mf = mf;
		this.usinghistorypage = this;
		this.setSize(400, 700);
		this.setLayout(null);
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);
		Images img = new Images();


		//상단패널
		JPanel panel1 = new JPanel();
		panel1.setSize(400, 150);
		panel1.setLocation(0, 0);

		JButton back = new JButton(new ImageIcon(img.getBackImg()));
		back.setSize(80,50);
		back.setLocation(0,10);
		back.setBorderPainted(false);
		back.setContentAreaFilled(false);

		JButton home = new JButton(new ImageIcon(img.getHomeImg()));
		home.setSize(240,50);
		home.setLocation(80,10);
		home.setBorderPainted(false);
		home.setContentAreaFilled(false);
		home.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf,usinghistorypage, new MainPage(mf));
			}

		});

		JButton infor = new JButton(new ImageIcon(img.getUserinfoImg()));
		infor.setSize(80,50);
		infor.setLocation(320,10);
		infor.setBorderPainted(false);
		infor.setContentAreaFilled(false);
		infor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, usinghistorypage, new MemberInfoPage(mf));
			}

		});

		//		panel1.add(back);
		panel1.add(home);
		panel1.add(infor);
		panel1.setBackground(color);

		JButton sik = new JButton(new ImageIcon(img.getSikImg()));
		sik.setSize(100,100);
		sik.setLocation(0,65);
		sik.setBorderPainted(false);
		sik.setContentAreaFilled(false);

		sik.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf,usinghistorypage, new SikdangPage(mf));
			}

		});

		JButton fav = new JButton(new ImageIcon(img.getFavoriteImg()));
		fav.setBorderPainted(false);
		fav.setContentAreaFilled(false);
		fav.setSize(100,100);
		fav.setLocation(100,65);
		fav.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, usinghistorypage, new FavoritePage(mf));

			}
		});

		JButton hist = new JButton(new ImageIcon(img.getChartImg()));
		hist.setSize(100,100);
		hist.setLocation(200,65);

		hist.setBorderPainted(false);
		hist.setContentAreaFilled(false);
		JButton charge = new JButton(new ImageIcon(img.getChargeImg()));
		charge.setSize(100,100);
		charge.setLocation(300,65);
		charge.setBorderPainted(false);
		charge.setContentAreaFilled(false);
		charge.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePanel.changePanel(mf, usinghistorypage, new ChargePage(mf));

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

		Controller c = new Controller();

		String info [] = {"식당","결제금액"};
		String data[][];

		data = new String[4][2];
		data[0][0]="맥주창고";
		data[0][1]=c.outputstore("beerStore");

		data[1][0]="7gram";
		data[1][1]=c.outputstore("7gram");

		data[2][0]="중리";
		data[2][1]=c.outputstore("noodles");

		data[3][0]="Joe's sandwich";
		data[3][1]=c.outputstore("sandwich");


		DefaultTableModel model = new DefaultTableModel(data, info);


		JTable table = new JTable(model);
		JScrollPane scrollpane = new JScrollPane(table);

		JPanel panel = new JPanel();
		JTextField store = new JTextField();
		JTextField pay = new JTextField();
		scrollpane.add(store);
		scrollpane.add(pay);



		scrollpane.setSize(350,300);
		scrollpane.setLocation(20,50);
		panel2.add(scrollpane);


		JPanel infopanel = new JPanel();
		JTextField tfstore = new JTextField();
		JTextField tfpay = new JTextField();

		panel2.add(infopanel);
		infopanel.setSize(350,300);
		infopanel.setLocation(20,50);

		//		infopanel.add()


		this.add(panel1);
		this.add(panel2);
		mf.add(this);





	}
}