package com.kdp.java;

public class HelloWorld {

	/**
	 * @author Charly Ngoukam
	 * @param args
	 */
	public static void main(String[] args) {
		// Ce projet est est juste magnifique
		Greeting obj = new Greeting();
		System.out.println(obj.greet("Charly"));
		AnotherGreeting ag= new AnotherGreeting();
		int nbre=ag.Division(20,10);
        System.out.println(nbre);
	}	
}
