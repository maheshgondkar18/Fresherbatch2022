package assignment.com;

public class Assignment1_2 
{
	public static void main(String[] args) {

	System.out.println("Armstrong Numbers form 100 to 999 are:");
	for(int i=100;i<=999;i++)
	{
		int n=i;
		int r,sum;
		sum=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(sum == i)
		{
			System.out.println(i+"");
		}
		
	}

}
}
