package Monoploy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Monopoly_game {
	public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String ageResponse;
    do{
    System.out.println("Are all players aged 8+?");
    ageResponse = in.readLine();
    }while(!(ageResponse.equalsIgnoreCase("y")||ageResponse.equalsIgnoreCase("yes")||ageResponse.equalsIgnoreCase("n")||ageResponse.equalsIgnoreCase("no")));
   if(ageResponse.equalsIgnoreCase("y")||ageResponse.equalsIgnoreCase("yes")){
   //play game  
  }
    else{
      //terminate since in the rules it says 8+
    }
	}
}