// Outer loop for iteration
// Inner loop for iteration
// Continue statement in inner loop to
                    // skip the execution when i==3 and j==2
 
                    // Print elements to showcase keyword affect


public class java75 {
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=1; j<=3 ; j++){
                if(i==3 && j==2){
                    continue;
                }System.out.println(i+"*"+j);
            }
        }
    }


    
}
