package kmp.view;

import java.awt.Color;

import javax.swing.JPanel;

public class MapPage extends JPanel {

	private MainFrame mf;
	private JPanel MapPage;

	public MapPage(MainFrame mf) {
		this.mf = mf;
		this.MapPage= this;
		this.setSize(400, 700);
		this.setLayout(null);
		Color color = new Color(35,212,177);
		Color backgcolor = new Color(234,255,236);


	}
}