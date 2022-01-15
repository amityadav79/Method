package org.studyeasy;

public class Method2 {

	public static void main(String[] args) {
		loop(1,10);
		System.out.println("********");
		loop(20,40);
		System.out.println("*********");
		loop(1,10);

	}
	
	public static void loop(int step, int finalvalue) {
		while(step<=finalvalue) {
			System.out.println(step);
			step++;
		}
	}

}
