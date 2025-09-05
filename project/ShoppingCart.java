import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        String[] items = {"T-Shirt", "Jeans", "Shoes"};
        double[] prices = {15.99, 29.99, 49.99};

        System.out.println("Available Items:");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %-10s $%.2f%n", (i + 1), items[i], prices[i]);
        }

        // Input name
        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();

        // Input number of items
        System.out.print("Enter the number of unique items you want to purchase: ");
        int n = sc.nextInt();

        int[] itemCodes = new int[n];
        int[] quantities = new int[n];

        // Input item selections with validation
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter item number " + (i + 1) + ": ");
            itemCodes[i] = sc.nextInt();

            
            if (itemCodes[i] < 1 || itemCodes[i] > items.length) {
                System.out.println(" Invalid item code! Please enter between 1 and " + items.length);
                i--; 
                continue;
            }

            System.out.print("Enter the quantity: ");
            quantities[i] = sc.nextInt();

            if (quantities[i] <= 0) {
                System.out.println(" Quantity must be greater than 0.");
                i--; // repeat this iteration
            }
        }
    }
}

