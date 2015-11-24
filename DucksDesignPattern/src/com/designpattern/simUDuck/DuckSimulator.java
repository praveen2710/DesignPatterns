package com.designpattern.simUDuck;

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
	}
}
