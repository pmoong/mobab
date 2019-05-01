package kmp.view.sikdangList;

import java.awt.Color;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import kmp.controller.Controller;
import kmp.model.vo.Beer;
import kmp.view.ChangePanel;
import kmp.view.MainFrame;
import kmp.view.MainPage;
import kmp.view.MapPage;
import kmp.view.MemberInfoPage;
import kmp.view.PopUp;
import kmp.view.SikdangPage;
import kmp.view.UsingHistoryPage;
public class BeerStorePage extends JPanel{
      private MainFrame mf;
      private JPanel beerStorePage;
      private int price;
//      private int test;
    public BeerStorePage() {}

	public BeerStorePage(MainFrame mf) {
         this.mf = mf;
         this.beerStorePage = this;
         this.setSize(400, 700);
         this.setLayout(null);
         Color color = new Color(35,212,177);
         Color backgcolor = new Color(234,255,236);
         

         //사용할 이미지 선언
         Image homeImg = new ImageIcon("images/home.png").getImage().getScaledInstance(240, 50, 0);
         Image sikImg = new ImageIcon("images/mRestaurant.png").getImage().getScaledInstance(100, 100, 0);
         Image favoriteImg = new ImageIcon("images/mFavorites.png").getImage().getScaledInstance(100, 100, 0);
         Image chartImg = new ImageIcon("images/mChart.png").getImage().getScaledInstance(100, 100, 0);
         Image chargeImg = new ImageIcon("images/mCharge.png").getImage().getScaledInstance(100, 100, 0);
         Image userinfoImg = new ImageIcon("images/user.png").getImage().getScaledInstance(80, 50, 0);
         Image backImg = new ImageIcon("images/back.png").getImage().getScaledInstance(80, 50, 0);
         Image bannerImg = new ImageIcon("images/banner.png").getImage().getScaledInstance(300, 180, 0);
         
         

         //상단패널
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
               ChangePanel.changePanel(mf,beerStorePage, new MainPage(mf));
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
               ChangePanel.changePanel(mf, beerStorePage, new MemberInfoPage(mf));
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
               ChangePanel.changePanel(mf,beerStorePage, new SikdangPage(mf));
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
         
         JButton charg = new JButton(new ImageIcon(chargeImg));
         charg.setSize(100,100);
         charg.setLocation(300,50);
         charg.setBorderPainted(false);
         charg.setContentAreaFilled(false);      
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
         Beer b = new Beer();

         
         Image beername = new ImageIcon("images/beername.png").getImage().getScaledInstance(100, 25, 0);
         JPanel panel3 = new JPanel();
         panel3.setSize(350, 65);
         panel3.setLocation(20, 20);
         panel3.setBackground(color);
         JLabel beerLabel = new JLabel(new ImageIcon(beername));
         beerLabel.setSize(100, 20);
         beerLabel.setLocation(120, 0);
         beerLabel.setBackground(color);
         JButton num = new JButton(b.getNumber());
         num.setSize(130, 20);
         num.setLocation(15, 35);
         num.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUp pu = new PopUp();
				pu.callPopUp();
				
			}
		});
         
         
         JTextArea address = new JTextArea(b.getLocation());
         address.setSize(120, 20);
         address.setLocation(215, 35);
         
         panel3.add(beerLabel);
         panel3.add(num);
         panel3.add(address);
         
         //--------------------------------------------------------------
         
         String [] count = {"1","2","3","4","5"};
         
         
         JPanel panel4 = new JPanel();
         panel4.setSize(350, 270);
         panel4.setLocation(20, 85);
         panel4.setBackground(Color.WHITE);
         
         JTextField menu1 = new JTextField(b.getMenu()[0]);
         menu1.setSize(100, 20);
         menu1.setLocation(25, 25);
         menu1.setEditable(false);
         
         JTextField menu1p = new JTextField(b.getPrice()+"");
         menu1p.setSize(70, 20);
         menu1p.setLocation(160, 25);
         menu1p.setEditable(false);
         
         List listmenu1 = new List(3, false);
         listmenu1.add("1");
         listmenu1.add("2");
         listmenu1.add("3");
         listmenu1.add("4");
         listmenu1.add("5");
         listmenu1.setLocation(270,25);
         listmenu1.setSize(30,18);
            listmenu1.setVisible(true);
         
         

            
         JTextField total = new JTextField("합계");
         total.setSize(110, 20);
         total.setLocation(25,200);
         
         
         JTextField price = new JTextField();
         price.setSize(130, 20);
         price.setLocation(160,200);
         Controller ctr = new Controller();
         listmenu1.addItemListener(new ItemListener() {

         @Override
         public void itemStateChanged(ItemEvent arg0) {
            // TODO Auto-generated method stub
            int ea = listmenu1.getSelectedIndex()+1;
//            ctr.totalPrice(b.getPrice(), ea);
            price.setText(ctr.totalPrice(b.getPrice(), ea)+"");
            
            System.out.println(Integer.parseInt(price.getText()));
            System.out.println(getPrice());
         }
            
         });
         
         
         
         panel4.add(menu1);
         panel4.add(menu1p);
         panel4.add(listmenu1);
         panel4.add(total);      
         panel4.add(price);
         //---------------------------------------
         
   
         
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
               ChangePanel.changePanel(mf, beerStorePage, new MapPage(mf, 1));
               Controller ctr = new Controller();
               ctr.map(1);
               
            }
         });
         
         
         JButton pay = new JButton("결제");
         pay.setSize(100 ,30 );
         pay.setLocation(215,50);
         panel5.add(pay);
         
         pay.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {

                setPrice(Integer.parseInt(price.getText()));
            	ChangePanel.changePanel(mf, beerStorePage, new UsingHistoryPage(mf));
               PopUp pu = new PopUp();
				pu.CheckPay();
               
            }
         });
         
         
         
         
         
         panel2.add(panel3);
         panel2.add(panel4);
         panel2.add(panel5);
         
         
         this.add(panel1);
         this.add(panel2);
         
         mf.add(this);
         
         }
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
      }
   }