// wap to print positive no entered by the user if user if user enterd a negative no it is skipped
// input =-6 and output =the no is negative and skipped.

import java.util.Scanner;

public class java30 {
    public static void main(String[] args) {
        try(Scanner Sc=new Scanner(System.in)){
            int x;
            System.out.println("Enter the number ");
            x=Sc.nextInt();
            if(x>=0){
                System.out.println("Enter the positive number");
            }else{
                System.out.println("your no is negative and is skipped");
            }
        }
    }
    
}
