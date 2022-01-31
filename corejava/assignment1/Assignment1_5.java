package assignment.com;
import java.util.*;
public class Assignment1_5 
{
	 public static void main(String[] args) {

	        Scanner sc =new Scanner(System.in);
	        System.out.println("Enter the income range");
	        int ctc = sc.nextInt();
	        int tax=0;
	        if (ctc>=0 && ctc<=180000){
	            System.out.println("tax % is 0");
	            System.out.println("Nil");
	        }
	        else if(ctc>=181001 &&ctc<=300000){
	            tax = (ctc*10)/100;
	            System.out.println("tax % is 10");
	            System.out.println(tax);
	        }
	        else if(ctc>=300001 && ctc<= 500000){
	            tax = (ctc*20)/100;
	            System.out.println("tax % is 20");
	            System.out.println(tax);
	        }
	        else if(ctc>=500001 && ctc<=1000000){

	            tax =(ctc*30)/100;
	            System.out.println("tax % is 30");
	            System.out.println(tax);
	        }

	    }
}
