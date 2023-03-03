package com.singleton;

public class MainSingleton {

	public static void main(String[] args) {
		
		Singleton.getInstance();
		
		System.out.println(Singleton.getInstance());
		

	}

}
