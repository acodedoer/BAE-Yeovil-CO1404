import java.util.Scanner;

public class SimpleOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int userHeight;
		int neighbourHeight1;
		int neighbourHeight2;
		double averageHeight;
		
		System.out.print("Enter your height: ");
		userHeight = sc.nextInt();
		
		System.out.print("Enter your first neighbours height: ");
		neighbourHeight1 = sc.nextInt();
		
		System.out.print("Enter your second neighbours height: ");
		neighbourHeight2 = sc.nextInt();

		averageHeight = ((userHeight + neighbourHeight1 + neighbourHeight2)/3) * 2.54;
		
//		System.out.print("Average Height: "+averageHeight);
		System.out.format("%.1f", averageHeight);
	}

}
