import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a single inventory object
        Inventory inventory = new Inventory();

        // Add some initial products to the inventory
        inventory.addProduct(new Clothing(1, "T-Shirt", 20.0, 10,"XXL","Denim","Clothing"));
        inventory.addProduct(new Book(2, "Introduction to C", 25, 50, "Ritchie",400, "Books"));
        inventory.addProduct(new Product(3, "Sneakers", 80.0, 3,"Miscellaneous"));
        inventory.addProduct(new Clothing(4, "Pants", 50.0, 3, "XL", "Leather","Clothing"));
        inventory.addProduct(new Electronics(5, "refrigerator", 100.0, 4, 220, 300, "Electronics"));

        System.out.println("-------------------------------------");
        System.out.println("║                                    ║");
        System.out.println("║         Welcome to our Store!      ║");
        System.out.println("║          Let's go Shopping!        ║");
        System.out.println("║                                    ║");
        System.out.println("--------------------------------------");

        
        // Prompt the user to choose a mode
        while (true) {
            System.out.println("Choose a mode:");
            System.out.println("1. Customer");
            System.out.println("2. Administrator");
            System.out.println("3. Exit");

            System.out.print("Your Option: ");
            int mode = scanner.nextInt();
            scanner.nextLine();

            if (mode == 1) {
                // Customer mode
                Customer customer = new Customer(inventory);
                customer.run();
                System.out.println("Thank you for Shopping with us!!");
            } else if (mode == 2) {
                // Administrator mode
                System.out.println("Enter the Password for Administrator");
                String password = scanner.nextLine();
                if(password.equals("123456")){
                    Administrator administrator = new Administrator(inventory);
                    administrator.run();
                } else {
                    System.out.println("Password is incorrect!");
                }            
            } else if(mode == 3){
                return;
            }
            else{
                System.out.println("Invalid mode.");
            }
        }
    }
}
