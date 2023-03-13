import java.util.Scanner;

public class newline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer, a double, and a String from the console
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character left by nextDouble()
        String s = scanner.nextLine();

        // Print the String, double, and integer variables
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scanner.close();
    }
}
