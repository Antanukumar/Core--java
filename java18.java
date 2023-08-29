//  the sum of the first n natural number ,where n is the input
import java.util.Scanner;

public class java18 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int n=Sc.nextInt();
            int num =1;
            
            while (num<=n) {
                System.out.println(num);
                num=num+1;
            }
        }
    }
    
}
