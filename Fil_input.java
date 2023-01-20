package input_output_stream;

import java.io.FileInputStream;

public class Fil_input {

	public static void main(String[] args) {
		try {
			FileInputStream fin= new FileInputStream("C:\\Users\\ALTAF ALI\\Documents‪");
			int i = fin.read();
			
			System.out.println((char)i);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
