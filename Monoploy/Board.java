package Monoploy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Board {
	public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public Banker banker = new Banker();
	public BoardSpace space = new BoardSpace();
	Piece token = new Piece();
	public Player p1 = new Player();
	public Player p2 = new Player();
	public Player p3 = new Player();
	public Player p4 = new Player();
	public Player p5 = new Player();
	public Player p6 = new Player();
	public Player p7 = new Player();
	public Player p8 = new Player();
	private ArrayList<String> tunOder = new ArrayList<>();

	public void boardSetUp(int numberPlayers) throws IOException {
		setUpPlayers(numberPlayers);
		space.spacesSetUp();
		orderOfPlay(numberPlayers);
		for (int i = 0; i < numberPlayers; i++) {
			System.out.println(tunOder.get(i));
		}
	}

	private void setUpPlayers(int numberPlayers) throws IOException {
		token.createToken();
		int pnum = 2;
		for (int i = 1; i < numberPlayers; i++) {
			if (pnum == 8) {
				System.out.println("Player 8 Enter Your Name");
				p8.setName(in.readLine());
				setMoney(p8);
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p8.setToken(token.selectPiece(in.readLine()));
				System.out.println(banker.balCal(p8));
			} else if (pnum == 7) {
				System.out.println("Player 7 Enter Your Name");
				p7.setName(in.readLine());
				setMoney(p7);
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p7.setToken(token.selectPiece(in.readLine()));
				System.out.println(banker.balCal(p7));
			} else if (pnum == 6) {
				System.out.println("Player 6 Enter Your Name");
				p6.setName(in.readLine());
				setMoney(p6);
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p6.setToken(token.selectPiece(in.readLine()));
				System.out.println(banker.balCal(p6));
			} else if (pnum == 5) {
				System.out.println("Player 5 Enter Your Name");
				p5.setName(in.readLine());
				setMoney(p5);
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p5.setToken(token.selectPiece(in.readLine()));
				System.out.println(banker.balCal(p5));
			} else if (pnum == 4) {
				System.out.println("Player 4 Enter Your Name");
				p4.setName(in.readLine());
				setMoney(p4);
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p4.setToken(token.selectPiece(in.readLine()));
				System.out.println(banker.balCal(p4));
			} else if (pnum == 3) {
				System.out.println("Player 3 Enter Your Name");
				p3.setName(in.readLine());
				setMoney(p3);
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p3.setToken(token.selectPiece(in.readLine()));
				System.out.println(banker.balCal(p3));
			} else if (pnum == 2) {
				System.out.println("Player 1 Enter Your Name");
				p1.setName(in.readLine());
				setMoney(p1);
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p1.setToken(token.selectPiece(in.readLine()));
				System.out.println(banker.balCal(p1));

				System.out.println("Player 2 Enter Your Name");
				p2.setName(in.readLine());
				setMoney(p2);
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p2.setToken(token.selectPiece(in.readLine()));
				System.out.println(banker.balCal(p2));
			}
			pnum++;
		}
	}

	public void setMoney(Player player) {
		for (int i = 0; i < 3; i++) {
			player.Money[i] = 5;
		}
		player.Money[3] = 6;
		for (int i = 4; i < 7; i++) {
			player.Money[i] = 2;
		}
	}

	private void orderOfPlay(int numberPlayers) {

		int pnum = 2;
		for (int i = 1; i < numberPlayers; i++) {
			if (pnum == 8) {
				p8.diceRoll = promptForRandom(12, 2);
				System.out.println(p8.getName() +" rolls a: " + p8.diceRoll);
			} else if (pnum == 7) {
				p7.diceRoll = promptForRandom(12, 2);
				System.out.println(p7.getName() +" rolls a: " + p7.diceRoll);
			} else if (pnum == 6) {
				p6.diceRoll = promptForRandom(12, 2);
				System.out.println(p6.getName() +" rolls a: " + p6.diceRoll);
			} else if (pnum == 5) {
				p5.diceRoll = promptForRandom(12, 2);
				System.out.println(p5.getName() +" rolls a: " + p5.diceRoll);
			} else if (pnum == 4) {
				p4.diceRoll = promptForRandom(12, 2);
				System.out.println(p4.getName() +" rolls a: " + p4.diceRoll);
			} else if (pnum == 3) {
				p3.diceRoll = promptForRandom(12, 2);
				System.out.println(p3.getName() +" rolls a: " + p3.diceRoll);
			} else if (pnum == 2) {
				p1.diceRoll = promptForRandom(12, 2);
				System.out.println(p2.getName() +" rolls a: " + p1.diceRoll);
				p2.diceRoll = promptForRandom(12, 2);
				System.out.println(p1.getName() +" rolls a: " + p2.diceRoll);
			}
			pnum++;
		}

		if ((p1.diceRoll >= p2.diceRoll) && (p1.diceRoll >= p3.diceRoll) && (p1.diceRoll >= p4.diceRoll)
				&& (p1.diceRoll >= p5.diceRoll) && (p1.diceRoll >= p6.diceRoll) && (p1.diceRoll >= p7.diceRoll)
				&& (p1.diceRoll >= p8.diceRoll)) {
			tieCheck(p1);
			p1.diceRoll = 0;
			tunOder.add(p1.getName());
			pnum = 2;
			for (int i = 0; i < numberPlayers - 1; i++) {
				if (pnum == 2) {
					tunOder.add(p2.getName());
				}
				if (pnum == 3) {
					tunOder.add(p3.getName());
				}
				if (pnum == 4) {
					tunOder.add(p4.getName());
				}
				if (pnum == 5) {
					tunOder.add(p5.getName());
				}
				if (pnum == 6) {
					tunOder.add(p6.getName());
				}
				if (pnum == 7) {
					tunOder.add(p7.getName());
				}
				if (pnum == 8) {
					tunOder.add(p8.getName());
				}
				pnum++;
			}
		} else if ((p2.diceRoll >= p1.diceRoll) && (p2.diceRoll >= p3.diceRoll) && (p2.diceRoll >= p4.diceRoll)
				&& (p2.diceRoll >= p5.diceRoll) && (p2.diceRoll >= p6.diceRoll) && (p2.diceRoll >= p7.diceRoll)
				&& (p2.diceRoll >= p8.diceRoll)) {
			tieCheck(p2);
			p2.diceRoll = 0;
			tunOder.add(p2.getName());
			pnum = 2;
			for (int i = 0; i < 7; i++) {
				if (pnum == 2) {
					tunOder.add(p3.getName());
				}
				if (pnum == 3 && (numberPlayers > 3)) {
					tunOder.add(p4.getName());
				}
				if (pnum == 4 && (numberPlayers > 4)) {
					tunOder.add(p5.getName());
				}
				if (pnum == 5 && (numberPlayers > 5)) {
					tunOder.add(p6.getName());
				}
				if (pnum == 6 && (numberPlayers > 6)) {
					tunOder.add(p7.getName());
				}
				if (pnum == 7 && (numberPlayers > 7)) {
					tunOder.add(p8.getName());
				}
				if (pnum == 8) {
					tunOder.add(p1.getName());
				}
				pnum++;
			}
		} else if ((p3.diceRoll >= p1.diceRoll) && (p3.diceRoll >= p2.diceRoll) && (p3.diceRoll >= p4.diceRoll)
				&& (p3.diceRoll >= p5.diceRoll) && (p3.diceRoll >= p6.diceRoll) && (p3.diceRoll >= p7.diceRoll)
				&& (p3.diceRoll >= p8.diceRoll)) {
			tieCheck(p3);
			p3.diceRoll = 0;
			tunOder.add(p3.getName());
			pnum = 2;
			for (int i = 0; i < 7; i++) {
				if (pnum == 2 && (numberPlayers > 3)) {
					tunOder.add(p4.getName());
				}
				if (pnum == 3 && (numberPlayers > 4)) {
					tunOder.add(p5.getName());
				}
				if (pnum == 4 && (numberPlayers > 5)) {
					tunOder.add(p6.getName());
				}
				if (pnum == 5 && (numberPlayers > 6)) {
					tunOder.add(p7.getName());
				}
				if (pnum == 6 && (numberPlayers > 7)) {
					tunOder.add(p8.getName());
				}
				if (pnum == 7) {
					tunOder.add(p1.getName());
				}
				if (pnum == 8) {
					tunOder.add(p2.getName());
				}
				pnum++;
			}
		} else if ((p4.diceRoll >= p1.diceRoll) && (p4.diceRoll >= p2.diceRoll) && (p4.diceRoll >= p3.diceRoll)
				&& (p4.diceRoll >= p5.diceRoll) && (p4.diceRoll >= p6.diceRoll) && (p4.diceRoll >= p7.diceRoll)
				&& (p4.diceRoll >= p8.diceRoll)) {
			tieCheck(p4);
			p4.diceRoll = 0;
			tunOder.add(p4.getName());
			pnum = 2;
			for (int i = 0; i < 7; i++) {
				if (pnum == 2 && (numberPlayers > 4)) {
					tunOder.add(p5.getName());
				}
				if (pnum == 3 && (numberPlayers > 5)) {
					tunOder.add(p6.getName());
				}
				if (pnum == 4 && (numberPlayers > 6)) {
					tunOder.add(p7.getName());
				}
				if (pnum == 5 && (numberPlayers > 7)) {
					tunOder.add(p8.getName());
				}
				if (pnum == 6) {
					tunOder.add(p1.getName());
				}
				if (pnum == 7) {
					tunOder.add(p2.getName());
				}
				if (pnum == 8) {
					tunOder.add(p3.getName());
				}
				pnum++;
			}
		} else if ((p5.diceRoll >= p1.diceRoll) && (p5.diceRoll >= p3.diceRoll) && (p5.diceRoll >= p4.diceRoll)
				&& (p5.diceRoll >= p2.diceRoll) && (p5.diceRoll >= p6.diceRoll) && (p5.diceRoll >= p7.diceRoll)
				&& (p5.diceRoll >= p8.diceRoll)) {
			tieCheck(p5);
			p5.diceRoll = 0;
			tunOder.add(p5.getName());
			pnum = 2;
			for (int i = 0; i < 7; i++) {
				if (pnum == 2 && (numberPlayers > 5)) {
					tunOder.add(p6.getName());
				}
				if (pnum == 3 && (numberPlayers > 6)) {
					tunOder.add(p7.getName());
				}
				if (pnum == 4 && (numberPlayers > 7)) {
					tunOder.add(p8.getName());
				}
				if (pnum == 5) {
					tunOder.add(p1.getName());
				}
				if (pnum == 6) {
					tunOder.add(p2.getName());
				}
				if (pnum == 7) {
					tunOder.add(p3.getName());
				}
				if (pnum == 8) {
					tunOder.add(p4.getName());
				}
				pnum++;
			}
		} else if ((p6.diceRoll >= p1.diceRoll) && (p6.diceRoll >= p3.diceRoll) && (p6.diceRoll >= p4.diceRoll)
				&& (p6.diceRoll >= p5.diceRoll) && (p6.diceRoll >= p2.diceRoll) && (p6.diceRoll >= p7.diceRoll)
				&& (p6.diceRoll >= p8.diceRoll)) {
			tieCheck(p6);
			p6.diceRoll = 0;
			tunOder.add(p6.getName());
			pnum = 2;
			for (int i = 0; i < numberPlayers - 1; i++) {
				if (pnum == 2 && (numberPlayers > 6)) {
					tunOder.add(p7.getName());
				}
				if (pnum == 3 && (numberPlayers > 7)) {
					tunOder.add(p8.getName());
				}
				if (pnum == 4) {
					tunOder.add(p1.getName());
				}
				if (pnum == 5) {
					tunOder.add(p2.getName());
				}
				if (pnum == 6) {
					tunOder.add(p3.getName());
				}
				if (pnum == 7) {
					tunOder.add(p4.getName());
				}
				if (pnum == 8) {
					tunOder.add(p5.getName());
				}
				pnum++;
			}
		} else if ((p7.diceRoll >= p1.diceRoll) && (p7.diceRoll >= p3.diceRoll) && (p7.diceRoll >= p4.diceRoll)
				&& (p7.diceRoll >= p5.diceRoll) && (p7.diceRoll >= p6.diceRoll) && (p7.diceRoll >= p2.diceRoll)
				&& (p7.diceRoll >= p8.diceRoll)) {
			tieCheck(p7);
			p7.diceRoll = 0;
			tunOder.add(p7.getName());
			pnum = 2;
			for (int i = 0; i < numberPlayers - 1; i++) {
				if (pnum == 2 && (numberPlayers > 7)) {
					tunOder.add(p8.getName());
				}
				if (pnum == 3) {
					tunOder.add(p1.getName());
				}
				if (pnum == 4) {
					tunOder.add(p2.getName());
				}
				if (pnum == 5) {
					tunOder.add(p3.getName());
				}
				if (pnum == 6) {
					tunOder.add(p4.getName());
				}
				if (pnum == 7) {
					tunOder.add(p5.getName());
				}
				if (pnum == 8) {
					tunOder.add(p6.getName());
				}
				pnum++;
			}
		} else if ((p8.diceRoll >= p1.diceRoll) && (p8.diceRoll >= p3.diceRoll) && (p8.diceRoll >= p4.diceRoll)
				&& (p8.diceRoll >= p5.diceRoll) && (p8.diceRoll >= p6.diceRoll) && (p8.diceRoll >= p7.diceRoll)
				&& (p8.diceRoll >= p2.diceRoll)) {
			tieCheck(p8);
			p8.diceRoll = 0;
			tunOder.add(p8.getName());
			pnum = 2;
			for (int i = 0; i < numberPlayers - 1; i++) {
				if (pnum == 2) {
					tunOder.add(p1.getName());
				}
				if (pnum == 3) {
					tunOder.add(p2.getName());
				}
				if (pnum == 4) {
					tunOder.add(p3.getName());
				}
				if (pnum == 5) {
					tunOder.add(p4.getName());
				}
				if (pnum == 6) {
					tunOder.add(p5.getName());
				}
				if (pnum == 7) {
					tunOder.add(p6.getName());
				}
				if (pnum == 8) {
					tunOder.add(p7.getName());
				}
				pnum++;
			}
		}
	}

	private void tieCheck(Player player) {
		boolean noTie = false;
		while (noTie == false) {
			if (p1.diceRoll == player.diceRoll && (player != p1)) {
				p1.diceRoll = promptForRandom(12, 2);
				System.out.println(p1.getName() +" rolls a: " +  p1.diceRoll);
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() +" rolls a: " + player.diceRoll);
				if (player.diceRoll != p1.diceRoll) {
					noTie = true;
				}
			} else if (p2.diceRoll == player.diceRoll && (player != p2)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() +" rolls a: " + player.diceRoll);
				p2.diceRoll = promptForRandom(12, 2);
				System.out.println(p2.getName() +" rolls a: " + p2.diceRoll);
				if (player.diceRoll != p2.diceRoll) {
					noTie = true;
				}
			} else if (p3.diceRoll == player.diceRoll && (player != p3)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() +" rolls a: " + player.diceRoll);
				p3.diceRoll = promptForRandom(12, 2);
				System.out.println(p3.getName() +" rolls a: " + p3.diceRoll);
				if (player.diceRoll != p3.diceRoll) {
					noTie = true;
				}
			} else if (p4.diceRoll == player.diceRoll && (player != p4)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() +" rolls a: " + player.diceRoll);
				p4.diceRoll = promptForRandom(12, 2);
				System.out.println(p4.getName() +" rolls a: " + p4.diceRoll);
				if (player.diceRoll != p4.diceRoll) {
					noTie = true;
				}
			} else if (p5.diceRoll == player.diceRoll && (player != p5)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() +" rolls a: " + player.diceRoll);
				p5.diceRoll = promptForRandom(12, 2);
				System.out.println(p5.getName() +" rolls a: " + p5.diceRoll);
				if (player.diceRoll != p5.diceRoll) {
					noTie = true;
				}
			} else if (p6.diceRoll == player.diceRoll && (player != p6)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() +" rolls a: " + player.diceRoll);
				p6.diceRoll = promptForRandom(12, 2);
				System.out.println(p6.getName() +" rolls a: " + p6.diceRoll);
				if (player.diceRoll != p6.diceRoll) {
					noTie = true;
				}
			} else if (p7.diceRoll == player.diceRoll && (player != p7)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() +" rolls a: " + player.diceRoll);
				p7.diceRoll = promptForRandom(12, 2);
				System.out.println(p7.getName() +" rolls a: " + p7.diceRoll);
				if (player.diceRoll != p7.diceRoll) {
					noTie = true;
				}
			} else if (p8.diceRoll == player.diceRoll && (player != p8)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() +" rolls a: " + player.diceRoll);
				p8.diceRoll = promptForRandom(12, 2);
				System.out.println(p8.getName() +" rolls a: " + p8.diceRoll);
				if (player.diceRoll != p8.diceRoll) {
					noTie = true;
				}
			}
			else {
				noTie = true;
			}
		}
	}

	public static int promptForRandom(int max, int min) {
		Random rando = new Random();
		int rand = rando.nextInt(max - min + 1) + min;
		return rand;
	}

	public void boardPrint() {
		System.out.println(" __________________________________________________________________________________");
		System.out.println("│          │                                                          │           │");
		System.out.println("│		    │														   │ 	       │");
		System.out.println("│		    │														   │Go To      │");
		System.out.println("│		    │														   │ Jail      │");
		System.out.println("│__________│__________________________________________________________│___________│");
		System.out.println("│		    │														   │  	       │");
		System.out.println("│		    │														   │   	       │");
		System.out.println("│		    │														   │   	       │");
		System.out.println("│		    │		____________									   │  	       │");
		System.out.println("│		    │		│  Chance  │									   │  	       │");
		System.out.println("│		    │		│	Card   │ 									   │  	       │");
		System.out.println("│		    │		│__________│			← ╫						   │  	       │");
		System.out.println("│		    │									_					   │  	       │");
		System.out.println("│		    │														   │  	       │");
		System.out.println("│		    │														   │  	       │");
		System.out.println("│		    │						MONOPOLY						   │  	       │");
		System.out.println("│		    │			The Fast Dealing Property Trading Game  	   │  	       │");
		System.out.println("│		    │														   │  	       │");
		System.out.println("│		    │														   │  	       │");
		System.out.println("│		    │									   ______________	   │   	       │");
		System.out.println("│		    │									   │  Community │	   │  	       │");
		System.out.println("│		    │								       │   Chest    │	   │  	       │");
		System.out.println("│		    │									   │____________│	   │  	       │");
		System.out.println("│		    │														   │  	       │");
		System.out.println("│		    │														   │  	       │");
		System.out.println("│______________________________________________________________________________│");
		System.out.println("│   │  IN  │          │          │        │    │     │     │     │    │           │");
		System.out.println("│ J │╫╫╫╫╫ │		   │		  │ 			│     │    │	 │    │   ←       │");
		System.out.println("│ U │╫╫╫╫╫ │		   │		  │	    		│     │ 	│	 │    │   GO      │");
		System.out.println("│ S │ Jail │	  	   │	      │				│     │ 	│	  │    │  	       │");
		System.out.println("│ T │______│		   │	      │				│     │ 	│	  │    │  	       │");
		System.out.println("│ Visting  │		   │		  │ 			│     │ 	│	  │    │  	       │");
		System.out.println("│__________│__________│__________│_____________│_____│_____│_____│____│___________│");
	}
}
