// wap to calculate sp and cp 

import java.util.Scanner;

public class java29 {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            int sp;
            System.out.println("Enter the selling price");
            sp=sc.nextInt();
            int cp;
            System.out.println("enter the cost price");
            cp=sc.nextInt();
            int amt;
            if(cp>sp){
                amt=cp-sp;
                System.out.println("the loss of amt :" +amt);

            }else if(cp<sp){
                amt=sp-cp;
                System.out.println("the profit of amt" +amt);
            }else{
                System.out.println("there is no profit");
            }

        }
    }
    
}
