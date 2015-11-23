/**
 * 
 */
package com.designpattern.specificDucks;

import com.designpattern.genericDuck.Duck;

/**
 * Another kind of duck that inherits Duck superclass
 * @author praveen
 *
 */
public class RedHeadDuck extends Duck{

	@Override
	public void display() {
		System.out.println("This is a red head duck");
	}

}
