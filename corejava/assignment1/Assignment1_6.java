package assignment.com;

import java.util.Scanner;

public class Assignment1_6 
{
	public static void main(String[] args) {
        String userId = "user";
        String password = "pass";
       Scanner input = new Scanner(System.in);

        for (int i=3;i>=1;i--) {

            System.out.print("Enter user id:");
            String user_id1 = input.nextLine();
            System.out.print("Enter user password:");
            String pass = input.nextLine();

            if ((userId.matches(user_id1)) && (password.matches(pass))) {
                System.out.println("welcome  " + userId);
                break;
            }
            else {
                System.out.println("login failed attempts remaining  " +(i-1) );
                System.out.println("");
                if (i==1){
                    System.out.println("Contact Admin");
                }
            }

        }


   }
}
