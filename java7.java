<<<<<<< HEAD
// - Swap two numbers without the use of third variable.

// Input: 5 10
// Output: 10 5

import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        try (Scanner Sc=new Scanner(System.in)){
            System.out.println("Enter the first number");
            int x=Sc.nextInt();
            System.out.println("Enter the second number");
            int y=Sc.nextInt();
            x=x+y;
            y=x-y;
            x=x-y;
            System.out.println(x);
            System.out.println(y);
        }
    }
    
}
=======
// - Swap two numbers without the use of third variable.

// Input: 5 10
// Output: 10 5

import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        try (Scanner Sc=new Scanner("System.in")){
            System.out.println("Enter the first number");
            int x=Sc.nextInt();
            System.out.println("Enter the second number");
            int y=Sc.nextInt();
            x=x+y;
            y=x-y;
            x=x-y;
            System.out.println(x);
            System.out.println(y);
        }
    }
    
}
>>>>>>> 09a20ab066df6a80116d55baeeb3f421af93c191
