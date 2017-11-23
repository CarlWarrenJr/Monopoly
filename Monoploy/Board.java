package Monoploy;

public class Board {
	public Banker banker=new Banker();
	public Player p1 = new Player();
	public Player p2 = new Player();
	public Player p3 = new Player();
	public Player p4 = new Player();
	public Player p5 = new Player();
	public Player p6 = new Player();
	public Player p7 = new Player();
	public Player p8 = new Player();
	 public void boardSetUp(int numberPlayers) {
		 setUpPlayers(numberPlayers);
	 }
	 
	 
	 private void setUpPlayers(int numberPlayers) {
		 
		 
		for (int i = 0; i < numberPlayers;i++) {
			
		}
		for(int i=0; i < numberPlayers;i++) {
			//player instance.money.add(banker.bill500).... for all the bills
		}
		
	} 
 
 public void boardPrint() {
	 System.out.println("┌──────────┬──────────────────────────────────────────────────────────────┬───────────┐");
	 System.out.println("│          │                                                              │           │");
	 System.out.println("│		    │														       │           │");
	 System.out.println("│		    │														       │Go To      │");
	 System.out.println("│		    │														       │ Jail      │");
	 System.out.println("│──────────┼──────────────────────────────────────────────────────────────┼───────────┤");
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
	 System.out.println("│───┬──────┼──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┼───────────┤");
	 System.out.println("│ J │  IN  │      │      │┌────┐│      │      │      │      │Com   │      │           │");
	 System.out.println("│ U │ ╫╫╫╫ ├──────┼──────┤│┌─┐ │├──────┼──────┼──────┼──────┤Chest ├──────┤   ←       │");
	 System.out.println("│ S │ ╫╫╫╫ │	   │      │└┘┌┘ ││	    │      │      │      │	╔╗  │      │   GO      │");
	 System.out.println("│ T │ Jail │	   │      │	 │ ┌┘│	    │      │      │      │╔═╩╩═╗│      │           │");
	 System.out.println("│   └──────┤      │      │	  ●  │   	│      │      │	     │║║║║║║│      │           │");
	 System.out.println("│ Visting  │	   │      │Chance│      │      │      │      │╚════╝│      │  	       │");
	 System.out.println("└──────────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴───────────┘");
 }
}