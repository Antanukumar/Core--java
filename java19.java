// print sum of the first n natural number ,where n is the input 

import java.util.Scanner;

public class java19 {
    public static void main(String[] args) {
         try (Scanner Sc = new Scanner(System.in)) {
            int n =Sc.nextInt();
             int sum=0;
             int num =1;
             while (num<=n) {
               sum=sum+num;
               num++; 
             }
             System.out.println(sum);
        }
    }
    
}
