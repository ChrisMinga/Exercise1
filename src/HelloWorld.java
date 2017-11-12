import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello ASE2017 - How are you now? :)");
		System.out.println("\nPlease enter your name: ");
		String name = sc.next();
				
		HelloUser h = new HelloUser(name);
		
		h.greetUser();
		
		sc.close();
	}

}
