// print the first n factorial no

import java.util.Scanner;

public class java37 {
    public static void main(String[] args) {
        try(Scanner Sc=new Scanner(System.in)){
            int n =Sc.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println(fact);
        }
    }
    
}
