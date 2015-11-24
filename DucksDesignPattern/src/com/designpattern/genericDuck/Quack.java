package com.designpattern.genericDuck;

/*
 * This seprates implementation from specific classes.
 */
public class Quack implements QuackBehavior {

	@Override
	public void myQuack() {
		System.out.println("Quack Quack");
	}

}
