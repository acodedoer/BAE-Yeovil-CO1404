import java.util.Scanner;

public class Week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String firstName;
		String lastName;
		System.out.print("Enter your first name: ");
		firstName = sc.nextLine();
		System.out.print("Enter your last name: ");
		lastName = sc.nextLine();
		System.out.println("You are "+lastName.toUpperCase()+", "+firstName.toUpperCase());
	}

}
