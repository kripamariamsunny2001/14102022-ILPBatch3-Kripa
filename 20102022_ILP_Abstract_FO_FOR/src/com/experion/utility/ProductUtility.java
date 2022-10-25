package com.experion.utility;



import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.service.Product;



public class ProductUtility {

	public static void main(String[] args)  {
	/*Account account = new Account("Womens Savings Account","ACC1987677",10000);
	AccountService accountService = new AccountService();
	accountService.depositCash(account,2000);
	accountService.depositCash(account,0,"kripa.sunny@experionglobal.com");
	accountService.depositCash(account,"CHQNo98756767",10000);
	*/
	Product product = null;
	Scanner scanner = new Scanner (System.in);
	System.out.println("1.Account 2.Card 3.Loan");
	int choice = scanner.nextInt();
	if(choice==1)
	{
		product=new Account ("Womens Savings Account","ACC19866",10000);
		Account account =(Account)product;
		account.cashWithdraw();
		account.checkBalance();
	}
	else if (choice==2)
	{
		product=new Card ("Master Card","CARD19866",10000);
		Card card =(Card)product;
		card.checkBalance();
		card.cashWithdraw();
	}
	else if (choice==3)
	{
		product=new Loan ("Home Loan","LOAN19866",10000);
		Loan loan =(Loan)product;
		loan.approveLoan();
		loan.checkDueDate();
		
	}
	product.checkProductValidity();
	}
}