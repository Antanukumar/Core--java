<<<<<<< HEAD
import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
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
=======
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
>>>>>>> 09a20ab066df6a80116d55baeeb3f421af93c191
