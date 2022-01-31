package assignment.com;

public class Assignment1_1
{
	public static void main(String[] args) 
	{
		int i=153;
		
			int n=i;
			int r,sum;
			sum=0;
			while(n>0)
			{
				r=n%10;
				n=n/10;
				sum=sum+r*r*r;
			}
	System.out.println(sum);				
	}
}
	
