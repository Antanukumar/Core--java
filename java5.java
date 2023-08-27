import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner("System.in")) {
            while(Sc.hasNextLine()){
                String a= Sc.next();
                String b=Sc.next();
                System.out.println(a+b);
            }
        }
    }

    // private static Scanner hasNextline() {
    //     return null;
    // }
    
}
