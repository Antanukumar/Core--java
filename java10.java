import java.util.Scanner;

public class java10 {
    public static void main(String[] args) {
        try(Scanner Sc =new Scanner(System.in)){
           int a = 55;
int b = 70;
System.out.print(a < 50 || a < b);
        }
    }

}
