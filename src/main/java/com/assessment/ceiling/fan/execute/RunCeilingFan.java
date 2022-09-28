package com.assessment.ceiling.fan.execute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.assessment.ceiling.fan.pojo.CeilingFan;

public class RunCeilingFan {
	
	private static void userMessage(boolean errorFlag) {
		if (errorFlag) {
			System.out.println("***You've entered an Invalid Input***");
		}
		System.out.println("Expected Valid Integer Inputs are as below: ");
		System.out.println("\t 1 - To speed up the Fan.");
		System.out.println("\t 2 - To change the direction.");
		System.out.println("\t 3 - To Exit.");
	}

	public static void main(String[] args) throws IOException {
		CeilingFan ceilingFan = new CeilingFan();

		System.out.println(ceilingFan);
		userMessage(false);
		try {
			while (true) {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				int settingChain = Integer.parseInt(in.readLine());

				switch (settingChain) {
				case 1:
					ceilingFan.speedUp();
					System.out.println(ceilingFan);
					break;
				case 2:
					ceilingFan.reverseDirection();
					System.out.println(ceilingFan);
					break;
				case 3:
					System.out.println("Exiting...!");
					return;
				default:
					userMessage(true);
					break;
				}
			}
		} catch (Exception e) {
			userMessage(true);
		}
	}

}
