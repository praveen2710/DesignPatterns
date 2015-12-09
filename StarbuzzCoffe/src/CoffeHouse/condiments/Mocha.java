package CoffeHouse.condiments;

import CoffeHouse.drinks.Bevrage;

public class Mocha extends CondimentDecorator{
	
	private Bevrage bevrage;
	
	public Mocha(Bevrage be){
		this.bevrage  = be;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.bevrage.getDescription()+",Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		switch (bevrage.getSize()) {
		case TALL:
			return this.bevrage.cost()+0.05;
		case GRANDE:
			return this.bevrage.cost()+0.10;
		case VENTI:
			return this.bevrage.cost()+0.15;
		default:
			return this.bevrage.cost()+0.08;
		}
	}
	
}
