package CoffeHouse.drinks;

/**
 * trying to implement decorator pattern and understand why and how it is implemented
 * @author praveen
 *
 */
public abstract class Bevrage {
	
	public enum Size{
		TALL,
		GRANDE,
		VENTI
	}
	
	Size drinkSize = null;
	
	String description = "Unknown Drink";
	
	public String getDescription(){
		return description;
	}
	
	public Size getSize(){
		return drinkSize;
	}
	
	public void SetSize(Size s){
		this.drinkSize = s;
	}
	
	public abstract double cost();
	
}
