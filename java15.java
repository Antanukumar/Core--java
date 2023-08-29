// wap to print  the value if it is even and divide by3

import java.util.Scanner;

public class java15 {
    public static void main(String[] args) {
        try (Scanner Scn = new Scanner(System.in)) {
            int value = Scn.nextInt();
            if (value % 2 == 0 && value % 3 == 0) {
                System.out.println("the find :" + value);
            }
        }
    }

}
