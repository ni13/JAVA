package accessModifer;

public class Getpublic {    //Base class
	
	String password = "123";  //intialized a variable
	
	private void showPassword() {
		System.out.println("Password : " +password);
	}

	public static void main(String[] args) {  //main class
		
		Getpublic user = new Getpublic();
		user.showPassword();
		
	}

}
