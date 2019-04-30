package kmp.model.vo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Beer extends Store{
	
	public Beer() {}
	
	public Beer(String[] menu, String number, String location, Image map, String name) {
		super(menu, number, location, map, name);
		this.setMenu(menu);
		this.setNumber("010-0000-0000");
		this.setLocation("°­³²±¸ ¿ª»ïµ¿");
		this.setMap(new ImageIcon("images/mapbeer.png").getImage().getScaledInstance(60, 60, 0));
		this.setName("¸ÆÁÖÃ¢°í");
		
	}

	

}
