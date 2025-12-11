package com.java8.interfacechanges;

public class Car implements Vehical {

	@Override
	public void start() {
		System.out.println("Car Started");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.stop();
		Integer add = Vehical.add(2, 2);
		System.out.println("Sum is " + add);

	}

}
