<<<<<<< HEAD
// Input two different string and print them in same line.
// Input :
// Level
// Up
// Output :
// LevelUp

import java.util.Scanner;
public class java2 {
    public static void main(String[] args) {
      try (Scanner Sc = new Scanner(System.in)) {
        String first=Sc.nextLine();
        String second=Sc.nextLine();
        System.out.println(first+ "" +second);
      }


    }
    
}
=======
// Input two different string and print them in same line.
// Input :
// Level
// Up
// Output :
// LevelUp

import java.util.Scanner;
public class java2 {
    public static void main(String[] args) {
      try (Scanner Sc = new Scanner("System.in")) {
        String first=Sc.nextLine();
        String second=Sc.nextLine();
        System.out.println(first+ "" +second);
      }


    }
    
}
>>>>>>> 09a20ab066df6a80116d55baeeb3f421af93c191
