package classes;

public class Player {
	public String country;
	public String name;
	public int playerId;
	public int numSupplyCenters;
	public int numUnits;
	public String password;
	public Player(String name, String password, int playerId) {
		this.name = name;
		this.password = password;
		this.playerId = playerId;
	}
}
