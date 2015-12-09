package com.weather.object;

/**
 * This is the receiver of update from subject.There can
 * be many objects that can be notified when a subject
 * publishes a change.
 * @author praveen
 *
 */
public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}
