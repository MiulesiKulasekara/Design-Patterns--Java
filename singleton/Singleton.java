package com.singleton;

public class Singleton {
	
	private static Singleton uniqueinstance;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		
		if(uniqueinstance == null) {
			uniqueinstance = new Singleton();
		}
		return uniqueinstance ;
	}

}

/*Singleton Pattern says that just"define a class that has only one 
instance and provides a global point of access to it".
In other words, a class must ensure that only single instance 
should be created and single object can be used by all other classes.*/

/*Static member: It gets memory only once because of static, it contains the instance of the Singleton class.
Private constructor: It will prevent to instantiate the Singleton class from outside the class.
Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller.*/