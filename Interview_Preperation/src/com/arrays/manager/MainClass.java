package com.arrays.manager;

public class MainClass {
	public static void main(String[] args) {
		TransactionManager manager = new TransactionManager();
		manager.transact("Kumar", 100);
		manager.transact("Kumar", 200);
		manager.transact("Kumar", 300);
		manager.transact("Kumar", 400);
		manager.transact("Kumar", 500);
		manager.transact("Sunil", 100);
		manager.transact("Sunil", 200);
		manager.transact("Sunil", 300);

		double userBalance = manager.getUserBalance("Kumar");
		System.out.println(userBalance);

	}
}
