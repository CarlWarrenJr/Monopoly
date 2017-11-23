package Monoploy;
import java.util.ArrayList;
import java.util.Random;
/*	Advance to Go (Collect $200)
	Advance to Illinois AvevenueIf you pass Go, collect $200
	Advance to St. Charles Place – If you pass Go, collect $200
	Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown.
	Advance token to the nearest Railroad and pay owner twice the rental to which he/she {he} is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.
	Bank pays you dividend of $50
	Get Out of Jail Free
	Go Back 3 Spaces
	Go to JailGo directly to Jail Do not pass Go, do not collect $200
	Make general repairs on all your propertyFor each house pay $25–For each hotel $100
	Pay poor tax of $15
	Take a trip to Reading Railroad–If you pass Go, collect $200
	Take a walk on the BoardwalkAdvance token to Boardwalk
	You have been elected Chairman of the Board–Pay each player $50
	Your building and loan maturesCollect $150
	You have won a crossword competitionCollect $100*/
public class ChanceCard {
	private Random rand=new Random();
public ArrayList<String> cards=new ArrayList<>();
public ArrayList<String> deck=new ArrayList<>();
private int gen;
public void setCards() {
	cards.add("Advance to Go (Collect $200)");
	cards.add("Advance to Illinois AvevenueIf you pass Go, collect $200");
	cards.add("Advance to St. Charles Place – If you pass Go, collect $200");
	cards.add("Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown.");
	cards.add("Advance token to the nearest Railroad and pay owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.");
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
	int size=cards.size();
	while(deck.size()!=size) {
		gen=rand.nextInt(cards.size());
	deck.add(cards.get(gen));
	temp =gen;
	cards.remove(temp);
	}
	for(int i=0;i<deck.size();i++) {
		System.out.println(deck.get(i));
	}
}
}