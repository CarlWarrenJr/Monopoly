package Monoploy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Board {
	public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public Banker banker = new Banker();
	Piece piece=new Piece();
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
		for (int i = 1; i < numberPlayers; i++) {
			if (pnum == 8) {
				System.out.println("Player 8 Enter Your Name");
				p8.setName(in.readLine());p2.setName(in.readLine());
				setMoney(p8);
			} else if (pnum == 7) {
				System.out.println("Player 7 Enter Your Name");
				p7.setName(in.readLine());p2.setName(in.readLine());
				setMoney(p7);
			} else if (pnum == 6) {
				System.out.println("Player 6 Enter Your Name");
				p6.setName(in.readLine());p2.setName(in.readLine());
				setMoney(p6);
			} else if (pnum == 5) {
				System.out.println("Player 5 Enter Your Name");
				p5.setName(in.readLine());p2.setName(in.readLine());
				setMoney(p5);
			} else if (pnum == 4) {
				System.out.println("Player 4 Enter Your Name");
				p4.setName(in.readLine());p2.setName(in.readLine());
				setMoney(p4);
			} else if (pnum == 3) {
				System.out.println("Player 3 Enter Your Name");
				p3.setName(in.readLine());p2.setName(in.readLine());
				setMoney(p3);
			} else if (pnum == 2) {
				System.out.println("Player 1 Enter Your Name");
				p1.setName(in.readLine());p2.setName(in.readLine());
				setMoney(p1);
		
				System.out.println("Player 2 Enter Your Name");
				p2.setName(in.readLine());
				setMoney(p2);
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

	public void boardPrint() {
		System.out.println(" __________________________________________________________________________________");
		System.out.println("|          |                                                          |           |");
		System.out.println("|		    |														   | 	       |");
		System.out.println("|		    |														   |Go To      |");
		System.out.println("|		    |														   | Jail      |");
		System.out.println("|__________|__________________________________________________________|___________|");
		System.out.println("|		    |														   |  	       |");
		System.out.println("|		    |														   |   	       |");
		System.out.println("|		    |														   |   	       |");
		System.out.println("|		    |		____________									   |  	       |");
		System.out.println("|		    |		|  Chance  |									   |  	       |");
		System.out.println("|		    |		|	Card   | 									   |  	       |");
		System.out.println("|		    |		|__________|			← ╫						   |  	       |");
		System.out.println("|		    |														   |  	       |");
		System.out.println("|		    |														   |  	       |");
		System.out.println("|		    |														   |  	       |");
		System.out.println("|		    |						MONOPOLY						   |  	       |");
		System.out.println("|		    |			The Fast Dealing Property Trading Game  	   |  	       |");
		System.out.println("|		    |														   |  	       |");
		System.out.println("|		    |														   |  	       |");
		System.out.println("|		    |									   ______________	   |   	       |");
		System.out.println("|		    |									   |  Community |	   |  	       |");
		System.out.println("|		    |								       |   Chest    |	   |  	       |");
		System.out.println("|		    |									   |____________|	   |  	       |");
		System.out.println("|		    |														   |  	       |");
		System.out.println("|		    |														   |  	       |");
		System.out.println("|__________|__________________________________________________________|___________|");
		System.out.println("|   |  IN  |          |          |        |    |     |     |     |    |           |");
		System.out.println("| J |╫╫╫╫╫ |		   |		  | 			|     | 	|	  |    |   ←       |");
		System.out.println("| U |╫╫╫╫╫ |		   |		  |	    		|     | 	|	  |    |   GO      |");
		System.out.println("| S | Jail |	  	   |	      |				|     | 	|	  |    |  	       |");
		System.out.println("| T |______|		   |	      |				|     | 	|	  |    |  	       |");
		System.out.println("| Visting  |		   |		  | 			|     | 	|	  |    |  	       |");
		System.out.println("|__________|__________|__________|_____________|_____|_____|_____|____|___________|");
	}
}
