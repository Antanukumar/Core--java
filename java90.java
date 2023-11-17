import java.util.Scanner;

public class java90 {
    static int java90(int[] arr,int target){
        int n=arr.length;
        int ans =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans++;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n =sc.nextInt();
        int [] arr=new int [n];


        System.out.println("Enter "+n+"element");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
}
