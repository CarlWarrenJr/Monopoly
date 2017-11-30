package Monoploy;

import java.util.ArrayList;

public class Banker {
	public final int hotels = 12;
	public final int house = 32;
	public int bal;
	public ArrayList<String> properties=new ArrayList<>();
	
	public void propertiesToBanker() {
	properties.add("MEDITERRANEAN AVENUE");
	properties.add("BALTIC AVENUE");
	properties.add("READING RAILROAD");
	properties.add("ORIENTAL AVENUE");
	properties.add("VERMONT AVENUE");
	properties.add("CONNETICUT AVENUE");
	properties.add("ST. CHARLES PLACE");
	properties.add("ELECTRIC COMPANY");
	properties.add("STATES AVENUE");
	properties.add("VIRGINIA AVENUE");
	properties.add("PENNSYLVANIA RAILROAD");
	properties.add("ST. JAMES PLACE");
	properties.add("TENNESEE AVENUE");
	properties.add("NEW YORK AVENUE");
	properties.add("KENTUKY AVENUE");
	properties.add("INDIANA AVENUE");
	properties.add("ILLINOIS AVENUE");
	properties.add("B&O RAILROAD");
	properties.add("ATLANTIC AVENUE");
	properties.add("VENTOR AVENUE");
	properties.add("WATER WORKS");
	properties.add("MARVIN GARDENS");
	properties.add("PACIFIC AVENUE");
	properties.add("NORTH CAROLINA AVENUE");
	properties.add("PENNSYLVANIA AVENUE");
	properties.add("SHORT LINE");
	properties.add("PARK PLACE");
	properties.add("BOARDWALK");
	}
	public void buyPropertyFromBank(String bought) {
		properties.remove(bought);
	}
	
}