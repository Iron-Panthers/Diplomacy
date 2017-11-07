package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("England");
		countries.add("France");
		countries.add("Germany");
		countries.add("Italy");
		countries.add("Russia");
		countries.add("Austria");
		countries.add("Ottomans");
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Province> provinces = new ArrayList<Province>();
		for (int x = 0; x < LandProvinces.landProvinces.size(); x++) {
			provinces.add(LandProvinces.landProvinces.get(x));
		}
		Scanner input = new Scanner(System.in);
		boolean setUp = true;
		while(setUp) {
			for(int p = 1; p <19;p++) {
				
				provinces.add(e)
			}
			for(int p = 1; p <72-19;p++) {
				
				provinces.add(e)
			}
			System.out.println("Welcome to Diplomacy. This is a seven player game, so please have seven people ready");
			for(int p = 1; p < 8; p++) {
				System.out.println("Hello Player" + p + ". You will be playing " + countries.get(p-1)+ ". Please enter your name and password as prompted.");
				System.out.print("name: ");
				String tempName = input.nextLine();
				System.out.print("password: ");
				String tempPassword = input.nextLine();
				Player currentPlayerInit = new Player(tempName,tempPassword,p);
				currentPlayerInit.country = countries.get(p-1);
				players.add(currentPlayerInit);
			}
			
		}
		boolean gamePlay = true;
		while(gamePlay) {
			Build();
			Diplomacy();
			WriteOrders();
			Adjudicate();
			Retreat();
		}
	}
}
