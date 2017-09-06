package shouvikmitra;
import java.util.*;
public class BankingApplication {
		//Instance Variables
		String name=new String();
		String type=new String();
		double balance=0.0;
		Scanner in=new Scanner(System.in);
		//Constructor
		public BankingApplication()
		{
			String name="";
			String type="";
			double balance=0;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BankingApplication client= new BankingApplication();
		int choice;
		do{
			System.out.println("Menu:");
			System.out.println("1. Open Account");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Deposit Money");
			System.out.println("Enter your choice (1-3):");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				client.openacc();
				client.print();
				break;
			case 2:
				client.withdraw();
				client.print();
				break;
			case 3:
				client.deposit();
				client.print();
				break;
			default:
				System.out.println("Incorrect Choice!");
			}
			
		}while(choice!= -1);
		
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+this.name);
		System.out.println("Type: "+this.type);
		System.out.println("Balance: "+this.balance);
	}
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Window:- ");
		System.out.println("Enter deposite amount: ");
		double dep=in.nextDouble();
		this.balance+=dep;
	}
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal Window:-");
		System.out.println("Enter withdraw amount: ");
		double withdraw=in.nextDouble();
		this.balance-=withdraw;
	}
	public void openacc() {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Account Opening Window:- ");
		System.out.println("Enter Name: ");
		this.name=in.nextLine();
		System.out.println("Enter Account Type: ");
		this.type=in.nextLine();
		System.out.println("Enter Opening Balance: ");
		this.balance=in.nextDouble();
	}
}
