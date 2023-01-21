package fy;

public class YourFirstAccount {

	public static void main(String[] args) {
		
		/*the project template comes with a ready-made class named Account. 
		object represents a bank account that has balance (i.e. one that has some amount of money in it).
		Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, and finally prints the balance.
		 NB! Perform all the operations in this exact order
		*/
		        Account acc=new Account("melika",100.0);
		        acc.deposit(20.0);
		        System.out.println(acc.toString());
		    }
		}
		


