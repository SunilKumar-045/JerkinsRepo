public class Sample{
public static void testmethod(int a,int b){
	if(a+b==10){
		System.out.println("test success");
	}
	else{
		System.out.println("test fails");
	}
}
	public static void main(String args[]){
		System.out.println("Hello World");
		System.out.println("Made changes");
		System.out.println("Evening update");

		
		Sample.testmethod(5,10);
	}
}