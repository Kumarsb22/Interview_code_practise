package com.arrays.manager;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
	 public List<Transaction> data=new ArrayList<>();
	 
	 void transact(String user, int amount) {
	 Transaction i = new Transaction();
	 i.user = user;
	 i.setAmount(amount);
	 data.add(i);
	 }
	 
	 double getUserBalance(String user) {
	 List<Transaction> transactions = new ArrayList();
	 
	 for(int i = 0; i < data.size(); i++) {
	 if(data.get(i).user == user) {
	 transactions.add(data.get(i));
	 }
	 }
	 
	 return transactions.stream().mapToDouble(data -> data.getAmount()).reduce((left, right) -> left + right).getAsDouble();
	 }
	 
	 static class Transaction {
	 public String user;
	 public double amount;
	 
	 void setAmount(double amount) {
	 this.amount = amount;
	 }
	 
	 double getAmount() {
	 return amount;
	 }
	 
	 String getUser() {
	 return user;
	 }
	 
	 void setUser(String user) {
	 this.user = user;
	}
}

}
