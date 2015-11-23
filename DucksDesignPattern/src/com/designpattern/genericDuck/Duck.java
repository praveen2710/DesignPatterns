package com.designpattern.genericDuck;
/**
 * The intial Duck class has two implemented methods
 * quack and swim. Company wants to add the functionality
 * to swim also soon.
 * @author praveen
 *
 */
public abstract class Duck {
	
	public Duck(){
		
	}
	
//	this is abstract since each duck has its own name
	public abstract void display();
	
	public void swim(){
		System.out.println("It is so nice in water");
	}
	
	public void quack(){
		System.out.println("Quack Quack");
	}
	
}
