package classes;

import java.util.ArrayList;

public class Province {
	ArrayList<Province> adjacentProvinces = new ArrayList<Province>();
	ArrayList<Unit> units = new ArrayList<Unit>();
	String name;
	boolean isLand;
	public Province(boolean isLand, String name) {
		this.name = name;
		this.isLand = isLand;
	}
}
