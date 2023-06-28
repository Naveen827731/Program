import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();
        scanner.close();
        
        if (a < 1) {
            System.out.println("Error: 'a' must be a positive integer.");
            return;
        }
        
        for (int i = 1; i <= a; i++) {
            int num = 2 * i - 1;
            if (num <= a) {
                System.out.print(num + " ");
            } else {
                break;
            }
        }
    }
}
