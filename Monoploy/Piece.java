package Monoploy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Piece {
	public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public ArrayList<String> piece = new ArrayList<>();

	public void createToken() {
		piece.add("CAR");
		piece.add("SHOE");
		piece.add("HAT");
		piece.add("BOAT");
		piece.add("THIMBLE");
		piece.add("MONEYBAG");
		piece.add("IRON");
		piece.add("DOG");

	}

	public String selectPiece(String token) throws IOException {
		String chosen = "";
		boolean validInput = false;
		while (validInput == false) {
			try {
				token = token.toUpperCase();
				int k = piece.indexOf(token);
				chosen = piece.remove(k);
				validInput = true;
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Please chose from the remainging pieces");
				token = in.readLine();
			}
		}
		return chosen;
	}
}