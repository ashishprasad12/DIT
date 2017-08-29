package classandobjects;

import java.util.Scanner;

public class Flight {

	private int flightnumber;
	private String Destination;
	private float Distance;
	private float Fuel;
	
	private void CALFUEL()
	{
		if(Distance<=1000)
			Fuel=500;
		else if(Distance>1000 && Distance<=2000)
			Fuel=1100;
		else
			Fuel=2200;
	}
	
	public void FEEDINFO() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Flight Number: ");
		flightnumber=sc.nextInt();
		System.out.println("Enter Destination: ");;
		Destination=sc.nextLine();
		System.out.println("Enter Distance: ");;
		Distance=sc.nextFloat();
		CALFUEL();
		sc.close();
	}
	
	public void SHOWINFO() {
		System.out.println("Flight Number: "+flightnumber);
		System.out.println("Destination: "+Destination);
		System.out.println("Distance: "+Distance);
		System.out.println("Fuel: "+Fuel);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight f=new Flight();
		f.FEEDINFO();
		f.SHOWINFO();
	}

}
