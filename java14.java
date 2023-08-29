import java.util.Scanner;

public class java14 { 
    public static void main(String[] args, int num) {
        try (Scanner Sc = new Scanner(System.in)) {
            // int num =Sc.nextInt(); 
            String ans;
        ans=(num %2==0) ? "even" :"odd";
        System.out.println(ans);
        }
       
    }
}
