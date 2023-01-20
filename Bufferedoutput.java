package input_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Bufferedoutput {

	public static void main(String[] args) {
		try {
			FileOutputStream fout= new FileOutputStream("C:\\Users\\ALTAF ALI\\Desktop\\java");
			BufferedOutputStream bout= new BufferedOutputStream(fout);
			String s = "its a evening";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

