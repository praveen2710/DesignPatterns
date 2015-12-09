package CoffeHouse.drinks;

public class HouseBlend extends Bevrage{
	
	public HouseBlend(Size s) {
		this.description = "House Blend";
		this.drinkSize = s;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.99;
	}
	

}
