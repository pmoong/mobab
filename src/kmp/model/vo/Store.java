package kmp.model.vo;

import java.awt.Image;
import java.io.Serializable;
import java.util.Arrays;

public class Store implements Serializable{
	private String[] menu;
	private String number;
	private String location;
	private Image map;
	private String name;
	
	public Store() {}
	

	public Store(String[] menu, String number, String location, Image map, String name) {
		super();
		this.menu = menu;
		this.number = number;
		this.location = location;
		this.map = map;
		this.name = name;
	}


	public String[] getMenu() {
		return menu;
	}

	public String getNumber() {
		return number;
	}

	public String getLocation() {
		return location;
	}

	public Image getMap() {
		return map;
	}

	public String getName() {
		return name;
	}

	public void setMenu(String[] menu) {
		this.menu = menu;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setMap(Image map) {
		this.map = map;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Store [menu=" + Arrays.toString(menu) + ", number=" + number + ", location=" + location + ", map=" + map
				+ ", name=" + name + "]";
	}
	
	
	
	
}
