<<<<<<< HEAD
import java.util.Scanner;

public class simple_interset {
    public static void main(String[] args) {
         try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enter the principle");
            float p=Sc.nextFloat();
            System.out.println("Enter the rate of interset");
            float r=Sc.nextFloat();
            System.out.println("Enter the time period in years");
            float t=Sc.nextFloat();
            float Si=(p*r*t)/100;
            System.out.println("princle :"+p);

            System.out.println("rate of interest:"+r);

            System.out.println("time period in years:"+t);

            System.out.println("the simple interest:"+Si);
        }
        
    }
    
}
=======
import java.util.Scanner;

public class simple_interset {
    public static void main(String[] args) {
         try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enter the principle");
            float p=Sc.nextFloat();
            System.out.println("Enter the rate of interset");
            float r=Sc.nextFloat();
            System.out.println("Enter the time period in years");
            float t=Sc.nextFloat();
            float Si=(p*r*t)/100;
            System.out.println("princle :"+p);

            System.out.println("rate of interest:"+r);

            System.out.println("time period in years:"+t);

            System.out.println("the simple interest:"+Si);
        }
        
    }
    
}
>>>>>>> 09a20ab066df6a80116d55baeeb3f421af93c191
