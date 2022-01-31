package assignment.com;
import java.util.*;

public class Assignment1_9 
{
public static void main(String[] args) 
{
	int totalmarks = 0;
	double avg;
	int ch=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks of First Subject:");
	int A=sc.nextInt();
	System.out.println("Enter the marks of Second Subject:");
	int B=sc.nextInt();
	System.out.println("Enter the marks of Third Subject:");
	int C=sc.nextInt();
	while(ch!=4)
	{
	System.out.println("1.Total marks"+"\n"+" 2.Average"+"\n"+" 3.Average of Each Subject"+"\n"+"4.Exit"+"\n"+"Enter Your Choice:");
	ch=sc.nextInt();
	switch(ch) 
	{
		case 1:
				totalmarks=A+B+C;
				System.out.println("Total marks of student is:"+totalmarks);
				break;
		case 2:
			totalmarks=A+B+C;
				avg=(totalmarks/3.0);
				System.out.println("Average is:"+avg);
				break;
		case 3:
				double avg1=(A/1.0);
				avg=(B/1.0);
				avg=(C/1.0);
				System.out.println(" Average of A is: "+avg1+" Average of B is: "+avg+" Average of C is:"+avg);
				break;
		case 4:
				System.exit(0);
				break;
		default:
			System.out.println("Wrong Choice..!");
	}
	}
}
}
