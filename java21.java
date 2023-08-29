import java.util.Scanner;

public class java21 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int n=Sc.nextInt();
            for(int num =n;num>=1;num--){
                System.out.println(num);
            }
        }
    }
    
}
