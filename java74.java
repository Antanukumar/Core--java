  // Creating and Initializing a variable
  // Do-While loop for iteration
  // Incrementing loop variable by 2
  // Illustrating continue statement skipping
                // the execution  when i==7 or i==15
                 // Printing to showcase continue affect
                 // Incrementing variable by 2
                 // Condition check

// Java Program to illustrate the use of continue statement
// inside the Do-While loop

// Importing generic Classes/Files
import java.util.*;

public class java74 {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating and Initializing a variable
		int i = 0;

		// Do-While loop for iteration
		do {
			if (i == 4 || i == 18) {

				// Incrementing loop variable by 2
				i += 2;

				// Illustrating continue statement skipping
				// the execution when i==7 or i==15
				continue;
			}

			// Printing to showcase continue affect
			System.out.println(i);

			// Incrementing variable by 2
			i += 2;

			// Condition check
		} while (i <= 35);
	}
}

