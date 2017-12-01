package Monoploy;

import java.util.Arrays;

public class BoardSpace {

	public void spacesInitalize(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7,
			Player p8) {
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

	public void spaceName(Player player, int space) {
		if (space == 0) {
			System.out.println(player.getName() + "'s current space is the Go Square");
		} else if (space == 1) {
			System.out.println(player.getName() + "'s current space is the Mediterranean Avenue!");
		} else if (space == 2) {
			System.out.println(player.getName() + "'s current space is the COMMUNITY CHEST!");
		} else if (space == 3) {
			System.out.println(player.getName() + "'s current space is the BALTIC AVENUE!");
		} else if (space == 4) {
			System.out.println(player.getName() + "'s current space is the INCOME TAX!");
		} else if (space == 5) {
			System.out.println(player.getName() + "'s current space is the READING RAILROAD!");
		} else if (space == 6) {
			System.out.println(player.getName() + "'s current space is the ORIENTAL AVENUE!");
		} else if (space == 7) {
			System.out.println(player.getName() + "'s current space is the CHANCE!");
		} else if (space == 8) {
			System.out.println(player.getName() + "'s current space is the VERMONT AVENUE!");
		} else if (space == 9) {
			System.out.println(player.getName() + "'s current space is the CONNETICUT AVENUE!");
		} else if (space == 10) {
			System.out.print(player.getName() + "'s current space is the JAIL:");
			if (player.inJail == true) {
				System.out.print(" IN JAIL!");
				System.out.println();
			}
			else {
				System.out.print(" Just Visting!");
				System.out.println();
			}
		} else if (space == 11) {
			System.out.println(player.getName() + "'s current space is the ST. CHARLES PLACE!");
		} else if (space == 12) {
			System.out.println(player.getName() + "'s current space is the ELECTRIC COMPANY!");
		} else if (space == 13) {
			System.out.println(player.getName() + "'s current space is the STATES AVENUE!");
		} else if (space == 14) {
			System.out.println(player.getName() + "'s current space is the VIRGINIA AVENUE!");
		} else if (space == 15) {
			System.out.println(player.getName() + "'s current space is the PENNSYLVANIA RAILROAD!");
		} else if (space == 16) {
			System.out.println(player.getName() + "'s current space is the ST. JAMES PLACE!");
		} else if (space == 17) {
			System.out.println(player.getName() + "'s current space is the COMMUNITY CHEST!");
		} else if (space == 18) {
			System.out.println(player.getName() + "'s current space is the TENNESEE AVENU!");
		} else if (space == 19) {
			System.out.println(player.getName() + "'s current space is the NEW YORK AVENUE!");
		} else if (space == 20) {
			System.out.println(player.getName() + "'s current space is the FREE PARKING!");
		} else if (space == 21) {
			System.out.println(player.getName() + "'s current space is the KENTUKY AVENUE!");
		} else if (space == 22) {
			System.out.println(player.getName() + "'s current space is the CHANCE!");
		} else if (space == 23) {
			System.out.println(player.getName() + "'s current space is the INDIANA AVENUE!");
		} else if (space == 24) {
			System.out.println(player.getName() + "'s current space is the ILLINOIS Avenue!");
		} else if (space == 25) {
			System.out.println(player.getName() + "'s current space is the B&O RAILROAD!");
		} else if (space == 26) {
			System.out.println(player.getName() + "'s current space is the ATLANTIC AVENUE!");
		} else if (space == 27) {
			System.out.println(player.getName() + "'s current space is the VENTOR AVENU!");
		} else if (space == 28) {
			System.out.println(player.getName() + "'s current space is the WATER WORKS!");
		} else if (space == 29) {
			System.out.println(player.getName() + "'s current space is the MARVIN GARDENS!");
		} else if (space == 30) {
			System.out.println(player.getName() + "'s current space is the GO TO JAIL!");
		} else if (space == 31) {
			System.out.println(player.getName() + "'s current space is the PACIFIC AVENUE!");
		} else if (space == 32) {
			System.out.println(player.getName() + "'s current space is the NORTH CAROLINA AVENUE!");
		} else if (space == 33) {
			System.out.println(player.getName() + "'s current space is the COMMUNITY CHEST!");
		} else if (space == 34) {
			System.out.println(player.getName() + "'s current space is the PENNSYLVANIA AVENUE!");
		} else if (space == 35) {
			System.out.println(player.getName() + "'s current space is the SHORT LINE!");
		} else if (space == 36) {
			System.out.println(player.getName() + "'s current space is the CHANCE!");
		} else if (space == 37) {
			System.out.println(player.getName() + "'s current space is the PARK PLACE!");
		} else if (space == 38) {
			System.out.println(player.getName() + "'s current space is the LUXUARY TAX!");
		} else if (space == 39) {
			System.out.println(player.getName() + "'s current space is the BOARDWALK!");
		} 
	}
	
	public void spaceChange(Player player, int space) {
		int hi = player.diceRoll+player.diceRoll2 + space;
		if (hi > 40) {
			space -= 40;
		}
		for (int i = 0; i < player.space.length; i++) {
			player.space[i] = "1";
		}
		player.space[space + player.diceRoll+player.diceRoll2] = "0";
	}
}