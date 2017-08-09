package csebda;

import java.util.Scanner;

public class MatAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat1[][]= new int[3][3];
		int mat2[][]= new int[3][3];
		int res[][]= new int[3][3];
		Scanner sc= new Scanner(System.in);
		
		//Input
		System.out.println("Enter elements to first Matrix: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter elements to second Matrix: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		
		//Calculating & Printing
		System.out.println("Resultant Matrix: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				res[i][j]=mat1[i][j]+mat2[i][j];
				System.out.printf("%10d ",res[i][j]);
			}System.out.println();
		}
	}
}
