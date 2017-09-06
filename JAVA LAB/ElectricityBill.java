import java.util.Scanner;



public class ElectricityBill {
	
	//instance variables
	static int bill,temp,type;
	static String name,address,billno;
	static double amount;
	static Scanner sc=new Scanner(System.in);
	public static void get()
	{
		System.out.println("Enter Bill No: ");
		billno=sc.nextLine();
		System.out.println("Enter Name: ");
		name=sc.nextLine();
		System.out.println("Enter address: ");
		address=sc.nextLine();
		System.out.println("Enter Bill : ");
		bill=sc.nextInt();
		temp=bill;
		System.out.println("Enter Type (1 for Household & 2 for Industry) : ");
		type=sc.nextInt();
	}
	
	public static void calcHome()
	{
		if(bill<100)
		{
			amount+=bill*3.0;
		}
		else if(bill<200)
		{
			amount+=100*3.0;
			bill-=100;
			amount+=bill*2.5;
		}
		else if(bill<300)
		{
			amount+=(100*3.0)+(100*2.5);
			bill-=200;
			amount+=bill*2.0;
		}
		else
		{
			amount+=(100*3.0)+(100*2.5)+(100*2.0);
			bill-=300;
			amount+=bill*1.5;
		}
			
	}
	
	public static void calcIndustry()
	{

		if(bill<100)
		{
			amount+=bill*4;
		}
		else if(bill<200)
		{
			amount+=100*4.0;
			bill-=100;
			amount+=bill*3.0;
		}
		else if(bill<300)
		{
			amount+=(100*4.0)+(100*3.0);
			bill-=200;
			amount+=bill*2.5;
		}
		else
		{
			amount+=(100*4.0)+(100*3.0)+(100*2.5);
			bill-=300;
			amount+=bill*2.0;
		}
			
	}
	
	
	
	public static void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Bill No: "+billno);
		System.out.println("Units: "+temp);
		System.out.println("Amount: "+amount);
		System.out.println("Type: "+type);
	}
	public static void main(String [] args) {
		get();
		if(type==1)
			calcHome();
		else
			calcIndustry();
		display();
	}
}


/********************************************************************
*	Home Use		  *		Industry			*		Units		*
*********************************************************************
*	3.0 per unit    *		4.0 per unit	  * 	First 100 units	          *
*	2.5 per unit	  *		3.0 per unit		*  100 to 200 units           *
*	2.0 per unit	  * 	2.5 per unit		*  200 to 300 units           *
*	1.5 per unit	  *		2.0 per unit		*  More than 300	            *
*********************************************************************

*/
