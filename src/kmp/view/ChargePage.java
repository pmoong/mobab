package kmp.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kmp.controller.Controller;
import kmp.model.vo.Images;

public class ChargePage extends JPanel {
	private MainFrame mf;
	private JPanel chargePage;
	private int money;
	private int charge;
	private int sum;
	LoginPage lp = new LoginPage();
	BufferedReader br = null;
	Controller ctr = new Controller();
	Images img = new Images();
	
	public ChargePage() {}
	
	public ChargePage(MainFrame mf) {
		this.mf = mf;
		this.chargePage = this;
		this.setSize(400, 700);
		this.setLayout(null);
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);


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
				ChangePanel.changePanel(mf,chargePage, new MainPage(mf));
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
				ChangePanel.changePanel(mf, chargePage, new MemberInfoPage(mf));
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
				ChangePanel.changePanel(mf,chargePage, new SikdangPage(mf));
			}
			
		});
		
		JButton fav = new JButton(new ImageIcon(img.getFavoriteImg()));
		fav.setSize(100,100);
		fav.setLocation(100,65);
		fav.setBorderPainted(false);
		fav.setContentAreaFilled(false);
		fav.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, chargePage, new FavoritePage(mf));

			}
		});


		
		JButton hist = new JButton(new ImageIcon(img.getChartImg()));
		hist.setSize(100,100);
		hist.setLocation(200,65);
		hist.setBorderPainted(false);
		hist.setContentAreaFilled(false);
		hist.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, chargePage, new UsingHistoryPage(mf));

			}
		});

		
		JButton charge = new JButton(new ImageIcon(img.getChargeImg()));
		charge.setSize(100,100);
		charge.setLocation(300,65);
		charge.setBorderPainted(false);
		charge.setContentAreaFilled(false);

		charge.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, chargePage, new ChargePage(mf));
				
			}
		});
		
		
		panel1.add(sik);
		panel1.add(fav);
		panel1.add(hist);
		panel1.add(charge);
		
		

		//하단패널
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter(userId() + ".txt"));

		JPanel panel2 = new JPanel();
		panel2.setSize(400, 550);
		panel2.setLocation(0, 150);
		panel2.setBackground(backgcolor);
		
		try {
			br = new BufferedReader(new FileReader("MemberList.txt"));
			String line = "";
			
			while ((line = br.readLine()) != null) {
				String[] info = line.split(", ");
				if(lp.getId().equals(info[0])) {
					setMoney(Integer.parseInt(info[10]));
					break;
				}
			}	
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
		
		//String[] userInfo;
		
		
		
		
		
		setSum(getMoney() + getCharge());
			
		JLabel cash = new JLabel(new ImageIcon(img.getCashImg()));
		cash.setSize(60, 60);
		cash.setLocation(40, 20);
		
		
		
		JTextField cashInt = new JTextField();
		cashInt.setText(getMoney() + "원");
		cashInt.setEditable(false);	
		cashInt.setSize(260, 60);
		cashInt.setLocation(100, 20);
		
		JLabel chargeMoney = new JLabel(new ImageIcon(img.getChargeMoneyImg()));
		chargeMoney.setSize(60, 60);
		chargeMoney.setLocation(40, 120);
		
		JTextField chargeMoneyInt = new JTextField();
		chargeMoneyInt.setEditable(false);	
		chargeMoneyInt.setSize(260, 60);
		chargeMoneyInt.setLocation(100, 120);
		chargeMoneyInt.setText(getCharge()+"원");
		
		JLabel allMoney = new JLabel(new ImageIcon(img.getAllMoneyImg()));
		allMoney.setSize(60, 60);
		allMoney.setLocation(40, 230);

		JTextField allMoneyInt = new JTextField();
		allMoneyInt.setText(getSum() + "원");
		allMoneyInt.setEditable(false);	
		allMoneyInt.setSize(260, 60);
		allMoneyInt.setLocation(100, 230);
		
		JButton button1 = new JButton(new ImageIcon(img.getMoney1Img()));	//5만
		JButton button2 = new JButton(new ImageIcon(img.getMoney2Img()));	//3만
		JButton button3 = new JButton(new ImageIcon(img.getMoney3Img()));	//1만
		JButton button4 = new JButton(new ImageIcon(img.getMoney4Img()));	//5천
		button1.setSize(75, 20);
		button1.setLocation(30, 200);
		button2.setSize(75, 20);
		button2.setLocation(115, 200);
		button3.setSize(75, 20);
		button3.setLocation(200, 200);
		button4.setSize(75, 20);
		button4.setLocation(285, 200);
		
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setCharge(getCharge() + 50000);
				setSum(getMoney()+getCharge());
				chargeMoneyInt.setText(getCharge()+"원");
				allMoneyInt.setText(getSum() + "원");
			}
		});
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setCharge(getCharge() + 30000);
				setSum(getMoney()+getCharge());
				chargeMoneyInt.setText(getCharge()+"원");
				allMoneyInt.setText(getSum() + "원");
				
			}
		});
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setCharge(getCharge() + 10000);
				setSum(getMoney()+getCharge());
				chargeMoneyInt.setText(getCharge()+"원");
				allMoneyInt.setText(getSum() + "원");
				
			}
		});
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setCharge(getCharge() + 5000);
				setSum(getMoney()+getCharge());
				chargeMoneyInt.setText(getCharge()+"원");
				allMoneyInt.setText(getSum() + "원");
				
			}
		});

		
		JButton chargeButton = new JButton("충전하기");
		chargeButton.setSize(120, 40);
		chargeButton.setLocation(240,  320);
		
		
		
		chargeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setMoney(getSum());
				setCharge(0);
				cashInt.setText(getMoney() + "원");
				chargeMoneyInt.setText(getCharge()+"원");
				allMoneyInt.setText(getSum() + "원");
				ctr.charged(getMoney());
			}});
		
		
		
		
		
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
		
		this.setVisible(true);

	}
	
	
	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}

