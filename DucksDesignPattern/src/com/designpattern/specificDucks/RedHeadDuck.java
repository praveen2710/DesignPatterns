/**
 * 
 */
package com.designpattern.specificDucks;

import com.designpattern.genericDuck.Duck;
import com.designpattern.genericDuck.FlyFast;
import com.designpattern.genericDuck.Squeak;

/**
 * Another kind of duck that inherits Duck superclass
 * @author praveen
 *
 */
public class RedHeadDuck extends Duck /*implements FlyBehaviour,QuackBehavior*/{
	
	public RedHeadDuck() {
		 meQuack = new Squeak();
		 meFly = new FlyFast();
	}
	
	@Override
	public void display() {
		System.out.println("This is a red head duck");
	}
	
	
	/*
	@Override
	public void myQuack() {
		System.out.println("I squeak");
	}

	@Override
	public void flyme() {
		System.out.println("Barely");
	}
	*/

}
