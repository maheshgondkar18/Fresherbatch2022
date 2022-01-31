package assignment.com;

import java.util.Scanner;

public class Employee {
    int salary = 28000;
    void getsalary(){
        System.out.println("Base salary of the employee: "+salary);
    }

}

class Manager extends Employee{
    @Override
    void getsalary() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("enter the incentive offered : ");
        int incentive= input.nextInt();
        int totalSalary = incentive+super.salary;
        System.out.println("Total salary of manager with incentive is " +totalSalary);
        super.getsalary();
    }
}


class Labour extends Employee{
    @Override
    void getsalary() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter the overtime amount");
        int overtime =input.nextInt();
        int totalSalary = super.salary+overtime;
        System.out.println("total salary of labour with overtime :" +totalSalary);
    }
}



class salary{
    public static void main(String[] args) {
        Employee employee =new Employee();
        employee.getsalary();
        Manager manager = new Manager();
        manager.getsalary();
        Labour labour = new Labour();
        labour.getsalary();
    }
}
