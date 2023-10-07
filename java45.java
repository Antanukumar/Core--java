// Java Program for taking user
// input using BufferedReader Class
import java.io.*;

class java45 {

	// Main Method
	public static void main(String[] args)
		throws IOException
	{
		// Creating BufferedReader Object
		// InputStreamReader converts bytes to
		// stream of characterf
		BufferedReader bfn = new BufferedReader(
			new InputStreamReader(System.in));

		// String reading internally
		String str = bfn.readLine();

		// Integer reading internally
		int it = Integer.parseInt(bfn.readLine());

		// Printing String
		System.out.println("Entered String : " + str);

		// Printing Integer
		System.out.println("Entered Integer : " + it);
	}
}
