import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in )) {
            int t=Sc.nextInt();
            for (int i=1;i<=t;  i++){
                int a=Sc.nextInt();
                int b=Sc.nextInt();
                System.out.println(a+b);
            }
        }

    }
    
}
