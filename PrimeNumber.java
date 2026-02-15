import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // 0 and 1 are not prime
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop to check divisibility
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // stop loop if divisible
                }
            }
        }

        if (isPrime) {
            System.out.println("It is a Prime number");
        } else {
            System.out.println("It is NOT a Prime number");
        }

        sc.close();
    }
}
