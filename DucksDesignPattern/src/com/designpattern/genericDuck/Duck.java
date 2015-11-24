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
 * V3:adding interface variables to handle code duplication
 * 
 * @author praveen
 *
 */
public abstract class Duck {
	
	protected FlyBehaviour meFly;
	
	protected QuackBehavior meQuack;
	
	public Duck(){
		
	}
	
//	this is abstract since each duck has its own name
	public abstract void display();
	
	public void swim(){
		System.out.println("It is so nice in water");
	}
	
	public void performQuack(){
		meQuack.myQuack();
	}
	
	public void takeFligt(){
		meFly.flyme();
	}
	
	public void setFlyBehavior(FlyBehaviour fb){
		this.meFly = fb;
	}
	
	public void setQuackVoice(QuackBehavior qb){
		this.meQuack = qb;
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
