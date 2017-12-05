package Monoploy;

import java.util.ArrayList;
import java.util.Random;


public class ChanceCard {
	private Random rand = new Random();
	public ArrayList<String> cards = new ArrayList<>();
	public ArrayList<String> deck = new ArrayList<>();
	private int gen;

	public void setCards() {
		cards.add("Advance to Go (Collect $200)");
		cards.add("Advance to Illinois AvevenueIf you pass Go, collect $200");
		cards.add("Advance to St. Charles Place – If you pass Go, collect $200");
		cards.add(
				"Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown.");
		cards.add(
				"Advance token to the nearest Railroad and pay owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.");
		cards.add("Bank pays you dividend of $50");
		cards.add("Get Out of Jail Free");
		cards.add("Go Back 3 Spaces");
		cards.add("Go to JailGo directly to Jail Do not pass Go, do not collect $200");
		cards.add("Make general repairs on all your propertyFor each house pay $25–For each hotel $100");
		cards.add("Pay poor tax of $15");
		cards.add("Take a trip to Reading Railroad–If you pass Go, collect $200");
		cards.add("Take a walk on the BoardwalkAdvance token to Boardwalk");
		cards.add("You have been elected Chairman of the Board–Pay each player $50");
		cards.add("Your building and loan maturesCollect $150");
		cards.add("You have won a crossword competitionCollect $100");
		createDeck();
	}

	public void createDeck() {
		int temp;
		int size = cards.size();
		while (deck.size() != size) {
			gen = rand.nextInt(cards.size());
			deck.add(cards.get(gen));
			temp = gen;
			cards.remove(temp);
		}
	}

	public void draw(Player current,int space,Player p1,Player p2,Player p3,Player p4, Player p5,Player p6,Player p7, Player p8, ArrayList<String> turnOrder) {
		String drawnCard = deck.get(0);
		deck.remove(0);
		System.out.println(drawnCard);
		System.out.println();
		int moveTo;
		switch (drawnCard) {
		case ("Advance to Go (Collect $200)"):
			// move current to go and add 200 to bal
			moveTo = 0;
			move(current, moveTo);
			current.bal += 200;
			break;
		case ("Advance to Illinois AvevenueIf you pass Go, collect $200"):
			// if current space is after illinois ave set space to illinois and add 200
			if (space>24) {
				current.bal += 200;
			}
			moveTo = 24;
			move(current, moveTo);
			break;
		case ("Advance to St. Charles Place – If you pass Go, collect $200"):
			if (space>11) {
				current.bal += 200;
			}
			moveTo = 11;
			move(current, moveTo);
			break;
		case ("Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown."):
			if (space>28&&space<12) {
				current.bal += 200;
				moveTo = 12;
			}
			else {
				moveTo=28;
			}
			
			move(current, moveTo);
			break;
		case ("Advance token to the nearest Railroad and pay owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank."):
			if (space>35&&space<5) {
				current.bal += 200;
				moveTo = 5;
			}
			else if(space>5&&space<15) {
				moveTo=15;
			}
			else if(space>15&&space<25) {
				moveTo=25;
			}
			else {
				moveTo=35;
			}			
			move(current, moveTo);
			break;
		case ("Bank pays you dividend of $50"):
			current.bal+=50;
		break;
		case ("Get Out of Jail Free"):
			current.ownedProperties.add("Get Out of Jail Free");
		break;
		case ("Go Back 3 Spaces"):
			moveTo=space-3;
			move(current, moveTo);
			break;
		case ("Go to JailGo directly to Jail Do not pass Go, do not collect $200"):
			moveTo=10;
		move(current, moveTo);
		current.inJail=true;
		break;
		case ("Make general repairs on all your propertyFor each house pay $25–For each hotel $100"):
			//come back later
			break;
		case ("Pay poor tax of $15"):
			current.bal-=15;
		break;
		case ("Take a trip to Reading Railroad–If you pass Go, collect $200"):
			if(space>5) {
				current.bal+=200;
			}
			moveTo=5;
		move(current, moveTo);
		break;
		case ("Take a walk on the BoardwalkAdvance token to Boardwalk"):
			moveTo=39;
		move(current, moveTo);
		break;
		case ("You have been elected Chairman of the Board–Pay each player $50"):
			for(int i=0;i<turnOrder.size();i++) {
				current.bal-=50;
			}
		int goThrough=2;
		if(current.getName().equals(p1.getName())) {
			for(int i=0;i<turnOrder.size()-1;i++) {
			if(goThrough==2) {
			p2.bal+=50;
			}
			else if(goThrough==3) {
			p3.bal+=50;
			}
			else if(goThrough==4) {
			p4.bal+=50;
			}
			else if(goThrough==5) {
			p5.bal+=50;
			}
			else if(goThrough==6) {
			p6.bal+=50;
			}
			else if(goThrough==7) {
			p7.bal+=50;
			}
			else if(goThrough==8) {
			p8.bal+=50;
			}
			goThrough++;
			}
		}
		else if(current.getName().equals(p2.getName())) {
			for(int i=0;i<turnOrder.size()-1;i++) {
			if(goThrough==2) {
			p1.bal+=50;
			}
			else if(goThrough==3) {
			p3.bal+=50;
			}
			else if(goThrough==4) {
			p4.bal+=50;
			}
			else if(goThrough==5) {
			p5.bal+=50;
			}
			else if(goThrough==6) {
			p6.bal+=50;
			}
			else if(goThrough==7) {
			p7.bal+=50;
			}
			else if(goThrough==8) {
			p8.bal+=50;
			}
			goThrough++;
			}
		}
		else if(current.getName().equals(p3.getName())) {
			for(int i=0;i<turnOrder.size()-1;i++) {
			if(goThrough==2) {
			p2.bal+=50;
			}
			else if(goThrough==3) {
			p1.bal+=50;
			}
			else if(goThrough==4) {
			p4.bal+=50;
			}
			else if(goThrough==5) {
			p5.bal+=50;
			}
			else if(goThrough==6) {
			p6.bal+=50;
			}
			else if(goThrough==7) {
			p7.bal+=50;
			}
			else if(goThrough==8) {
			p8.bal+=50;
			}
			goThrough++;
			}
		}
		else if(current.getName().equals(p4.getName())) {
			for(int i=0;i<turnOrder.size()-1;i++) {
			if(goThrough==2) {
			p2.bal+=50;
			}
			else if(goThrough==3) {
			p3.bal+=50;
			}
			else if(goThrough==4) {
			p1.bal+=50;
			}
			else if(goThrough==5) {
			p5.bal+=50;
			}
			else if(goThrough==6) {
			p6.bal+=50;
			}
			else if(goThrough==7) {
			p7.bal+=50;
			}
			else if(goThrough==8) {
			p8.bal+=50;
			}
			goThrough++;
			}
		}
		else if(current.getName().equals(p5.getName())) {
			for(int i=0;i<turnOrder.size()-1;i++) {
			if(goThrough==2) {
			p2.bal+=50;
			}
			else if(goThrough==3) {
			p3.bal+=50;
			}
			else if(goThrough==4) {
			p4.bal+=50;
			}
			else if(goThrough==5) {
			p1.bal+=50;
			}
			else if(goThrough==6) {
			p6.bal+=50;
			}
			else if(goThrough==7) {
			p7.bal+=50;
			}
			else if(goThrough==8) {
			p8.bal+=50;
			}
			goThrough++;
			}
		}
		else if(current.getName().equals(p6.getName())) {
			for(int i=0;i<turnOrder.size()-1;i++) {
			if(goThrough==2) {
			p2.bal+=50;
			}
			else if(goThrough==3) {
			p3.bal+=50;
			}
			else if(goThrough==4) {
			p4.bal+=50;
			}
			else if(goThrough==5) {
			p5.bal+=50;
			}
			else if(goThrough==6) {
			p1.bal+=50;
			}
			else if(goThrough==7) {
			p7.bal+=50;
			}
			else if(goThrough==8) {
			p8.bal+=50;
			}
			goThrough++;
			}
		}
		else if(current.getName().equals(p7.getName())) {
			for(int i=0;i<turnOrder.size()-1;i++) {
			if(goThrough==2) {
			p2.bal+=50;
			}
			else if(goThrough==3) {
			p3.bal+=50;
			}
			else if(goThrough==4) {
			p4.bal+=50;
			}
			else if(goThrough==5) {
			p5.bal+=50;
			}
			else if(goThrough==6) {
			p6.bal+=50;
			}
			else if(goThrough==7) {
			p1.bal+=50;
			}
			else if(goThrough==8) {
			p8.bal+=50;
			}
			goThrough++;
			}
		}
		else  {
			for(int i=0;i<turnOrder.size()-1;i++) {
			if(goThrough==2) {
			p2.bal+=50;
			}
			else if(goThrough==3) {
			p3.bal+=50;
			}
			else if(goThrough==4) {
			p4.bal+=50;
			}
			else if(goThrough==5) {
			p5.bal+=50;
			}
			else if(goThrough==6) {
			p6.bal+=50;
			}
			else if(goThrough==7) {
			p7.bal+=50;
			}
			else if(goThrough==8) {
			p1.bal+=50;
			}
			goThrough++;
			}
		}
			break;
		case ("Your building and loan maturesCollect $150"):
			current.bal+=150;
			break;
		case ("You have won a crossword competitionCollect $100"):
			current.bal+=150;
			break;
		}
		/*
		 * for (int i = 0; i < deck.size(); i++) { System.out.println(deck.get(i)); }
		 */
	}

	private void move(Player current, int space) {
		for (int i = 0; i < current.space.length; i++) {
			current.space[i] = "1";
		}
		current.space[space] = "0";

	}
}