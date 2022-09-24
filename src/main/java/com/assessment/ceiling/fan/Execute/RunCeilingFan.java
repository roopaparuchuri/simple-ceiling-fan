package com.assessment.ceiling.fan.Execute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.assessment.ceiling.fan.pojo.CeilingFan;

public class RunCeilingFan {

	public static void main(String[] args) throws IOException {
		CeilingFan ceilingFan = new CeilingFan();

		System.out.println(ceilingFan);

		while (true) {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String settingChain = in.readLine();

			switch (settingChain.trim().toLowerCase()) {
			case "speed":
				ceilingFan.speedUp();
				System.out.println(ceilingFan);
				break;
			case "direction":
				ceilingFan.reverseDirection();
				System.out.println(ceilingFan);
				break;
			default:
				System.out.println("***You've entered an Invalid Input***");
				System.out.println("Valid Inputs are as below: ");
				System.out.println("\t 1. speed - To speed up the Fan.");
				System.out.println("\t 2. direction- To change the direction.");
				break;
			}
		}
	}

}
