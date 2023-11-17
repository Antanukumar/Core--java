import java.util.Scanner;

public class java92 {
    static int java92(int[] arr,int target){
        int n=arr.length;
        int ans =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;

                }
            }
        }

        // in =-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
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
        System.out.println("unique element"+ (arr));
    }
}
