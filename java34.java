// find the sum of digit in a given number n

import java.util.Scanner;

public class java34 {
    public static void main(String[] args) {
        try(Scanner Sc=new Scanner(System.in)){
            int n= Sc.nextInt();
            int sumofdigit=0;
            int original_n=n;
            while (n>0) {
                sumofdigit +=n%10;
                n=n/10;
            }
            System.out.println("sumofdigit"+original_n+"="+sumofdigit);
        }
    }
    
}
