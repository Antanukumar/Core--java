// wap which take the values of lenght and breadth from user and check if is a square or not .
// input: enter the lenght =5
// enter the breadth =4

import java.util.Scanner;

public class java27 {
    public static void main(String[] args) {
        try(Scanner Sc=new Scanner(System.in)){
            int lenght;
            System.out.println("Enter lenght");
            lenght=Sc.nextInt();
            int breadth;
            System.out.println("Enter the breadth");
            breadth=Sc.nextInt();
            if(lenght==breadth){
                System.out.println("it is a square ");

            }
            else{
                System.out.println("it is not a square");
            }

        }
    }

    
}
