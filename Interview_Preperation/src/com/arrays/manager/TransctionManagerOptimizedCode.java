package com.arrays.manager;

import java.util.ArrayList;
import java.util.List;

public class TransctionManagerOptimizedCode {
	public static void main(String[] args) {

		TransctionManagerOptimizedCode code = new TransctionManagerOptimizedCode();
		code.transact("Kumar Balambeed", 100);
		code.transact("Kumar Balambeed", 100);
		code.transact("Sunil Balambeed", 100);
		code.transact("Sunil Balambeed", 100);
		System.out.println(code.getUserBalance("Kumar Balambeed"));
	}

	List<Transaction> transctions = new ArrayList<>();

	public void transact(String user, int amount) {
		Transaction transaction = new Transaction();
		transaction.user = user;
		transaction.setAmount(amount);
		transctions.add(transaction);
	}

	public Double getUserBalance(String user) {
//		return transctions.stream().filter(e -> e.getUser().equals(user)).mapToDouble(e -> e.getAmount())
//				.reduce((left, right) -> left + right).getAsDouble();
		return transctions.stream().filter(e -> e.getUser().equals(user)).mapToDouble(e -> e.getAmount()).sum();

	}

	static class Transaction {
		private String user;
		private double amount;

		private void setUser(String user) {
			this.user = user;
		}

		private void setAmount(double amount) {
			this.amount = amount;
		}

		private String getUser() {
			return this.user;
		}

		private double getAmount() {
			return this.amount;
		}
	}

}
