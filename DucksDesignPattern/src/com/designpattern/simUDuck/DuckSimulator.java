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
		md.flyme();
		
		RedHeadDuck rd = new RedHeadDuck();
		rd.display();
		rd.quack();
		rd.swim();
		rd.myQuack();
		rd.flyme();
		
		RubberDuck rud = new RubberDuck();
		rud.display();
//		rud.quack()
		rud.swim();
//		System.out.println("Crap this is problem");
//		rud.fly();
	}
}
