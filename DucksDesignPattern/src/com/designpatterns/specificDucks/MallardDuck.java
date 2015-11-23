/**
 * 
 */
package com.designpatterns.specificDucks;

import com.designpattern.genericDuck.Duck;

/**
 * This is a subclass that inherits the Duck Superclass
 * @author praveen
 *
 */
public class MallardDuck extends Duck{

	@Override
	public void display() {
		System.out.println("THis is a MallardDuck");		
	}

}
