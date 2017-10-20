package designPattern_lesson1;

import strategy_pattern.ItFlys;

public class Bird extends Animal {
	
	public Bird() {
		super();
		
		setSound("Tweet");
		
		flyingType = new ItFlys();
	}
}
