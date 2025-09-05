 import java.util.Scanner;
 public class calcultor {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

        while (continueCalc) {
            
            System.out.print("\nEnter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result of addition: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result of subtraction: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result of multiplication: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.printf("Result of division: %.2f%n", (num1 / num2));
                    } else {
                        System.out.println(" Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return; 
                default:
                    System.out.println(" Invalid choice! Please try again.");
            }

            
            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String ans = sc.next();
            if (!ans.equalsIgnoreCase("yes")) {
                continueCalc = false;
                System.out.println("\nExiting program...");
            }
        }

        sc.close();
    }
}


