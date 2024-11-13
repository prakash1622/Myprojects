package testcase1;
import java.util.Scanner;

public class Testcase1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        
		for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        for (int i = 2; i < n; i++) {
            System.out.print(i); 
           
            for (int j = 1; j <= 2 * (n - 2) - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(n + 1 - i); 
        }

      
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }

}
	


