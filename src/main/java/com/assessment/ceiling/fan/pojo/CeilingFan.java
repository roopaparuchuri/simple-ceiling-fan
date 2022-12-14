package com.assessment.ceiling.fan.pojo;

import com.assessment.ceiling.fan.enums.Direction;

public class CeilingFan {
	public static final int OFF = 0;

	private int speed = OFF;
	private Direction direction = Direction.FORWARD;

	public int getSpeed() {
		return speed;
	}

	public Direction getDirection() {
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
		direction = (direction == Direction.FORWARD) ? Direction.REVERSED : Direction.FORWARD;
	}

	@Override
	public String toString() {
		return "The current direction of fan is "+ direction.toString() +" and current working speed is " + speed;
	}
	
	
}
