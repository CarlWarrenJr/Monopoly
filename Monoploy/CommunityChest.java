package Monoploy;

import java.util.ArrayList;
import java.util.Random;

/*	Advance to Go (Collect $200)
	Bank error in your favor—Collect $200
	Doctor's fee—Pay $50
	From sale of stock you get $50
	Get Out of Jail Free
	Go to Jail–Go directly to jail–Do not pass Go–Do not collect $200
	Grand Opera Night—Collect $50 from every player for opening night seats
	Holiday Fund matures—Receive $100
	Income tax refund–Collect $20
	It is your birthday—Collect $10
	Life insurance matures–Collect $100
	Pay hospital fees of $100
	Pay school fees of $150
	Receive $25 consultancy fee
	You are assessed for street repairs–$40 per house–$115 per hotel
	You have won second prize in a beauty contest–Collect $10
You inherit $100*/
public class CommunityChest {
	private Random rand = new Random();
	public ArrayList<String> cards = new ArrayList<>();
	public ArrayList<String> deck = new ArrayList<>();
	private int gen;

	public void setCards() {
		cards.add("Advance to Go (Collect $200)");
		cards.add("Bank error in your favor—Collect $200");
		cards.add("Doctor's fee—Pay $50");
		cards.add("From sale of stock you get $50");
		cards.add("Get Out of Jail Free");
		cards.add("Go to Jail–Go directly to jail–Do not pass Go–Do not collect $200");
		cards.add("Grand Opera Night—Collect $50 from every player for opening night seats");
		cards.add("Holiday Fund matures—Receive $100");
		cards.add("Income tax refund–Collect $20");
		cards.add("It is your birthday—Collect $10");
		cards.add("Life insurance matures–Collect $100");
		cards.add("Pay hospital fees of $100");
		cards.add("Pay school fees of $150");
		cards.add("Receive $25 consultancy fee");
		cards.add("You are assessed for street repairs–$40 per house–$115 per hotel");
		cards.add("You have won second prize in a beauty contest–Collect $10");
		cards.add("You inherit $100");
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
		/*for (int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i));
		}*/
	}

	public void draw() {
		String drawnCard = deck.remove(0);
		System.out.println(drawnCard);
		System.out.println();
		/*for (int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i));
		}*/
	}

}