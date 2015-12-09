package CoffeHouse.drinks;

import CoffeHouse.drinks.Bevrage.Size;

public class Expresso extends Bevrage {
	
	public Expresso(){
		this.description = "Expresso";
//		this.drinkSize = s;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.19;
	}

}
