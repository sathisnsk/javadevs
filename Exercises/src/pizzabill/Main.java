package pizzabill;

public class Main {

	public static void main(String args[]) {
		
	/*	Pizza pizzaOrder = new Pizza(false);
		pizzaOrder.addExtraCheese();
		pizzaOrder.addExtraToppings();
		pizzaOrder.optTakeAway();
		pizzaOrder.generateBill();
		*/
		
		DeluxePizza pizzaOrder = new DeluxePizza(false);
		pizzaOrder.addExtraCheese();
		pizzaOrder.generateBill();
		
	}
	
	
}
