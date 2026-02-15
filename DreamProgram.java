import java.util.Scanner;

public class DreamProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Student Result Program");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        // Checking grade
        if (marks >= 90) {
            System.out.println(name + " got Grade A");
        } else if (marks >= 70) {
            System.out.println(name + " got Grade B");
        } else if (marks >= 50) {
            System.out.println(name + " got Grade C");
        } else {
            System.out.println(name + " Failed");
        }

        sc.close();
    }
}
