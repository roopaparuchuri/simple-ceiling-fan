package com.assessment.ceiling.fan.execute;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.assessment.ceiling.fan.enums.Direction;
import com.assessment.ceiling.fan.pojo.CeilingFan;

class RunCeilingFanTest {
	
	private CeilingFan ceilingFan = new CeilingFan();
	
	
	@BeforeEach
	void setUp() throws Exception {
		ceilingFan = new CeilingFan();
	}

	@Test
	void testSpeedPullCord() {
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());
		assertEquals(CeilingFan.OFF, ceilingFan.getSpeed());

		ceilingFan.speedUp();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());
		System.out.println(ceilingFan.toString());

		ceilingFan.speedUp();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(CeilingFan.OFF, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());
	}

	@Test
	void testSpeedPullCord_WhenDirectionIsReversed() {
		assertEquals(CeilingFan.OFF, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(CeilingFan.OFF, ceilingFan.getSpeed());
		assertEquals(Direction.REVERSED, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(Direction.REVERSED, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(Direction.REVERSED, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(Direction.REVERSED, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(CeilingFan.OFF, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());

		ceilingFan.reverseDirection();
		assertEquals(CeilingFan.OFF, ceilingFan.getSpeed());
		assertEquals(Direction.REVERSED, ceilingFan.getDirection());

	}

	@Test
	void testReverseDirection() {
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());
		assertEquals(CeilingFan.OFF, ceilingFan.getSpeed());

		ceilingFan.reverseDirection();
		assertEquals(Direction.REVERSED, ceilingFan.getDirection());
		assertEquals(CeilingFan.OFF, ceilingFan.getSpeed());

		ceilingFan.speedUp();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(Direction.REVERSED, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(Direction.REVERSED, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(Direction.REVERSED, ceilingFan.getDirection());

		ceilingFan.speedUp();
		assertEquals(CeilingFan.OFF, ceilingFan.getSpeed());
		assertEquals(Direction.REVERSED, ceilingFan.getDirection());
	}

}
