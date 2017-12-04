package Monoploy;

import java.util.ArrayList;

public class Banker {
	public final int hotels = 12;
	public final int house = 32;
	public ArrayList<String> properties=new ArrayList<>();
	public void propertiesToBanker() {
		properties.add("Atlantic Avenue");
		properties.add("B & O Railroad");
		properties.add("Baltic Avenue");
		properties.add("Boardwalk");
		properties.add("Connecticut Avenue");
		properties.add("Electric Company");
		properties.add("Illinois Avenue");
		properties.add("Indiana Avenue");
		properties.add("Kentucky Avenue");
		properties.add("Marvin Gardens");
		properties.add("Mediterranean Avenue");
		properties.add("New York Avenue");
		properties.add("North Carolina Avenue");
		properties.add("Oriental Avenue");
		properties.add("Pacific Avenue");
		properties.add("Park Place");
		properties.add("Pennsylvania Avenue");
		properties.add("Pennsylvania Railroad");
		properties.add("Reading Railroad");
		properties.add("Short Line");
		properties.add("St. Charles Place");
		properties.add("St. James Place");
		properties.add("States Avenue");
		properties.add("Tennessee Avenue");
		properties.add("Ventnor Avenue");
		properties.add("Vermont Avenue");
		properties.add("Virginia Avenue");
		properties.add("Water Works");
	}
	public void buyPropertyFromBank(String bought) {
		properties.remove(bought);
	}
	
	public void auctionHouse() {
		
	}
}