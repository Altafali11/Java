package strings;

public class Stringbuilder {
	public static void main(String[] args) {
		StringBuilder sc = new StringBuilder ("hello");
		System.out.println(sc);

		
		// CharAt() function to find  any word in string by it index number
		StringBuilder sb = new StringBuilder ("hello");
		System.out.println(sb.charAt(4));
		
		// set a character at  index by using setcharat()
		StringBuilder sb1 = new StringBuilder ("hello");
		sb1.setCharAt(0,'s');
		System.out.println(sb1);
		
		// insert a character at some index
		StringBuilder sc1 = new StringBuilder ("hello");
		// inser char
		sc1.insert(0, 'b');
		System.out.println(sc1);
		
		// delete character at some index
		StringBuilder sc2 = new StringBuilder ("hello");
		// delete char
		sc2.delete(0, 1);
		System.out.println(sc2);
		
		
		// append a character 
		// append means to add something at the end
		StringBuilder sc3 = new StringBuilder ("hello");
		sc3.append("my");
		sc3.append("love");
		System.out.println(sc3);
	}

}
