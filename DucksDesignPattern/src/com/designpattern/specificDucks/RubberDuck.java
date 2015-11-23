package com.designpattern.specificDucks;

import com.designpattern.genericDuck.Duck;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("Rubber Duck");
	}

}
