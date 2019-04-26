package kmp.model.vo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Sandwich extends Store{

	
	public Sandwich() {}
	
	public Sandwich(String[] menu, String number, String location, Image map, String name) {
		super(menu, number, location, map, name);
		this.setMenu(menu);
		this.setNumber("010-0000-0000");
		this.setLocation("강남구 역삼동");
		this.setMap(new ImageIcon("images/mapSandwich.png").getImage().getScaledInstance(60, 60, 0));
		this.setName("Joe샌드위치");
		
	}


	
	
	
	

}
