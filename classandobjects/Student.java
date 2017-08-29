package classandobjects;

import java.util.Scanner;

public class Student {

	/**
	 * @param args
	 */
	private int admno;
	private String sname=new String();
	private float eng,math,science,total;
	
	private float ctotal()
	{
		return eng+math+science;
	}
	
	public void Takedata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name - ");
		sname=sc.nextLine();
		System.out.println("Enter Admission No. - ");
		admno=sc.nextInt();
		System.out.println("Enter Marks of English - ");
		eng=sc.nextFloat();
		System.out.println("Enter Marks of Maths - ");
		math=sc.nextFloat();
		System.out.println("Enter Marks of Science - ");
		science=sc.nextFloat();
		total=ctotal();
		sc.close();
	}
	
	public void Showdata()
	{
		System.out.println("Name - "+sname);
		System.out.println("Admission No. - "+admno);
		System.out.println("English - "+eng);
		System.out.println("Maths - "+math);
		System.out.println("Science - "+science);
		System.out.println("Total - "+total);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.Takedata();
		s.Showdata();
	}

}
