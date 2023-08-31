
// reversed the digit number

import java.util.Scanner;

public class java35 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int n =Sc.nextInt();
            int ans=0;
            while (n>0) {
                ans=ans*10+n%10;
                n/=10;
            }
            System.out.println(ans );
        }
        
    }
    
}
