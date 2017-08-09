package csebda;

import java.util.Scanner;

public class Table {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		for(int i=0;i<=15;i++)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
	

}
