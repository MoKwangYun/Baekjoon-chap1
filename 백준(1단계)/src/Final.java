import java.util.Scanner;

public class Final {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int b1 = b % 10;
		
		int b3 = b / 100;
		int b2 = (b - (b3 * 100) - b1) / 10;
		System.out.println(a * b1);
		System.out.println(a * b2);
		System.out.println(a * b3);
		System.out.println(a * b);
	}
}
