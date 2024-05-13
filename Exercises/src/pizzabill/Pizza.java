package pizzabill;

public class Pizza {

	private double basePrice;
	private double extraToppings = 50;
	private double extraCheese = 100;
	private double takeAway = 20;
	private double finalPrice;
	
	Pizza(boolean isVeg) {
		if(isVeg) {
			this.basePrice = 300;
		} else {
			this.basePrice = 400;
		}
		this.finalPrice = basePrice;
	}
	
	public void addExtraCheese() {
		finalPrice += extraCheese;
		System.out.println("Extra Cheese Added");
	}
	
	public void addExtraToppings() {
		finalPrice += extraToppings;
		System.out.println("Extra Toppings Added");
	}
	
	public void optTakeAway() {
		finalPrice += takeAway;
		System.out.println("TakeAway opted");
	}
	
	public void generateBill() {
		System.out.println("Total Bill:" + finalPrice);
	}
	
}
