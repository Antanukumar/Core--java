// wap to divide people int 3 age group depending upon their age
// age below 12 its a child and between 12 and 18 its teenager or above 18 its a adult?



import java.util.Scanner;

public class java13 {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int age =Sc.nextInt();
            if (age<=12){
                System.out.println("child");
            }else if(age>12&&age<18){
                System.out.println("teenager");
            }else{
                System.out.println("adult");
            }
        }
    }
    
}
