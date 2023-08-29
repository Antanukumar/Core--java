import java.util.Scanner;

public class java22 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int n=Sc.nextInt();
            for(int num =n;num>=1;num-=2){
                System.out.println(num);
            }
        }
    }
    
}
