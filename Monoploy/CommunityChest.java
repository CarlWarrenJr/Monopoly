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
		/*
		 * for (int i = 0; i < deck.size(); i++) { System.out.println(deck.get(i)); }
		 */
	}

	public void draw(Player current, int space, Player p1, Player p2, Player p3, Player p4, Player p5, Player p6,
			Player p7, Player p8, ArrayList<String> turnOrder) {
		String drawnCard = deck.remove(0);
		System.out.println(drawnCard);
		System.out.println();
		int moveTo;
		switch (drawnCard) {
		case ("Advance to Go (Collect $200)"):
			moveTo = 0;
			move(current, moveTo);
			current.bal += 200;
			break;
		case ("Bank error in your favor—Collect $200"):
			current.bal += 200;
			break;
		case ("Doctor's fee—Pay $50"):
			current.bal -= 50;
			break;
		case ("From sale of stock you get $50"):
			current.bal += 50;
			break;
		case ("Get Out of Jail Free"):
			current.ownedProperties.add("Get Out of Jail Free");
			break;
		case ("Go to Jail–Go directly to jail–Do not pass Go–Do not collect $200"):
			moveTo = 10;
			move(current, moveTo);
			current.inJail = true;
			break;
		case ("Grand Opera Night—Collect $50 from every player for opening night seats"):
			int goThrough = 2;
			if (current.getName().equals(p1.getName())) {

				for (int i = 0; i < turnOrder.size() - 1; i++) {
					current.bal += 50;
					if (goThrough == 2) {
						p2.bal -= 50;
					} else if (goThrough == 3) {
						p3.bal -= 50;
					} else if (goThrough == 4) {
						p4.bal -= 50;
					} else if (goThrough == 5) {
						p5.bal -= 50;
					} else if (goThrough == 6) {
						p6.bal -= 50;
					} else if (goThrough == 7) {
						p7.bal -= 50;
					} else if (goThrough == 8) {
						p8.bal -= 50;
					}
					goThrough++;
				}
			} else if (current.getName().equals(p2.getName())) {
				for (int i = 0; i < turnOrder.size() - 1; i++) {
					current.bal+=50;
					if (goThrough == 2) {
						p1.bal -= 50;
					} else if (goThrough == 3) {
						p3.bal -= 50;
					} else if (goThrough == 4) {
						p4.bal -= 50;
					} else if (goThrough == 5) {
						p5.bal -= 50;
					} else if (goThrough == 6) {
						p6.bal -= 50;
					} else if (goThrough == 7) {
						p7.bal -= 50;
					} else if (goThrough == 8) {
						p8.bal -= 50;
					}
					goThrough++;
				}
			} else if (current.getName().equals(p3.getName())) {
				for (int i = 0; i < turnOrder.size() - 1; i++) {
					current.bal+=50;
					if (goThrough == 2) {
						p2.bal -= 50;
					} else if (goThrough == 3) {
						p1.bal -= 50;
					} else if (goThrough == 4) {
						p4.bal -= 50;
					} else if (goThrough == 5) {
						p5.bal -= 50;
					} else if (goThrough == 6) {
						p6.bal -= 50;
					} else if (goThrough == 7) {
						p7.bal -= 50;
					} else if (goThrough == 8) {
						p8.bal -= 50;
					}
					goThrough++;
				}
			} else if (current.getName().equals(p4.getName())) {
				for (int i = 0; i < turnOrder.size() - 1; i++) {
					current.bal+=50;
					if (goThrough == 2) {
						p2.bal -= 50;
					} else if (goThrough == 3) {
						p3.bal -= 50;
					} else if (goThrough == 4) {
						p1.bal -= 50;
					} else if (goThrough == 5) {
						p5.bal -= 50;
					} else if (goThrough == 6) {
						p6.bal -= 50;
					} else if (goThrough == 7) {
						p7.bal -= 50;
					} else if (goThrough == 8) {
						p8.bal -= 50;
					}
					goThrough++;
				}
			} else if (current.getName().equals(p5.getName())) {
				for (int i = 0; i < turnOrder.size() - 1; i++) {
					current.bal+=50;
					if (goThrough == 2) {
						p2.bal -= 50;
					} else if (goThrough == 3) {
						p3.bal -= 50;
					} else if (goThrough == 4) {
						p4.bal -= 50;
					} else if (goThrough == 5) {
						p1.bal -= 50;
					} else if (goThrough == 6) {
						p6.bal -= 50;
					} else if (goThrough == 7) {
						p7.bal -= 50;
					} else if (goThrough == 8) {
						p8.bal -= 50;
					}
					goThrough++;
				}
			} else if (current.getName().equals(p6.getName())) {
				for (int i = 0; i < turnOrder.size() - 1; i++) {
					current.bal+=50;
					if (goThrough == 2) {
						p2.bal -= 50;
					} else if (goThrough == 3) {
						p3.bal -= 50;
					} else if (goThrough == 4) {
						p4.bal -= 50;
					} else if (goThrough == 5) {
						p5.bal -= 50;
					} else if (goThrough == 6) {
						p1.bal -= 50;
					} else if (goThrough == 7) {
						p7.bal -= 50;
					} else if (goThrough == 8) {
						p8.bal -= 50;
					}
					goThrough++;
				}
			} else if (current.getName().equals(p7.getName())) {
				for (int i = 0; i < turnOrder.size() - 1; i++) {
					current.bal+=50;
					if (goThrough == 2) {
						p2.bal -= 50;
					} else if (goThrough == 3) {
						p3.bal -= 50;
					} else if (goThrough == 4) {
						p4.bal -= 50;
					} else if (goThrough == 5) {
						p5.bal -= 50;
					} else if (goThrough == 6) {
						p6.bal -= 50;
					} else if (goThrough == 7) {
						p1.bal -= 50;
					} else if (goThrough == 8) {
						p8.bal -= 50;
					}
					goThrough++;
				}
			} else {
				for (int i = 0; i < turnOrder.size() - 1; i++) {
					current.bal+=50;
					if (goThrough == 2) {
						p2.bal -= 50;
					} else if (goThrough == 3) {
						p3.bal -= 50;
					} else if (goThrough == 4) {
						p4.bal -= 50;
					} else if (goThrough == 5) {
						p5.bal -= 50;
					} else if (goThrough == 6) {
						p6.bal -= 50;
					} else if (goThrough == 7) {
						p7.bal -= 50;
					} else if (goThrough == 8) {
						p1.bal -= 50;
					}
					goThrough++;
				}
			}
			break;
		case ("Holiday Fund matures—Receive $100"):
			current.bal+=100;
			break;
		case ("Income tax refund–Collect $20"):
			current.bal+=20;
			break;
		case ("It is your birthday—Collect $10"):
			current.bal+=10;
			break;
		case ("Life insurance matures–Collect $100"):
			current.bal+=100;
			break;
		case ("Pay hospital fees of $100"):
			current.bal-=100;
			break;
		case ("Pay school fees of $150"):
			current.bal-=150;
			break;
		case ("Receive $25 consultancy fee"):
			current.bal+=25;
			break;
		case ("You are assessed for street repairs–$40 per house–$115 per hotel"):
			//come back later
			break;
		case ("You have won second prize in a beauty contest–Collect $10"):
			current.bal+=10;
			break;
		case ("You inherit $100"):
			current.bal+=100;
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