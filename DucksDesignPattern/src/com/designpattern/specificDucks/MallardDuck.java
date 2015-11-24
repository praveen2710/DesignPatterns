/**
 * 
 */
package com.designpattern.specificDucks;

import com.designpattern.genericDuck.Duck;
import com.designpattern.genericDuck.FlyHigh;
import com.designpattern.genericDuck.Quack;

/**
 * V1:
 * This is a subclass that inherits the Duck Superclass.
 * 
 * V2:
 * implementing flybehavior and quackbehavior interface 
 * resolves issue of quacking but added new issues where 
 * id we change interface we have to change implementation is all
 * over the place and any change would have to be done to all ducks 
 * one at a time
 * 
 * V3:This removes code duplicating issue
 * 
 * @author praveen
 *
 */
public class MallardDuck extends Duck /*implements FlyBehaviour,QuackBehavior*/{
	

	
	public MallardDuck(){
		 meQuack = new Quack();
		 meFly = new FlyHigh();
	}
	
	@Override
	public void display() {
		System.out.println("THis is a MallardDuck");		
	}
	
	/*
	@Override
	public void flyme() {
		System.out.println("I can fly");
	}
	*/
	
	/*
	@Override
	public void myQuack() {
		System.out.println("quack quack");
	}
	*/
	
}
