
// Java program to illustrate creating an array
// of integers,  puts some values in the array,
// and prints each value to standard output.
 // declares an Array of integers.
 // allocating memory for 5 integers.
 // initialize the first elements of the array
 // initialize the second elements of the array
  // accessing the elements of the specified array





public class java87 {
    public static void main(String[] args) {
        int[]arr;
        arr=new int[4];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element" +":"+arr[i]);
        }
    }
}
