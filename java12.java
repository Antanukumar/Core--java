// wap to find even and odd number ?

import java.util.Scanner;

public class java12 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int num =Sc.nextInt();
            if (num%2==0){
                System.out.println("Even");
            }else{
                System.out.println("odd");
            }
        }
    }
    
}
