package com.designpattern.specificDucks;

import com.designpattern.genericDuck.Duck;
import com.designpattern.genericDuck.FlyNoWay;
import com.designpattern.genericDuck.MuteQuack;

public class RubberDuck extends Duck {
		
	/*
	 * Even though rubber duck cant quack or fly we still have to
	 * have some implementation to avoid null pointer exception
	 */
	public RubberDuck() {
		meQuack = new MuteQuack();
		meFly = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("Rubber Duck");
	}

}
