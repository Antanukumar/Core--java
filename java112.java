public class java112 {
    public static void main(String[] args) {
        int n=5;
            // For loop 'row' in range 0 to N-1.
            for(int row = 0; row < n; row++)
            {
                // For loop 'col' in range 0 to row.
                for(int col = 0; col < n; col++)
                {
                    // If 'col' < N-'row', print  a '*'.
                    if(col < (n-row))
                    {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
    }
}
