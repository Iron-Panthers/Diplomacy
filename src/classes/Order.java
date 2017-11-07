package classes;

public class Order {
	int orderType;
	Unit actingUnit;
	Province startProvince;
	Province endProvince;
	public Order(int orderType, Unit actingUnit, Province startProvince, Province endProvince) {
		this.orderType = orderType;
		this.actingUnit = actingUnit;
		this.startProvince = startProvince;
		this.endProvince = endProvince;
	}
}
