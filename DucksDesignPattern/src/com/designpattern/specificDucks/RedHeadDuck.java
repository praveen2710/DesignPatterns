/**
 * 
 */
package com.designpattern.specificDucks;

import com.designpattern.genericDuck.Duck;
import com.designpattern.genericDuck.FlyBehaviour;
import com.designpattern.genericDuck.QuackBehavior;

/**
 * Another kind of duck that inherits Duck superclass
 * @author praveen
 *
 */
public class RedHeadDuck extends Duck implements FlyBehaviour,QuackBehavior{

	@Override
	public void display() {
		System.out.println("This is a red head duck");
	}
	
	public void quack(){
		
	}

	@Override
	public void myQuack() {
		System.out.println("I squeak");
	}

	@Override
	public void flyme() {
		System.out.println("Barely");
	}

}
