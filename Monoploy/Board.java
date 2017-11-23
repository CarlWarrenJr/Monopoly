package Monoploy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Board {
	public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public Banker banker = new Banker();
	public Player p1 = new Player();
	public Player p2 = new Player();
	public Player p3 = new Player();
	public Player p4 = new Player();
	public Player p5 = new Player();
	public Player p6 = new Player();
	public Player p7 = new Player();
	public Player p8 = new Player();

	public void boardSetUp(int numberPlayers) throws IOException {
		setUpPlayers(numberPlayers);
	}

	private void setUpPlayers(int numberPlayers) throws IOException {
		int pnum = 2;
		for (int i = 0; i < numberPlayers; i++) {
		if (pnum == 8) {
			System.out.println("Player 8 Enter Your Name");
			p8.name = in.readLine();
		} else if (pnum == 7) {
			System.out.println("Player 7 Enter Your Name");
			p7.name = in.readLine();
		} else if (pnum == 6) {
			System.out.println("Player 6 Enter Your Name");
			p6.name = in.readLine();
		} else if (pnum == 5) {
			System.out.println("Player 5 Enter Your Name");
			p5.name = in.readLine();
		} else if (pnum == 4) {
			System.out.println("Player 4 Enter Your Name");
			p4.name = in.readLine();
		} else if (pnum == 3) {
			System.out.println("Player 3 Enter Your Name");
			p3.name = in.readLine();
		} else if (pnum == 2) {
			System.out.println("Player 1 Enter Your Name");
			p1.name = in.readLine();
			System.out.println("Player 2 Enter Your Name");
			p2.name = in.readLine();
		}
		pnum++;
		}
		for (int i = 0; i < numberPlayers; i++) {
			// player instance.money.add(banker.bill500).... for all the bills
		}

	}

	public void boardPrint() {
		System.out.println("┌───────────┬──────────────────────────────────────────────────────────────┬───────────┐");
		System.out.println("│           │                                                              │           │");
		System.out.println("│		    │														       │           │");
		System.out.println("│		    │														       │Go To      │");
		System.out.println("│		    │														       │ Jail      │");
		System.out.println("│───────────┼──────────────────────────────────────────────────────────────┼───────────┤");
		System.out.println("│		    │														       │    	   │");
		System.out.println("│		    │														       │   	       │");
		System.out.println("│		    │														       │   	       │");
		System.out.println("│		    │		┌──────────┐									       │  	       │");
		System.out.println("│		    │		│  Chance  │									       │  	       │");
		System.out.println("│		    │		│	Card   │ 									       │  	       │");
		System.out.println("│		    │		└──────────┘			← ╫	┼	─	│	╔ ╗╚ ╝║	═      │  	       │");
		System.out.println("│		    │									┌ ┐└ ┘┤├ ┴ ┬   		       │  	       │");
		System.out.println("│		    │												╩		       │  	       │");
		System.out.println("│		    │														       │   	       │");
		System.out.println("│		    │						MONOPOLY™						       │  	       │");
		System.out.println("│		    │			♦The Fast Dealing Property Trading Game♦  	       │  	       │");
		System.out.println("│		    │														       │  	       │");
		System.out.println("│		    │														       │  	       │");
		System.out.println("│		    │									   ┌────────────┐	       │   	       │");
		System.out.println("│		    │									   │  Community │	       │  	       │");
		System.out.println("│		    │								       │   Chest    │	       │  	       │");
		System.out.println("│		    │									   └────────────┘	       │  	       │");
		System.out.println("│		    │														       │           │");
		System.out.println("│		    │														       │  	       │");
		System.out.println("│───┬───────┼──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┼───────────┤");
		System.out.println("│ J │  IN   │      │      │┌────┐│      │      │      │      │Com   │      │           │");
		System.out.println("│ U │ ╫╫╫╫  ├──────┼──────┤│┌─┐ │├──────┼──────┼──────┼──────┤Chest ├──────┤   ←       │");
		System.out.println("│ S │ ╫╫╫╫  │	   │      │└┘┌┘ ││	    │      │      │      │	╔╗  │      │   GO      │");
		System.out.println("│ T │ Jail  │	   │      │	 │ ┌┘│	    │      │      │      │╔═╩╩═╗│      │           │");
		System.out.println("│   └───────┤      │      │	  ●  │   	│      │      │	     │║║║║║║│      │           │");
		System.out.println("│ Visting   │	   │      │Chance│      │      │      │      │╚════╝│      │  	       │");
		System.out.println("└───────────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴───────────┘");
	}
}