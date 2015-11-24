package com.designpattern.genericDuck;

public class Squeak implements QuackBehavior {

	@Override
	public void myQuack() {
		System.out.println("squeak squeak");
	}

}
