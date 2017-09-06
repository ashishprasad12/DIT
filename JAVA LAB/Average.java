/* Find out the average of 5 subjects */
package csebda;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		// Initializations
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [5];
		int avg=0,sum=0;
		
		System.out.println("Enter marks of 5 subjects : ");
		
		//Taking input
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//Calculating average
		for(int i=0;i<5;i++)
		{
			sum+=arr[i];
		}
		avg=sum/5;
		
		System.out.println("Average of 5 subjects : "+avg);
	}

}
