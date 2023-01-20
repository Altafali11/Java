package input_output_stream;

import java.io.FileOutputStream;

public class File_output {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\\\Users\\\\ALTAF ALI\\\\Desktop\\\\java");
			fout.write(65);
			fout.close();
			System.out.println("write operation is done");
		}
		catch(Exception e) {
			System.out.println();
		}
		

}
}