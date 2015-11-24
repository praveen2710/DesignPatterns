package com.designpattern.genericDuck;
/**
 * V1:
 * The intial Duck class has two implemented methods
 * quack and swim. Company wants to add the functionality
 * to swim also soon.
 * 
 * V2:seprating general and specific things into interface helped 
 * problem a little but added duplicate code.
 * 
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
	
/*obeslete with implementing pattern*/	
//	public void quack(){
//		System.out.println("Quack Quack");
//	}
//	
//	
//	public void fly(){
//		System.out.println("Lets fly this baby");
//	}
}
