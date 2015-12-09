package CoffeHouse.location;

import CoffeHouse.condiments.Mocha;
import CoffeHouse.drinks.Bevrage;
import CoffeHouse.drinks.Bevrage.Size;
import CoffeHouse.drinks.Expresso;

public class PlazaLocation {

	public static void main(String[] args) {
		Bevrage b1 = new Expresso();
		b1.SetSize(Size.GRANDE);
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());
		b1 = new Mocha(b1);
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());
	}

}
