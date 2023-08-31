// A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.

import java.util.Scanner;

public class java42 {
public static void main(String[] args) {
    try(Scanner Sc=new Scanner(System.in)){
        int year=Sc.nextInt();
        int salary=Sc.nextInt();
        //  double d =Sc.nextInt();
        
        System.out.println("Enter the bonus");
        if (year>5){
System.out.println("congrate ..yes !your total year of service more than 5 year \n please Enter your salary");
System.out.println("your salary is "+salary);
System.out.println("your 5% bonus is"+salary*0.05);
System.out.println("not bonus with salary"+(salary+(salary*0.05)));
        }else{
            System.out.println("No bonus");
        }
    }
}
    
}
