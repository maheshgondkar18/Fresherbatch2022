package assignment.com;

import java.util.Scanner;

public class Assignment1_4
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Marks of subject 1:");
		int s1=sc.nextInt();
		System.out.println("Enter Marks of subject 2:");
		int s2=sc.nextInt();
		System.out.println("Enter Marks of subject 3:");
		int s3=sc.nextInt();
		
		if(s1 > 60 && s2>60 && s3>60)
		{
			System.out.println("Student Passed..!");
		}
		else if((s1 >60 && s2>60 &&s3<60 )||(s1 >60 && s2<60 &&s3>60 )||(s1 <60 && s2>60 &&s3>60 ))
		{
			System.out.println("Student Promoted...!");
		}
		else if((s1 >60 && s2<60 &&s3<60 )||(s1 <60 && s2>60 &&s3<60 )||(s1 <60 && s2<60 &&s3>60 ))
		{
		System.out.println("Student Failed..!");	
		}
		else
		{
			System.out.println("Enter marks");
		}
	}
}
