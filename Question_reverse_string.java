package strings;

public class Question_reverse_string {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("HELLO");
		System.out.println(sb);
		
		for(int i=0; i<sb.length()/2; i++) {
			int H= i;
			int O = sb.length()-i-1;
			
			char frontchar = sb.charAt(H);
			char backchar  = sb.charAt(O);
			
			sb.setCharAt(H,backchar);
			sb.setCharAt(O,frontchar);
			
		}
		System.out.println(sb);

	}

}
