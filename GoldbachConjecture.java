
import java.util.Scanner;

public class GoldbachConjecture {

    // Function to check prime
    static boolean isPrime(int num) {

        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an even number greater than 2: ");
        int num = sc.nextInt();

        if (num <= 2 || num % 2 != 0) {
            System.out.println("Invalid input. Enter even number > 2");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (isPrime(i) && isPrime(num - i)) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                }
            }
        }

        sc.close();
    }
}
