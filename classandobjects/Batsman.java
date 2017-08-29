package classandobjects;

import java.util.Scanner;

public class Batsman {

	private int bcode;
	private String bname;
	private int innings,notout,runs;
	private double batavg;
	
	private void calcavg()
	{
		batavg=runs/(innings-notout);
		
	}
	
	public void readdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bcode: ");
		bcode=sc.nextInt();
		System.out.println("Enter Name: ");
		bname=sc.nextLine();
		System.out.println("Enter Innings: ");
		innings=sc.nextInt();
		System.out.println("Enter Notout: ");
		notout=sc.nextInt();
		System.out.println("Enter Runs: ");
		runs=sc.nextInt();
		sc.close();
	}
	
	public void displaydata()
	{
		System.out.println("Bcode: "+bcode);
		System.out.println("Name: "+bname);
		System.out.println("Innings: "+innings);
		System.out.println("Notout: "+notout);
		System.out.println("Runs: "+runs);
		System.out.println("Batting Average: "+batavg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batsman b=new Batsman();
		b.readdata();
		b.calcavg();
		b.displaydata();
	}

}
