public class Sample{
	public static void main(String args[]){
		System.out.println("Hello World");
		System.out.println("Made changes");
		System.out.println("Evening update");

Hello hello = new Hello();
        String result = hello.greet();

        if ("Hello from Jenkins!".equals(result)) {
            System.out.println("TEST PASSED ✅");
        } else {
            System.out.println("TEST FAILED ❌, got: " + result);
            System.exit(1); // mark pipeline as failed
        }
	}
}