package Monoploy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BoardSpace {
	ChanceCard chance = new ChanceCard();
	CommunityChest chest = new CommunityChest();
	private boolean chanceDraw = true;
	private String jailMenu = "You are in Jail! These are your options:\n1:Try to Roll For Doubles 2.Trade with Others Free Card 3: Build on Propeties\n4: Morgage Property 5:Pay $50 Fine";
	public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public void spacesInitalize(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7,
			Player p8) {
		chance.setCards();
		chest.setCards();
		for (int i = 0; i < p1.space.length; i++) {
			p1.space[i] = "1";
			p2.space[i] = "1";
			p3.space[i] = "1";
			p4.space[i] = "1";
			p5.space[i] = "1";
			p6.space[i] = "1";
			p7.space[i] = "1";
			p8.space[i] = "1";
		}
		p1.space[0] = "0";
		p2.space[0] = "0";
		p3.space[0] = "0";
		p4.space[0] = "0";
		p5.space[0] = "0";
		p6.space[0] = "0";
		p7.space[0] = "0";
		p8.space[0] = "0";
	}

	public int spaceFind(Player player) {
		int playerSpace = 50;
		for (int i = 0; i < player.space.length; i++) {
			if (player.space[i] == "0") {
				playerSpace = Arrays.asList(player.space).indexOf("0");
			}
		}
		return playerSpace;
	}

	public void spaceName(Player player, int space, Banker banker, Player p1, Player p2, Player p3, Player p4,
			Player p5, Player p6, Player p7, Player p8, ArrayList<String> turnOrder) throws IOException {
		if (space == 0) {
			if (player.startedOn == false) {
				player.startedOn = true;
				System.out.println(player.getName() + "'s current space is the Go Square");
				if (player.firstGo == false) {
					passGo(player);
				}
			} else {
				System.out.println(player.getName() + "'s current space is the Go Square");
				player.startedOn = false;
			}
			player.firstGo = false;
		} else if (space == 1) {
			System.out.println(player.getName() + "'s current space is the Mediterranean Avenue!");
			if (banker.properties.contains("Mediterranean Avenue")) {
				buyit("Mediterranean Avenue", player, banker);
			}
		} else if (space == 2) {
			if (player.startedOn = false) {
				player.startedOn = true;
				System.out.println(player.getName() + "'s current space is the COMMUNITY CHEST!");
			} else {
				System.out.println(player.getName() + "'s current space is the COMMUNITY CHEST!");
				player.startedOn = false;
			}

		} else if (space == 3) {
			System.out.println(player.getName() + "'s current space is the BALTIC AVENUE!");
			if (banker.properties.contains("Baltic Avenue")) {
				buyit("Baltic Avenue", player, banker);
			}
		} else if (space == 4) {
			if (player.startedOn = false) {
				player.startedOn = true;
				System.out.println(player.getName() + "'s current space is the INCOME TAX!");
			} else {
				System.out.println(player.getName() + "'s current space is the INCOME TAX!");
				player.startedOn = false;
			}
		} else if (space == 5) {
			System.out.println(player.getName() + "'s current space is the READING RAILROAD!");
			if (banker.properties.contains("Reading Railroad")) {
				buyit("Reading Railroad", player, banker);
			}
		} else if (space == 6) {
			System.out.println(player.getName() + "'s current space is the ORIENTAL AVENUE!");
			if (banker.properties.contains("Oriental Avenue")) {
				buyit("Oriental Avenue", player, banker);
			}
		} else if (space == 7) {
			if (chanceDraw == true) {
				chanceDraw = false;
				chance.draw(player, space, p1, p2, p3, p4, p5, p6, p7, p8, turnOrder);
				System.out.println(player.getName() + "'s current space is the CHANCE!");
			} else {
				System.out.println(player.getName() + "'s current space is the CHANCE!");
				chanceDraw = true;
			}
		} else if (space == 8) {
			System.out.println(player.getName() + "'s current space is the VERMONT AVENUE!");
			if (banker.properties.contains("Vermont Avenue")) {
				buyit("Vermont Avenue", player, banker);
			}
		} else if (space == 9) {
			System.out.println(player.getName() + "'s current space is the CONNETICUT AVENUE!");
			if (banker.properties.contains("Conneticut Avenue")) {
				buyit("Conneticut Avenue", player, banker);
			}
		} else if (space == 10) {
			System.out.print(player.getName() + "'s current space is the JAIL:");
			if (player.inJail == true) {
				System.out.print(" IN JAIL!");
				int jail = promptForInt(jailMenu, 1, 5);
				if (jail == 1) {
					player.diceRoll = promptForRandom(6, 1);
					player.diceRoll2 = promptForRandom(6, 1);
					if (player.diceRoll == player.diceRoll2) {
						player.inJail = false;
					}
				} else if (jail == 2) {
					// Buy/Use Get out of Jail Free Card and Trade with others
				} else if (jail == 3) {
					// Build on Properties
				} else if (jail == 4) {
					// Mortgage
				} else if (jail == 5) {
					player.bal -= 50;
					System.out.println(player.getName() + " Has payed a Fine of $50 and is no longer in Jail.");
					player.inJail = false;
				}
			} else {
				System.out.print(" Just Visting!");
				System.out.println();
			}
		} else if (space == 11) {
			System.out.println(player.getName() + "'s current space is the ST. CHARLES PLACE!");
			if (banker.properties.contains("St. Charles Place")) {
				buyit("St. Charles Place", player, banker);
			}
		} else if (space == 12) {
			System.out.println(player.getName() + "'s current space is the ELECTRIC COMPANY!");
			if (banker.properties.contains("Electric Company")) {
				buyit("Electric Company", player, banker);
			}
		} else if (space == 13) {
			System.out.println(player.getName() + "'s current space is the STATES AVENUE!");
			if (banker.properties.contains("States Avenue")) {
				buyit("States Avenue", player, banker);
			}
		} else if (space == 14) {
			System.out.println(player.getName() + "'s current space is the VIRGINIA AVENUE!");
			if (banker.properties.contains("Virginia Avenue")) {
				buyit("Virginia Avenue", player, banker);
			}
		} else if (space == 15) {
			System.out.println(player.getName() + "'s current space is the PENNSYLVANIA RAILROAD!");
			if (banker.properties.contains("Pennsylvania Railroad")) {
				buyit("Pennsylvania Railroad", player, banker);
			}
		} else if (space == 16) {
			System.out.println(player.getName() + "'s current space is the ST. JAMES PLACE!");
			if (banker.properties.contains("St. James Place")) {
				buyit("St. James Place", player, banker);
			}
		} else if (space == 17) {
			if (player.startedOn = false) {
				player.startedOn = true;
				System.out.println(player.getName() + "'s current space is the COMMUNITY CHEST!");
			} else {
				System.out.println(player.getName() + "'s current space is the COMMUNITY CHEST!");
				player.startedOn = false;
			}
		} else if (space == 18) {
			System.out.println(player.getName() + "'s current space is the TENNESEE AVENUE!");
			if (banker.properties.contains("Tennesee Avenue")) {
				buyit("Tennesee Avenue", player, banker);
			}
		} else if (space == 19) {
			System.out.println(player.getName() + "'s current space is the NEW YORK AVENUE!");
			if (banker.properties.contains("New York Avenue")) {
				buyit("New York Avenue", player, banker);
			}
		} else if (space == 20) {
			System.out.println(player.getName() + "'s current space is the FREE PARKING!");
		} else if (space == 21) {
			System.out.println(player.getName() + "'s current space is the KENTUKY AVENUE!");
			if (banker.properties.contains("Kentucky Avenue")) {
				buyit("Kentucky Avenue", player, banker);
			}
		} else if (space == 22) {
			if (chanceDraw == true) {
				chanceDraw = false;
				chance.draw(player, space, p1, p2, p3, p4, p5, p6, p7, p8, turnOrder);
				System.out.println(player.getName() + "'s current space is the CHANCE!");
			} else {
				System.out.println(player.getName() + "'s current space is the CHANCE!");
				chanceDraw = true;
			}
		} else if (space == 23) {
			System.out.println(player.getName() + "'s current space is the INDIANA AVENUE!");
			if (banker.properties.contains("Indiana Avenue")) {
				buyit("Indiana Avenue", player, banker);
			}
		} else if (space == 24) {
			System.out.println(player.getName() + "'s current space is the ILLINOIS Avenue!");
			if (banker.properties.contains("Illinois Avenue")) {
				buyit("Illinois Avenue", player, banker);
			}
		} else if (space == 25) {
			System.out.println(player.getName() + "'s current space is the B&O RAILROAD!");
			if (banker.properties.contains("B&O Railroad")) {
				buyit("B&O Railroad", player, banker);
			}
		} else if (space == 26) {
			System.out.println(player.getName() + "'s current space is the ATLANTIC AVENUE!");
			if (banker.properties.contains("Atlantic Avenue")) {
				buyit("Atlantic Avenue", player, banker);
			}
		} else if (space == 27) {
			System.out.println(player.getName() + "'s current space is the VENTNOR AVENUE!");
			if (banker.properties.contains("Ventnor Avenue")) {
				buyit("Ventnor Avenue", player, banker);
			}
		} else if (space == 28) {
			System.out.println(player.getName() + "'s current space is the WATER WORKS!");
			if (banker.properties.contains("Water Works")) {
				buyit("Water Works", player, banker);
			}
		} else if (space == 29) {
			System.out.println(player.getName() + "'s current space is the MARVIN GARDENS!");
			if (banker.properties.contains("Marvin Gardens")) {
				buyit("Marvin Gardens", player, banker);
			}
		} else if (space == 30) {
			System.out.println(player.getName() + "'s current space is the GO TO JAIL!");
			System.out.println(player.getName() + "is Sent to Jail");
			player.inJail = true;
			spaceChange(player, 10);

		} else if (space == 31) {
			System.out.println(player.getName() + "'s current space is the PACIFIC AVENUE!");
			if (banker.properties.contains("Pacific Avenue")) {
				buyit("Pacific Avenue", player, banker);
			}
		} else if (space == 32) {
			System.out.println(player.getName() + "'s current space is the NORTH CAROLINA AVENUE!");
			if (banker.properties.contains("North Carolina Avenue")) {
				buyit("North Carolina Avenue", player, banker);
			}
		} else if (space == 33) {
			if (player.startedOn = false) {
				player.startedOn = true;
				System.out.println(player.getName() + "'s current space is the COMMUNITY CHEST!");
			} else {
				System.out.println(player.getName() + "'s current space is the COMMUNITY CHEST!");
				player.startedOn = false;
			}
		} else if (space == 34) {
			System.out.println(player.getName() + "'s current space is the PENNSYLVANIA AVENUE!");
			if (banker.properties.contains("Pennsylvania Avenue")) {
				buyit("Pennsylvania Avenue", player, banker);
			}
		} else if (space == 35) {
			System.out.println(player.getName() + "'s current space is the SHORT LINE!");
			if (banker.properties.contains("Short Line")) {
				buyit("Short Line", player, banker);
			}
		} else if (space == 36) {
			if (chanceDraw == true) {
				chanceDraw = false;
				chance.draw(player, space, p1, p2, p3, p4, p5, p6, p7, p8, turnOrder);
				System.out.println(player.getName() + "'s current space is the CHANCE!");
			} else {
				System.out.println(player.getName() + "'s current space is the CHANCE!");
				chanceDraw = true;
			}
		} else if (space == 37) {
			System.out.println(player.getName() + "'s current space is the PARK PLACE!");
			if (banker.properties.contains("Park Place")) {
				buyit("Park Place", player, banker);
			}
		} else if (space == 38) {
			if (player.startedOn = false) {
				player.startedOn = true;
				System.out.println(player.getName() + "'s current space is the LUXUARY TAX!");
			} else {
				System.out.println(player.getName() + "'s current space is the LUXUARY TAX!");
				player.startedOn = false;
			}
		} else if (space == 39) {
			System.out.println(player.getName() + "'s current space is the BOARDWALK!");
			if (banker.properties.contains("Board Walk")) {
				buyit("Board Walk", player, banker);
			}
		}
	}

	private void buyit(String proprty, Player player, Banker banker) throws IOException {
		String response = "";
		String notEnoughMoney = "";
		int cost = price(proprty);

		do {
			System.out.println("Do you want to " + proprty + " for " + cost + "?");
			response = in.readLine();
		} while (!(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("n")
				|| response.equalsIgnoreCase("no")));
		if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
			if (player.bal >= cost) {
				player.bal -= cost;
				player.ownedProperties.add(proprty);
				banker.buyPropertyFromBank(proprty);
			} else {
				do {
					System.out.println("Do you want to mortgage/demolish to get this property");
					notEnoughMoney = in.readLine();
				} while (!(response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")
						|| response.equalsIgnoreCase("n") || response.equalsIgnoreCase("no")));
				if (notEnoughMoney.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
					// let them sell for money
				} else {
					// auction
				}
			}
		} else {
			// auction
		}
	}

	private int price(String propertyCost) {
		int cost = 0;
		switch (propertyCost) {
		case ("Atlantic Avenue"):
			cost = 260;
			break;
		case ("B & O Railroad"):
			cost = 200;
			break;
		case ("Baltic Avenue"):
			cost = 60;
			break;
		case ("Boardwalk"):
			cost = 400;
			break;
		case ("Connecticut Avenue"):
			cost = 120;
			break;
		case ("Electric Company"):
			cost = 150;
			break;
		case ("Illinois Avenue"):
			cost = 240;
			break;
		case ("Indiana Avenue"):
			cost = 220;
			break;
		case ("Kentucky Avenue"):
			cost = 220;
			break;
		case ("Marvin Gardens"):
			cost = 280;
			break;
		case ("Mediterranean Avenue"):
			cost = 60;
			break;
		case ("New York Avenue"):
			cost = 200;
			break;
		case ("North Carolina Avenue"):
			cost = 300;
			break;
		case ("Oriental Avenue"):
			cost = 100;
			break;
		case ("Pacific Avenue"):
			cost = 300;
			break;
		case ("Park Place"):
			cost = 350;
			break;
		case ("Pennsylvania Avenue"):
			cost = 320;
			break;
		case ("Pennsylvania Railroad"):
			cost = 200;
			break;
		case ("Reading Railroad"):
			cost = 200;
			break;
		case ("Short Line"):
			cost = 200;
			break;
		case ("St. Charles Place"):
			cost = 140;
			break;
		case ("St. James Place"):
			cost = 180;
			break;
		case ("States Avenue"):
			cost = 140;
			break;
		case ("Tennessee Avenue"):
			cost = 180;
			break;
		case ("Ventnor Avenue"):
			cost = 260;
			break;
		case ("Vermont Avenue"):
			cost = 100;
			break;
		case ("Virginia Avenue"):
			cost = 160;
			break;
		case ("Water Works"):
			cost = 150;
			break;
		}
		return cost;
	}

	public void spaceChange(Player player, int space) {
		if (player.inJail == false) {
			int hi = player.diceRoll + player.diceRoll2 + space;
			if (hi > 39) {
				space -= 40;
				passGo(player);
			}
			for (int i = 0; i < player.space.length; i++) {
				player.space[i] = "1";
			}
			player.space[space + player.diceRoll + player.diceRoll2] = "0";
		} else {
			for (int i = 0; i < player.space.length; i++) {
				player.space[i] = "1";
			}
			player.space[10] = "0";
		}
	}

	public void passGo(Player player) {
		player.bal = player.bal + 200;
		System.out.println(player.getName() + " has passsed GO and Collected $200. New Balance: " + player.bal);
	}

	public int promptForRandom(int max, int min) {
		Random rando = new Random();
		int rand = rando.nextInt(max - min + 1) + min;
		return rand;
	}

	public int promptForInt(String prompt, int min, int max) throws IOException {
		int returnValue = 0;
		boolean isValidInput = false;

		while (!isValidInput) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				returnValue = Integer.parseInt(rawInput);
				if (returnValue >= min && returnValue <= max) {
					isValidInput = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("You Must Give Me A Valid Integer.");
			}
		}
		return returnValue;
	}
}