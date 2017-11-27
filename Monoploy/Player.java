package Monoploy;

import java.util.ArrayList;

public class Player {
	public String Token;
	public String name;
	public final int INITIAL_MONEY=1500;
	public int[] Money = new int[7];
	public ArrayList<String> ownedProperties= new ArrayList<>();
	public ArrayList<String> other= new ArrayList<>();
}
