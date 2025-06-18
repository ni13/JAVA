package NewJava;
import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// Concatenation - User Register System
		Scanner obj = new Scanner(System.in);  // Get dynamic input from user

        System.out.println("Enter the First name: ");
        String firstName = obj.nextLine();

        System.out.println("Enter the Second name: ");
        String secondName = obj.nextLine();

        System.out.println("Enter the email: ");
        String email = obj.nextLine();

        String welcome = firstName + " " + secondName + " - Your email is: " + email;
        String welcome2 = firstName.concat(" ").concat(secondName).concat(" - Your email is: ").concat(email);

        System.out.println(welcome);
        System.out.println(welcome2);
        
        obj.close();  // Always good to close the Scanner
	}
}
