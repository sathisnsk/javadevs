package pizzabill;

public class DeluxePizza extends Pizza{
	
	
	DeluxePizza(boolean isVeg) {
		super(isVeg);
		super.addExtraCheese();
		super.addExtraToppings();
		super.optTakeAway();
	}
	
	@Override
	public void addExtraCheese() {
	}
	
	@Override
	public void addExtraToppings() {
	}
	
	@Override
	public void optTakeAway() {
	}
	
	
}
