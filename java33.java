// count the no of digit for givin no n.
// n=12356

import java.util.Scanner;

public class java33 {
    public static void main(String[] args) {
        try(Scanner Sc =new Scanner(System.in)){
            int n =Sc.nextInt();
            int numofdigit=0;
            int original_n=n;
            while (n>0) {
                n=n/10;
                numofdigit++;

            }
            System.out.println("numofdigit"+original_n+"="+numofdigit);
        }
    }
    
}
