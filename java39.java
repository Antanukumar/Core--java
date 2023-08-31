import java.util.Scanner;

public class java39 {
    public static void main(String[] args) {
        try(Scanner Sc=new Scanner(System.in)){
            int lenght; 
            lenght =Sc.nextInt();
            System.out.println("Enter the length");
             int breadth;
             breadth=Sc.nextInt();
             System.out.println("Enter the breadth");
             if (lenght==breadth){
                System.out.println("square");
             }else{
                System.out.println("not square");
             }

        }
    }
    
}
