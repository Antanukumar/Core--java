// <<<<<<< HEAD
// // // - Find the total number of bits needed to be flipped to convert x to y.
// // Input: 65 80
// // Output: 2

// import java.util.Scanner;
// public class java11 {
// public static void main(String[] args) {
// try (Scanner scn = new Scanner(System.in)) {
//     int x = scn.nextInt();
//     int y = scn.nextInt();
//     int n = x ^ y;
//     int count = 0;
//     while (n != 0){
//     n = n & (n - 1);
//     count++;
//     }
//     System.out.print(count);
// }
// }
// =======
// // - Find the total number of bits needed to be flipped to convert x to y.
// Input: 65 80
// Output: 2

import java.util.Scanner;
public class java11 {
public static void main(String[] args) {
try (Scanner scn = new Scanner(System.in)) {
    int x = scn.nextInt();
    int y = scn.nextInt();
    int n = x ^ y;
    int count = 0;
    while (n != 0){
    n = n & (n - 1);
    count++;
    }
    System.out.print(count);
}
}
// >>>>>>> 09a20ab066df6a80116d55baeeb3f421af93c191
}