import java.util.Scanner;

public class takinginput {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the first number");
        int num_1=sc.nextInt();
        System.out.println("enter the number: " +num_1);
    }
}    
}
