// Write a program to calculate marks to grades . Follow the conversion rule as given below :

import java.util.Scanner;

public class java32 {
    public static void main(String[] args) {
        try(Scanner Sc=new Scanner(System.in)){
            int marks;
            System.out.println("Enter the number");
            marks=Sc.nextInt();
            if (marks>=98){
                System.out.println("A+ grade");
            }else if(marks>=80){
                System.out.println("B+ grade");
            }else if(marks>=70){
                System.out.println("C+grade");
            }else{
                System.out.println("just pass");
            }
        }
    }
    
}
