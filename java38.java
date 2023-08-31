// given 2 no a and b .find a raise to the power b.

import java.util.Scanner;

public class java38 {
    public static void main(String[] args) {
        try(Scanner Sc=new Scanner(System.in)){
            int a=Sc.nextInt(), b=Sc.nextInt();
            int ans =1;
            for(int i=1;i<=b;i++){
                ans*=a;
            }
            System.out.println(ans);

        }
    }
}
