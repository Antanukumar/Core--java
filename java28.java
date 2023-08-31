// wap to print absolute value of a number entered by the user.
// input :-1
// output :1

import java.util.Scanner;

public class java28 {
    public static void main(String[] args) {
        try(Scanner Sc =new Scanner(System.in)){
            int num ;
            System.out.println("Enter the number :");
            num =Sc.nextInt();
            if(num<0){
                num =num*-1;
            }
            System.out.println("the absolute valuee :" +num);

        }
    }
    
}
