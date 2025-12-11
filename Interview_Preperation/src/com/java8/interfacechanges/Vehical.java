package com.java8.interfacechanges;

public interface Vehical {
	public void start();
	
//	1. Default Methods (Introduced in Java 8)
//	Purpose:
//
//	Allow interfaces to have method implementations without breaking existing implementations.
//
//	Enable the evolution of interfaces without forcing all implementing classes to override new methods.
//
//	Use Case:
//	Before Java 8, if a new method was added to an interface, all implementing classes had to provide an implementation, which was problematic for maintaining backward compatibility.

	default void stop() {
		System.out.println("Stoping the vehicle");
	}
	
	
//	Purpose:
//
//		Provide utility/helper methods in an interface without affecting implementing classes.
//
//		Avoid cluttering utility methods in separate classes (like Collections or Math utility classes).
//
//		Use Case:
//		Before Java 8, utility methods were typically placed in separate utility classes. Now, static methods can be defined directly inside interfaces.
	static Integer add(int a, int b) {
		return a + b;

	}   
}
