public class java104 {
    public static void main(String[] args) {
        int intarray[]={1,2,3};
        int clonearray[]=intarray.clone();
        System.out.println(intarray==clonearray);
        for(int i=0;i<clonearray.length;i++){
            System.out.println(clonearray[i]+"");
        }

    }
}
