// wap to calculate the sum of the digit of a 3 digit number;
// input=132
// output =6
import java.util.Scanner;

public class java8 {
    public static void main(String[] args) {
        try(Scanner Sc=new Scanner(System.in)){
            int sum=0;
            while (sum>0){
                sum +=sum%10;
                sum/=10;
                
            }
            System.out.println(sum);
        }
    }
    
}
