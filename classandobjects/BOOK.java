package classandobjects;

import java.util.Scanner;

public class BOOK {

	private int bookno;
	private String booktitle;
	private float price;
	Scanner sc=new Scanner(System.in);
	private float TOTAL_COST(int n)
	{
		return n*price;
	}
	
	public void INPUT()
	{
		System.out.println("Enter Book Number: ");
		bookno=sc.nextInt();
		System.out.println("Enter Book Title: ");
		booktitle=sc.nextLine();
		System.out.println("Enter Price: ");;
		price=sc.nextFloat();
	}
	
	public void PURCHASE() {
		System.out.println("Enter Number of Copies: ");
		int n=sc.nextInt();
		sc.close();
		System.out.println("Total Price: "+TOTAL_COST(n));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOOK b=new BOOK();
		b.INPUT();
		b.PURCHASE();
	}

}
