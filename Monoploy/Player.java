package Monoploy;

import java.util.ArrayList;

public class Player {
	public boolean inJail = false;
	public boolean startedOn = true;
	public boolean win = false;
	public boolean chanceDraw = true;
	public boolean chestDraw = true;
	public boolean firstGo = true;
	public boolean bankrupt = false;
	public boolean taxed = false;
	private String token;
	private String name;
	public String[] space = new String[40];
	public final int INITIAL_MONEY=1500;
	public int bid=0;
	public int diceRoll = 0;
	public int diceRoll2 = 0;
	public int playerhouse = 0;
	public int playerHotel = 0;
	public int numberOfDoubles = 0;
	public int bal = INITIAL_MONEY;
	public int[] Money = new int[7];
	public ArrayList<String> ownedProperties= new ArrayList<>();
	public ArrayList<String> MorgegedPrpoerties = new ArrayList<>();
	public ArrayList<String> other= new ArrayList<>();
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setToken(String piece) {
		this.token = piece;
	}
	public String getToken() {
		return token;
	}
	
}