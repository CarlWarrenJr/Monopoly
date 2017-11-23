package Monoploy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Monopoly_game {
	public static void main(String[] args) throws IOException {
		Board bdw = new Board();
		ChanceCard card =new ChanceCard();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String ageResponse;
		do {
			System.out.println("Are all players aged 8+?");
			ageResponse = in.readLine();
		} while (!(ageResponse.equalsIgnoreCase("y") || ageResponse.equalsIgnoreCase("yes")
				|| ageResponse.equalsIgnoreCase("n") || ageResponse.equalsIgnoreCase("no")));
		if (ageResponse.equalsIgnoreCase("y") || ageResponse.equalsIgnoreCase("yes")) {
			boolean validPlayer = false;
			while (validPlayer == false) {
				System.out.println("How many players are there for your Game?");
				String Input = in.readLine();
				try {
					int numberPlayers = Integer.parseInt(Input);
					if ((numberPlayers > 8) || (numberPlayers < 2)) {
						System.out.println("Enter a Valid Integer between 2 and 8.");
						continue;
					}
						validPlayer = true;
						//card.setCards();
						bdw.boardSetUp(numberPlayers);
				} catch (NumberFormatException ex) {
					System.out.println("Enter a Valid Integer between 2 and 8.");
				}
			}
		} else {
			System.out.println("All Players Must be 8 years or older to play. Good BYE!");
		}
	}
}