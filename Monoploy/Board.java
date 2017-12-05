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
	private String Menu = "What would you Like to do? \n1: Roll Dice 2: Trade with another 3: Build Houses/Hotels 4: Mortgage a Property";

	public void boardSetUp(int numberPlayers) throws IOException {
		setUpPlayers(numberPlayers);
		banker.propertiesToBanker();
		space.spacesInitalize(p1, p2, p3, p4, p5, p6, p7, p8);
		orderOfPlay(numberPlayers);
		System.out.println("Turn Order is as Follows: ");
		String kimp = p1.getName() + ":" + p1.getToken();
		if (tunOder.get(0).matches(kimp)) {
		tunOder.remove(null);
		}
		if (numberPlayers == 2 && !(tunOder.get(0).matches(kimp))) {
			tunOder.remove(1);
		}
		for (int i = 0; i < numberPlayers; i++) {
			System.out.println(tunOder.get(i));
		}
		space.spacesInitalize(p1, p2, p3, p4, p5, p6, p7, p8);
	}

	private void setUpPlayers(int numberPlayers) throws IOException {
		token.createToken();
		int pnum = 2;
		for (int i = 1; i < numberPlayers; i++) {
			if (pnum == 8) {
				System.out.println("Player 8 Enter Your Name");
				p8.setName(in.readLine());
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p8.setToken(token.selectPiece(in.readLine()));
				System.out.println(p8.bal);
			} else if (pnum == 7) {
				System.out.println("Player 7 Enter Your Name");
				p7.setName(in.readLine());
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p7.setToken(token.selectPiece(in.readLine()));
				System.out.println(p7.bal);
			} else if (pnum == 6) {
				System.out.println("Player 6 Enter Your Name");
				p6.setName(in.readLine());
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p6.setToken(token.selectPiece(in.readLine()));
				System.out.println(p6.bal);
			} else if (pnum == 5) {
				System.out.println("Player 5 Enter Your Name");
				p5.setName(in.readLine());
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p5.setToken(token.selectPiece(in.readLine()));
				System.out.println(p5.bal);
			} else if (pnum == 4) {
				System.out.println("Player 4 Enter Your Name");
				p4.setName(in.readLine());
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p4.setToken(token.selectPiece(in.readLine()));
				System.out.println(p4.bal);
			} else if (pnum == 3) {
				System.out.println("Player 3 Enter Your Name");
				p3.setName(in.readLine());
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p3.setToken(token.selectPiece(in.readLine()));
				System.out.println(p3.bal);
			} else if (pnum == 2) {
				System.out.println("Player 1 Enter Your Name");
				p1.setName(in.readLine());
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p1.setToken(token.selectPiece(in.readLine()));
				System.out.println(p1.bal);

				System.out.println("Player 2 Enter Your Name");
				p2.setName(in.readLine());
				System.out.println(token.piece);
				System.out.println("Enter the Token you want.");
				p2.setToken(token.selectPiece(in.readLine()));
				System.out.println(p2.bal);
			}
			pnum++;
		}
	}

	private void orderOfPlay(int numberPlayers) {

		int pnum = 2;
		for (int i = 1; i < numberPlayers; i++) {
			if (pnum == 8) {
				p8.diceRoll = promptForRandom(12, 2);
				System.out.println(p8.getName() + " rolls a: " + p8.diceRoll);
			} else if (pnum == 7) {
				p7.diceRoll = promptForRandom(12, 2);
				System.out.println(p7.getName() + " rolls a: " + p7.diceRoll);
			} else if (pnum == 6) {
				p6.diceRoll = promptForRandom(12, 2);
				System.out.println(p6.getName() + " rolls a: " + p6.diceRoll);
			} else if (pnum == 5) {
				p5.diceRoll = promptForRandom(12, 2);
				System.out.println(p5.getName() + " rolls a: " + p5.diceRoll);
			} else if (pnum == 4) {
				p4.diceRoll = promptForRandom(12, 2);
				System.out.println(p4.getName() + " rolls a: " + p4.diceRoll);
			} else if (pnum == 3) {
				p3.diceRoll = promptForRandom(12, 2);
				System.out.println(p3.getName() + " rolls a: " + p3.diceRoll);
			} else if (pnum == 2) {
				p1.diceRoll = promptForRandom(12, 2);
				System.out.println(p1.getName() + " rolls a: " + p1.diceRoll);
				p2.diceRoll = promptForRandom(12, 2);
				System.out.println(p2.getName() + " rolls a: " + p2.diceRoll);
			}
			pnum++;
		}

		if ((p1.diceRoll >= p2.diceRoll) && (p1.diceRoll >= p3.diceRoll) && (p1.diceRoll >= p4.diceRoll)
				&& (p1.diceRoll >= p5.diceRoll) && (p1.diceRoll >= p6.diceRoll) && (p1.diceRoll >= p7.diceRoll)
				&& (p1.diceRoll >= p8.diceRoll)) {
			boolean winner = tieCheck(p1);
			p1.diceRoll = 0;
			if (winner == true) {
				tunOder.add(p1.getName() + ":" + p1.getToken());
			}

			pnum = 2;
			for (int i = 0; i < numberPlayers - 1; i++) {
				if (pnum == 2) {
					tunOder.add(p2.getName() + ":" + p2.getToken());
				}
				if (pnum == 3) {
					tunOder.add(p3.getName() + ":" + p3.getToken());
				}
				if (pnum == 4) {
					tunOder.add(p4.getName() + ":" + p4.getToken());
				}
				if (pnum == 5) {
					tunOder.add(p5.getName() + ":" + p5.getToken());
				}
				if (pnum == 6) {
					tunOder.add(p6.getName() + ":" + p6.getToken());
				}
				if (pnum == 7) {
					tunOder.add(p7.getName() + ":" + p7.getToken());
				}
				if (pnum == 8) {
					tunOder.add(p8.getName() + ":" + p8.getToken());
				}
				pnum++;
			}
		} else if ((p2.diceRoll >= p1.diceRoll) && (p2.diceRoll >= p3.diceRoll) && (p2.diceRoll >= p4.diceRoll)
				&& (p2.diceRoll >= p5.diceRoll) && (p2.diceRoll >= p6.diceRoll) && (p2.diceRoll >= p7.diceRoll)
				&& (p2.diceRoll >= p8.diceRoll)) {
			boolean winner = tieCheck(p2);
			p2.diceRoll = 0;
			if (winner == true) {
				tunOder.add(p2.getName() + ":" + p2.getToken());
			}
			pnum = 2;
			for (int i = 0; i < 7; i++) {
				if (pnum == 2) {
					tunOder.add(p3.getName() + ":" + p3.getToken());
				}
				if (pnum == 3 && (numberPlayers > 3)) {
					tunOder.add(p4.getName() + ":" + p4.getToken());
				}
				if (pnum == 4 && (numberPlayers > 4)) {
					tunOder.add(p5.getName() + ":" + p5.getToken());
				}
				if (pnum == 5 && (numberPlayers > 5)) {
					tunOder.add(p6.getName() + ":" + p6.getToken());
				}
				if (pnum == 6 && (numberPlayers > 6)) {
					tunOder.add(p7.getName() + ":" + p7.getToken());
				}
				if (pnum == 7 && (numberPlayers > 7)) {
					tunOder.add(p8.getName() + ":" + p8.getToken());
				}
				if (pnum == 8) {
					tunOder.add(p1.getName() + ":" + p1.getToken());
				}
				pnum++;
			}
			if (winner == false) {
				tunOder.add(p2.getName());
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
					tunOder.add(p4.getName() + ":" + p4.getToken());
				}
				if (pnum == 3 && (numberPlayers > 4)) {
					tunOder.add(p5.getName() + ":" + p5.getToken());
				}
				if (pnum == 4 && (numberPlayers > 5)) {
					tunOder.add(p6.getName() + ":" + p6.getToken());
				}
				if (pnum == 5 && (numberPlayers > 6)) {
					tunOder.add(p7.getName() + ":" + p7.getToken());
				}
				if (pnum == 6 && (numberPlayers > 7)) {
					tunOder.add(p8.getName() + ":" + p8.getToken());
				}
				if (pnum == 7) {
					tunOder.add(p1.getName() + ":" + p1.getToken());
				}
				if (pnum == 8) {
					tunOder.add(p2.getName() + ":" + p2.getToken());
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
					tunOder.add(p5.getName() + ":" + p5.getToken());
				}
				if (pnum == 3 && (numberPlayers > 5)) {
					tunOder.add(p6.getName() + ":" + p6.getToken());
				}
				if (pnum == 4 && (numberPlayers > 6)) {
					tunOder.add(p7.getName() + ":" + p7.getToken());
				}
				if (pnum == 5 && (numberPlayers > 7)) {
					tunOder.add(p8.getName() + ":" + p8.getToken());
				}
				if (pnum == 6) {
					tunOder.add(p1.getName() + ":" + p1.getToken());
				}
				if (pnum == 7) {
					tunOder.add(p2.getName() + ":" + p2.getToken());
				}
				if (pnum == 8) {
					tunOder.add(p3.getName() + ":" + p3.getToken());
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
					tunOder.add(p6.getName() + ":" + p6.getToken());
				}
				if (pnum == 3 && (numberPlayers > 6)) {
					tunOder.add(p7.getName() + ":" + p7.getToken());
				}
				if (pnum == 4 && (numberPlayers > 7)) {
					tunOder.add(p8.getName() + ":" + p8.getToken());
				}
				if (pnum == 5) {
					tunOder.add(p1.getName() + ":" + p1.getToken());
				}
				if (pnum == 6) {
					tunOder.add(p2.getName() + ":" + p2.getToken());
				}
				if (pnum == 7) {
					tunOder.add(p3.getName() + ":" + p3.getToken());
				}
				if (pnum == 8) {
					tunOder.add(p4.getName() + ":" + p4.getToken());
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
					tunOder.add(p7.getName() + ":" + p7.getToken());
				}
				if (pnum == 3 && (numberPlayers > 7)) {
					tunOder.add(p8.getName() + ":" + p8.getToken());
				}
				if (pnum == 4) {
					tunOder.add(p1.getName() + ":" + p1.getToken());
				}
				if (pnum == 5) {
					tunOder.add(p2.getName() + ":" + p2.getToken());
				}
				if (pnum == 6) {
					tunOder.add(p3.getName() + ":" + p3.getToken());
				}
				if (pnum == 7) {
					tunOder.add(p4.getName() + ":" + p4.getToken());
				}
				if (pnum == 8) {
					tunOder.add(p5.getName() + ":" + p5.getToken());
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
					tunOder.add(p8.getName() + ":" + p8.getToken());
				}
				if (pnum == 3) {
					tunOder.add(p1.getName() + ":" + p1.getToken());
				}
				if (pnum == 4) {
					tunOder.add(p2.getName() + ":" + p2.getToken());
				}
				if (pnum == 5) {
					tunOder.add(p3.getName() + ":" + p3.getToken());
				}
				if (pnum == 6) {
					tunOder.add(p4.getName() + ":" + p4.getToken());
				}
				if (pnum == 7) {
					tunOder.add(p5.getName() + ":" + p5.getToken());
				}
				if (pnum == 8) {
					tunOder.add(p6.getName() + ":" + p6.getToken());
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
					tunOder.add(p1.getName() + ":" + p1.getToken());
				}
				if (pnum == 3) {
					tunOder.add(p2.getName() + ":" + p2.getToken());
				}
				if (pnum == 4) {
					tunOder.add(p3.getName() + ":" + p3.getToken());
				}
				if (pnum == 5) {
					tunOder.add(p4.getName() + ":" + p4.getToken());
				}
				if (pnum == 6) {
					tunOder.add(p5.getName() + ":" + p5.getToken());
				}
				if (pnum == 7) {
					tunOder.add(p6.getName() + ":" + p6.getToken());
				}
				if (pnum == 8) {
					tunOder.add(p7.getName() + ":" + p7.getToken());
				}
				pnum++;
			}

		}
		if (numberPlayers == 2 && tunOder.get(0) == p2.getName()) {
			tunOder.add(p1.getName()  + ":" + p1.getToken());
		}
	}

	private boolean tieCheck(Player player) {
		boolean pWin = true;
		boolean noTie = false;
		while (noTie == false) {
			if (p2.diceRoll == player.diceRoll && (player != p2)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() + " rolls a: " + player.diceRoll);
				p2.diceRoll = promptForRandom(12, 2);
				System.out.println(p2.getName() + " rolls a: " + p2.diceRoll);
				if (player.diceRoll != p2.diceRoll) {
					if (player.diceRoll > p2.diceRoll) {
						pWin = false;
					}
					noTie = true;
				}
			} else if (p3.diceRoll == player.diceRoll && (player != p3)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() + " rolls a: " + player.diceRoll);
				p3.diceRoll = promptForRandom(12, 2);
				System.out.println(p3.getName() + " rolls a: " + p3.diceRoll);
				if (player.diceRoll != p3.diceRoll) {
					if (player.diceRoll < p3.diceRoll) {
						pWin = false;
					}
					noTie = true;
				}
			} else if (p4.diceRoll == player.diceRoll && (player != p4)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() + " rolls a: " + player.diceRoll);
				p4.diceRoll = promptForRandom(12, 2);
				System.out.println(p4.getName() + " rolls a: " + p4.diceRoll);
				if (player.diceRoll != p4.diceRoll) {
					if (player.diceRoll < p4.diceRoll) {
						pWin = false;
					}
					noTie = true;
				}
			} else if (p5.diceRoll == player.diceRoll && (player != p5)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() + " rolls a: " + player.diceRoll);
				p5.diceRoll = promptForRandom(12, 2);
				System.out.println(p5.getName() + " rolls a: " + p5.diceRoll);
				if (player.diceRoll != p5.diceRoll) {
					if (player.diceRoll > p5.diceRoll) {
						pWin = false;
					}
					noTie = true;
				}
			} else if (p6.diceRoll == player.diceRoll && (player != p6)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() + " rolls a: " + player.diceRoll);
				p6.diceRoll = promptForRandom(12, 2);
				System.out.println(p6.getName() + " rolls a: " + p6.diceRoll);
				if (player.diceRoll != p6.diceRoll) {
					if (player.diceRoll > p6.diceRoll) {
						pWin = false;
					}
					noTie = true;
				}
			} else if (p7.diceRoll == player.diceRoll && (player != p7)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() + " rolls a: " + player.diceRoll);
				p7.diceRoll = promptForRandom(12, 2);
				System.out.println(p7.getName() + " rolls a: " + p7.diceRoll);
				if (player.diceRoll != p7.diceRoll) {
					if (player.diceRoll > p7.diceRoll) {
						pWin = false;
					}
					noTie = true;
				}
			} else if (p8.diceRoll == player.diceRoll && (player != p8)) {
				player.diceRoll = promptForRandom(12, 2);
				System.out.println(player.getName() + " rolls a: " + player.diceRoll);
				p8.diceRoll = promptForRandom(12, 2);
				System.out.println(p8.getName() + " rolls a: " + p8.diceRoll);
				if (player.diceRoll != p8.diceRoll) {
					if (player.diceRoll > p8.diceRoll) {
						pWin = false;
					}
					noTie = true;
				}
			} else {
				noTie = true;
			}
		}
		return pWin;
	}

	public int promptForRandom(int max, int min) {
		Random rando = new Random();
		int rand = rando.nextInt(max - min + 1) + min;
		return rand;
	}

	public void boardPrint() {
		System.out.println(" ────────────┬───────────────────────────────────────────────────────────┬───────────");
		System.out.println("│            │                                                           │           │");
		System.out.println("│		     │														     │ 	         │");
		System.out.println("│		     │														     │Go To      │");
		System.out.println("│		     │														     │ Jail      │");
		System.out.println("│────────────│───────────────────────────────────────────────────────────│───────────│");
		System.out.println("│		     │														     │  	     │");
		System.out.println("│		     │														     │           │");
		System.out.println("│		     │														     │  	     │");
		System.out.println("│		     │		────────────									     │  	     │");
		System.out.println("│		     │		│  Chance  │									     │           │");
		System.out.println("│		     │		│	Card   │ 									     │           │");
		System.out.println("│		     │		│──────────│			│†� │					     │           │");
		System.out.println("│		     │									─					     │           │");
		System.out.println("│		     │														     │           │");
		System.out.println("│		     │			─ │ ┌ ┐└ ┘├ ┤┬ ┴ ┼ ╫ ╗╔╚ ╝╠ ╣				     │           │");
		System.out.println("│		     │						MONOPOLY						     │           │");
		System.out.println("│		     │			The Fast Dealing Property Trading Game  	     │           │");
		System.out.println("│		     │														     │           │");
		System.out.println("│		     │														     │           │");
		System.out.println("│		     │									   ──────────────	     │ 	         │");
		System.out.println("│		     │									   │  Community │	     │  	     │");
		System.out.println("│		     │								       │   Chest    │	     │  	     │");
		System.out.println("│		     │									   │────────────│	     │  	     │");
		System.out.println("│		     │														     │  	     │");
		System.out.println("│		     │														     │  	     │");
		System.out.println("│───────────────────────┬──────────┬───────┬─────┬─────┬─────┬─────┬─────┬───────────│");
		System.out.println("│   │  IN    │          │          │       │ R&R │INCOM│BALT │COMM │MEDI.│           │");
		System.out.println("│ J ││││││   │		    │		   │ 	   │ Rail│ TAX │ AVE │CHEST│     │           │");
		System.out.println("│ U ││││││   │		    │		   │	   │ Road│$200 │     │	   │     │   GO      │");
		System.out.println("│ S │ Jail   │	  	    │	       │	   │Cost:│  Or │ 	 │	   │     │           │");
		System.out.println("│ T │────────│		    │	       │	   │  	 │ 10% │ 	 │	   │     │           │");
		System.out.println("│ Visting    │		    │		   │       │ $200│     │ $60 │	   │ $60 │  	     │");
		System.out.println("└────────────┴──────────┴──────────┴───────┴─────┴─────┴─────┴─────┴─────┴───────────┘");
	}

	public void takeTurn(int numberPlayers) throws IOException {
		Player cplayer = p1;
		for (int i = 0; i < numberPlayers; i++) {
			String cPlayer = tunOder.get(i);
			System.out.println("It is your turn: " + cPlayer);
			if (cPlayer == p1.getName()) {
				cplayer = p1;
			} else if (cPlayer == p2.getName()) {
				cplayer = p2;
			} else if (cPlayer == p3.getName()) {
				cplayer = p3;
			} else if (cPlayer == p4.getName()) {
				cplayer = p5;
			} else if (cPlayer == p6.getName()) {
				cplayer = p6;
			} else if (cPlayer == p7.getName()) {
				cplayer = p7;
			} else if (cPlayer == p8.getName()) {
				cplayer = p8;
			}
			boolean diceRolled = false;
			int menuSelect;
			int currentSpace = 0;
			cplayer.numberOfDoubles = 0;
			while (diceRolled == false) {
				menuSelect = promptForInt(Menu, 1, 4);
				if (menuSelect == 1) {
					cplayer.diceRoll = promptForRandom(6, 1);
					cplayer.diceRoll2 = promptForRandom(6, 1);
					if (cplayer.diceRoll != cplayer.diceRoll2 && cplayer.numberOfDoubles < 3) {
						diceRolled = true;
					}
					currentSpace = space.spaceFind(cplayer);
					space.spaceName(cplayer, currentSpace,Board.this, banker);
					System.out.println(
							cplayer.getName() + " Rolled a: " + cplayer.diceRoll + " and a " + cplayer.diceRoll2);
					if (cplayer.diceRoll == cplayer.diceRoll2) {
						cplayer.numberOfDoubles++;
					}
					if (cplayer.numberOfDoubles < 3) {
						space.spaceChange(cplayer, currentSpace);
						currentSpace = space.spaceFind(cplayer);
						space.spaceName(cplayer, currentSpace,Board.this, banker);
					} else {
						diceRolled = true;
						cplayer.inJail = true;
						space.spaceChange(cplayer, 0);
					}
				} else if (menuSelect == 2) {
					System.out.println("Which Player would you like to trade with?\n" + tunOder);
				} else if (menuSelect == 3) {

				} else if (menuSelect == 4) {

				}
			}
		}
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