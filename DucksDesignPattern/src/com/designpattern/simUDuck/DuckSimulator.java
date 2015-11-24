package com.designpattern.simUDuck;

import com.designpattern.genericDuck.FlyFast;
import com.designpattern.genericDuck.Quack;
import com.designpattern.genericDuck.QuackBehavior;
import com.designpattern.genericDuck.Squeak;
import com.designpattern.specificDucks.FakeDuckCall;
import com.designpattern.specificDucks.MallardDuck;
import com.designpattern.specificDucks.RedHeadDuck;
import com.designpattern.specificDucks.RubberDuck;

public class DuckSimulator {
	
	public static void main(String args[]){
		MallardDuck md = new MallardDuck();
		md.display();
//		md.quack();
		md.swim();
		md.takeFligt();
//		changing behavior at runtime is facilitated like this.
		md.setFlyBehavior(new FlyFast());
		System.out.println("changed flight style dynamically");
		md.takeFligt();
		md.performQuack();
//		md.flyme();
		
		RedHeadDuck rd = new RedHeadDuck();
		rd.display();
//		rd.quack();
		rd.swim();
		rd.takeFligt();
		rd.performQuack();
//		rd.myQuack();
//		rd.flyme();
		
		RubberDuck rud = new RubberDuck();
		rud.display();
//		rud.quack()
		rud.swim();
		rud.performQuack();
		rud.takeFligt();
//		System.out.println("Crap this is problem");
//		rud.fly();
		
		System.out.println("Implemeting Duck CAlls");
		FakeDuckCall dc = new FakeDuckCall(new Squeak());
		dc.makeSound();
		System.out.println("Change Duck Calls");
		dc.setDuckCall(new Quack());
		dc.makeSound();
	}
}
