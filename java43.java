
// A school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 45 - E
// c. 45 to 50 - D
// d. 50 to 60 - C
// e. 60 to 80 - B
// f. Above 80 - A
// Ask user to enter marks and print the corresponding grade.

import java.util.Scanner;

public class java43 {
     public static void main(String[] args) {
        try(Scanner Sc = new Scanner(System.in)){
            int x=Sc.nextInt();
            System.out.println("Enter the number");
            if (x<25){
                System.out.println("f");

            }else if((x>=25) &&(x<45)){
System.out.println("E");
            }else if((x>=45) &&(x<50)){
System.out.println("D");
            }else if((x>=50) &&(x<60)){
System.out.println("C");
            }else if((x>=60) &&(x<70)){
System.out.println("B");
            }else if((x>=70) &&(x<80)){
System.out.println("A");
            }else if((x>=80) &&(x<100)){
System.out.println("A++");
        }else{
            System.out.println("no correct marks");
        }
     }
    
     }
    }
