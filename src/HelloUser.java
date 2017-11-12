
public class HelloUser {
	
	private String userName;
	
	public HelloUser(String s_userName)
	{
		userName = s_userName;
	}
	
	public void greetUser() {
		System.out.println("Hello "+userName+" !");
	}
	
}
