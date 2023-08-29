// wap to print  the value if it is divide by3 or 5?

import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        try (Scanner Scn = new Scanner(System.in)) {
            int value = Scn.nextInt();
            if (value % 5 == 0 || value % 3 == 0) {
                System.out.println("the find :" + value);
            }
        }
    }

}
