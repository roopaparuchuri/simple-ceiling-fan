package com.assessment.ceiling.fan.pojo;

import com.assessment.ceiling.fan.Enums.DIRECTION;

public class CeilingFan {
	public static final int OFF = 0;

	private int speed = OFF;
	private DIRECTION direction = DIRECTION.FORWARD;

	public int getSpeed() {
		return speed;
	}

	public DIRECTION getDirection() {
		return direction;
	}

	public void speedUp() {
		if (speed == 3) {
			speed = OFF;
		} else {
			speed++;
		}
	}

	public void reverseDirection() {
		direction = (direction == DIRECTION.FORWARD) ? DIRECTION.REVERSED : DIRECTION.FORWARD;
	}

	@Override
	public String toString() {
		return "The current direction of fan is "+ direction.toString() +" and current working speed is " + speed;
	}
	
	
}
