package classandobjects;

import java.util.Scanner;

public class TEST {

	/**
	 * @param args
	 */
	private int TestCode;
	private String Description;
	private int NoCandidate;
	private int CenterReqd;
	
	private void CALCNTR()
	{
		CenterReqd=(NoCandidate/100)+1;
	}
	
	public void SCHEDULE()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter TestCode: ");
		TestCode=sc.nextInt();
		System.out.println("Enter Description: ");;
		Description=sc.nextLine();
		System.out.println("Enter Number of Candidate: ");
		NoCandidate=sc.nextInt();
		CALCNTR();
		sc.close();
	}
	
	public void DISPTEST() {
		System.out.println("Test Code: "+TestCode);
		System.out.println("Description: "+Description);;
		System.out.println("Number of Candidates: "+NoCandidate);
		System.out.println("Centers Required: "+CenterReqd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TEST t=new TEST();
		t.SCHEDULE();
		t.DISPTEST();
	}

}
