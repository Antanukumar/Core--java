// If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program
// to calculate his total marks and percentage marks.
// Input :
// 78
// 89
// 95
// Output : Total marks: 262
// percentage marks: 87%

import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner("System.in")) {
            int marks1= Sc.nextInt();
            int marks2=Sc.nextInt();
            int marks3=Sc.nextInt();
            int total_marks = marks1 + marks2 + marks3;
int percentage = (total_marks / 3);
System.out.println(total_marks);
System.out.println(percentage + "%");
        }




    }
    
}
