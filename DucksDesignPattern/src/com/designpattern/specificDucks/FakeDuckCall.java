package com.designpattern.specificDucks;

import com.designpattern.genericDuck.QuackBehavior;

public class FakeDuckCall {
	private QuackBehavior duckCall;
	
	public FakeDuckCall(QuackBehavior duckSound) {
		this.duckCall = duckSound;
	}
	
	//to change once object is created.
	public void setDuckCall(QuackBehavior duckSoud){
		this.duckCall = duckSoud;
	}
	
	public void makeSound(){
		duckCall.myQuack();
	}
}
