import java.util.Scanner;

public class java40 {
    public static void main(String[] args) {
        try(Scanner Sc=new Scanner(System.in)){
            int num1;
            int num2;
            num1 =Sc.nextInt();
            System.out.println("Enter the number");
            num2 =Sc.nextInt();
            System.out.println("Enter the number");
            if(num1>num2){
                System.out.println("Enter the num 1 is greater");
            }else{
                System.out.println("Enter the num2 greater");
            }
        }
    }
    
}
