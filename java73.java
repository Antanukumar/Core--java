// Initializing a variable say it count  to a value
        // greater than the value greater among the loop
        // values
        // Decrementing variable initialized above
 
                // Showing continue execution inside loop
                // skipping when count==7 or count==15
                // continue;
                // Printing values after continue statement
                // Decrementing the count variable

public class java73 {
    public static void main(String[] args) {
        int count =20;
        while(count>=0){
            if(count==7 || count==15){
                count --;
                continue;
            }System.out.println(count +"");
            count --;
        }
    }
    
}
