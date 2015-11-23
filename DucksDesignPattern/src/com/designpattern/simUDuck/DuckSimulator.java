package com.designpattern.simUDuck;

import com.designpatterns.specificDucks.MallardDuck;
import com.designpatterns.specificDucks.RedHeadDuck;

public class DuckSimulator {
	
	public static void main(String args[]){
		MallardDuck md = new MallardDuck();
		md.display();
		md.quack();
		md.swim();
		
		RedHeadDuck rd = new RedHeadDuck();
		rd.display();
		rd.quack();
		rd.swim();
	}
}
