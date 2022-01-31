package assignment.com;
import java.util.*;
public class Assignement1_7
{
	 public static void main(String[] args) {

	        int[] sort = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
	        int flag =0;

	        System.out.println("Enter a number to Search");
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        for (int i = 0; i < sort.length; i++) {
	            if (sort[i] == num) {
	                System.out.println("Match found at position " +i);
	                flag=1;
	            }
	            }
	        if (flag ==0){
	            System.out.println("Match not found");

	            }


	    }
}
