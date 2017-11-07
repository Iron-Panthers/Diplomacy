package classes;

public class Unit {
	boolean isLand;
	Province provinceIsIn;
	int strength;
	int playerIdOfUnit;
	boolean hasOrder = false;
	Unit(boolean isLand, int playerIdOfUnit, Province startProvince){
		this.isLand = isLand;
		this.playerIdOfUnit = playerIdOfUnit;
		this.provinceIsIn = startProvince;
	}
}
