package Monoploy;

import java.util.ArrayList;

public class Player {
	private String token;
	private String name;
	public final int INITIAL_MONEY=1500;
	public int[] Money = new int[7];
	public ArrayList<String> ownedProperties= new ArrayList<>();
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