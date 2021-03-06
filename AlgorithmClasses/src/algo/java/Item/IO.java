package algo.java.Item;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class IO {
    // Use file name from command line arg (if given). Otherwise read from stdin (console)
    // If reading from Console up to end of input, type
    // Ctrl-D (Unix, apple) or Ctril-Z (Windows) to signal EOF.

    public static void main(String[] args) throws FileNotFoundException
    { Scanner in;
	if (args.length > 0) {
	    File inputFile = new File(args[0]);
	    in = new Scanner(inputFile);
	} else {
	    in = new Scanner(System.in);
	}
	int s = in.nextInt();
	float t = in.nextFloat();
	System.out.println("s: " + s + " t: " + t);
    }
}