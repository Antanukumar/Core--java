import java.util.Scanner;

public class java46 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name;
            int roll;
            float marks;

            System.out.println("Enter your name");

            name =sc.nextLine();
            System.out.println("Enter the roll");

            roll=sc.nextInt();
            System.out.println("Enter the marks ");
            marks=sc.nextFloat();

            System.out.println("Name ="+name);
            System.out.println("Rollno="+roll);
            System.out.println("marks="+marks);
        }


    }
    
}
