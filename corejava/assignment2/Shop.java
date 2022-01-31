package assignment.com;

import java.util.Locale;
import java.util.Scanner;

abstract class DesertItem{
    abstract public int getcost(int count);
    }
class Candy extends DesertItem{
    int TotalCandies =0;
    int DollarInRs = 60;
    public int addCandies(int candies){
        TotalCandies +=candies;
        return TotalCandies;
    }

    @Override
    public int getcost(int count) {
        return count*DollarInRs;
    }
}

class Cookies extends DesertItem{
    int TotalCookoies =0;
    int EuroInRs =70;
    public int addCookies(int cookies){
        TotalCookoies +=cookies;
        return TotalCookoies;
    }

    @Override
    public int getcost(int count) {
        return count*EuroInRs;
    }
}

class IceCream extends DesertItem{
    int TotalIceCream = 0;
    int cost =1;
    public int addIceCream(int iceCream){
        TotalIceCream += iceCream;
        return TotalIceCream;
    }

    @Override
    public int getcost(int count) {
        return cost*count;
    }
}





public class Shop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.println("Choose the role admin or customer");
            String role;
            role = input.nextLine();
            if (role.toUpperCase(Locale.ROOT).matches("CUSTOMER")) {
                System.out.println("Choose itmes to be placed :");
                System.out.println("1. Candy\n2. Cookie\n3. Ice Cream");
                System.out.println("Enter your choice: ");
               // Scanner input = new Scanner(System.in);
                int choice;
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        DesertItem candy1 = new Candy();
                        System.out.println("enter the quantity:");
                        int count = input.nextInt();
                        System.out.println("cost of " + count + "candies is " + candy1.getcost(count));
                        break;
                    case 2:
                        DesertItem cookies = new Cookies();
                        System.out.println("Enter the quantity");
                        count = input.nextInt();
                        System.out.println("cost of " + count + " cookies is " + cookies.getcost(count));
                        break;
                    case 3:
                        DesertItem icecream = new IceCream();
                        System.out.println("Enter the quantity");
                        count = input.nextInt();
                        System.out.println("cost of " + count + " Icecream is " + icecream.getcost(count));
                }
            }
            else if(role.toUpperCase(Locale.ROOT).matches("ADMIN")){
                AdminAdding.AdminAdding();
            }

            }

}
class AdminAdding{
    static void AdminAdding() {
        int digitPin =4545;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the 4 digit pin");
        int digitPinEntered = input.nextInt();
        if (digitPinEntered== digitPin) {
            System.out.println("Choose itmes to be added :");
            System.out.println("1. Candy\n2. Cookie\n3. Ice Cream");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice;
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Candy candy = new Candy();
                    System.out.println("enter the ammount of candies to be added");
                    int amount = input.nextInt();
                    int total = candy.addCandies(amount);
                    System.out.println("total candies :" + total);
                    break;
                case 2:
                    Cookies cookies = new Cookies();
                    System.out.println("enter the ammount of cookies to be added");
                    amount = input.nextInt();
                    total = cookies.addCookies(amount);
                    System.out.println("total cookies :" + total);
                    break;
                case 3:
                    IceCream iceCream = new IceCream();
                    System.out.println("enter the ammount of icecream to be added");
                    amount = input.nextInt();
                    total = iceCream.addIceCream(amount);
                    System.out.println("total Icecream :" + total);
                    break;
            }
        }
        else
            System.out.println("Access Denied");

    }
}
