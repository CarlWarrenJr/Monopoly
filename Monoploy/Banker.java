package Monoploy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Banker {
	public final int hotels = 12;
	public final int house = 32;
	public ArrayList<String> properties = new ArrayList<>();
	public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

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

	public Player auctionHouse(Player player,Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7, Player p8,
			int numberPlayers) throws IOException {
		p1.bid=0;
		p2.bid=0;
		p3.bid=0;
		p4.bid=0;
		p5.bid=0;
		p6.bid=0;
		p7.bid=0;
		p8.bid=0;

		if (numberPlayers == 2) {
			askBid(p1);
			askBid(p2);
		}
		else if (numberPlayers == 3) {
			askBid(p1);
			askBid(p2);
			askBid(p3);
		}
		else if (numberPlayers == 4) {
			askBid(p1);
			askBid(p2);
			askBid(p3);
			askBid(p4);
		}
		else if (numberPlayers == 5) {
			askBid(p1);
			askBid(p2);
			askBid(p3);
			askBid(p4);
			askBid(p5);
		}
		else if (numberPlayers == 6) {
			askBid(p1);
			askBid(p2);
			askBid(p3);
			askBid(p4);
			askBid(p5);
			askBid(p6);
		}
		else if (numberPlayers == 7) {
			askBid(p1);
			askBid(p2);
			askBid(p3);
			askBid(p4);
			askBid(p5);
			askBid(p6);
			askBid(p7);
		}
		else{
			askBid(p1);
			askBid(p2);
			askBid(p3);
			askBid(p4);
			askBid(p5);
			askBid(p6);
			askBid(p7);
			askBid(p8);
		}
		ArrayList<Integer> bids=new ArrayList<>(); 
		bids.add(p1.bid);
		bids.add(p2.bid);
		bids.add(p3.bid);
		bids.add(p4.bid);
		bids.add(p5.bid);
		bids.add(p6.bid);
		bids.add(p7.bid);
		bids.add(p8.bid);
		compare(bids,numberPlayers);
		if(p8.bid!=0||p7.bid!=0||p6.bid!=0||p5.bid!=0||p4.bid!=0||p3.bid!=0||p2.bid!=0||p1.bid!=0) {
		if(bids.get(7)==p1.bid) {
			return p1;
		}
		else if(bids.get(7)==p2.bid) {
			return p2;
		}
		else if(bids.get(7)==p3.bid) {
			return p3;
		}
		else if(bids.get(7)==p4.bid) {
			return p4;
		}
		else if(bids.get(7)==p5.bid) {
			return p5;
		}
		else if(bids.get(7)==p6.bid) {
			return p6;
		}
		else if(bids.get(7)==p7.bid) {
			return p7;
		}
		else {
			return p8;
		}
		}
		else {
			return player;
		}
		
	}
	

	
	private void compare(ArrayList<Integer> bids,int numberPlayers) {
		for(int i=0;i<numberPlayers;i++) {
		bids.sort(null);
		}
		}
	


	private void askBid(Player player) throws IOException {
		String temp = "";
		boolean valid = false;
		while (!valid) {
			System.out.println(player.getName() + " Enter your bid (0 if you don't want it)");
			try {
				temp = in.readLine();
				player.bid = Integer.parseInt(temp);
				if(player.bal>=player.bid) {
				valid=true;
				}
				else {
					System.out.println("You don't have that much");
				}
			} catch (NumberFormatException ex) {
				System.out.println("That's not a number");
			}
		}

	}
}