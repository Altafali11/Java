package TestLambda;
// Functional interface needed
interface A{
	 void Method(); 
		 
	 }
interface Calculator{
	int multiply(int a, int b);
}
//class B implements A{
//	public void Method() {
//		System.out.println("Hii");
//	}
//}
public class Test_Lambda {
	public static void main(String[] args) {
		// anonymous class lead to lengthier code before lambda
		/*A a= new  A(){
			public void method() {
				System.out.println("welcome to java");
			}
		}
		*/
		// using lambda
       A a =()->System.out.println("welcome to java");
       a.Method();
       
       
       
      Calculator cl =(x,y)-> x*y;
      System.out.println(cl.multiply(12, 12));
	}

}

