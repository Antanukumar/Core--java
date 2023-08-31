// <<<<<<< HEAD
// import java.util.Scanner;

// public class java4 {
//     public static void main(String[] args) {
//         try (Scanner Sc = new Scanner(System.in )) {
//             int t=Sc.nextInt();
//             for (int i=1;i<=t;  i++){
//                 int a=Sc.nextInt();
//                 int b=Sc.nextInt();
//                 System.out.println(a+b);
//             }
//         }

//     }
    
// }
// =======
import java.util.Scanner;

public class java4 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner("System.in" )) {
            int t=Sc.nextInt();
            for (int i=1;i<=t;  i++){
                int a=Sc.nextInt();
                int b=Sc.nextInt();
                System.out.println(a+b);
            }
        }

    }
    
}
// >>>>>>> 09a20ab066df6a80116d55baeeb3f421af93c191
