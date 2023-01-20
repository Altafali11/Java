package input_output_stream;

import java.io.Console;

public class Console_class {

	public static void main(String[] args) {
		String str;
		Console c = System.console();
		if(c==null) {
			System.out.println("no console available");
			return;
		}
		
		 str = c.readLine();
		System.out.println("enter your name");
		System.out.println("welcome"+str);

	}

}

/// not solved try again 