package com.weather.subject;

import com.weather.object.Observer;

/**
 * This is my first attempt to implement observer pattern.
 * This is the Subject which notifies all observers when a 
 * change occurs in it. We have one subject and many objects.
 * @author praveen
 *
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}

