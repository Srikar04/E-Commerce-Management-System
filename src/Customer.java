import java.util.Scanner;

class Customer {
    private Cart cart;
    private Inventory inventory;

    public Customer(Inventory inventory) {
        cart = new Cart();
        this.inventory = inventory;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Display all products");
            System.out.println("2. Add product to cart");
            System.out.println("3. Remove product from cart");
            System.out.println("4. View cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit To Main Menu\n");

            System.out.print("\nYour Option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display all products
                    inventory.displayAllProducts();
                    break;
                case 2:
                    // Add product to cart
                    System.out.println("Enter the product ID:");
                    int productId = scanner.nextInt();

                    System.out.println("Enter the quantity:");
                    int quantityToAdd = scanner.nextInt();

                    Product productToAdd = inventory.getProduct(productId);
                    if (productToAdd != null) {
                        if(inventory.removeProduct(productToAdd, quantityToAdd)){
                            System.out.println(quantityToAdd + " " + productToAdd.getName() + "(s) added to cart.");
                            cart.addProduct(quantityToAdd,productToAdd);
                        }
                    } else {
                        System.out.println("Product not found. Please try again.");
                    }
                    break;
                case 3:
                    // Remove product from cart
                    System.out.println("Enter the product ID:");
                    int productToRemoveId = scanner.nextInt();

                    Product productToRemove = inventory.getProduct(productToRemoveId);
                    if (productToRemove != null) {
                        System.out.println("Enter the quantity to remove:");
                        int quantityToRemove = scanner.nextInt();
                        if(cart.removeProduct(quantityToRemove,productToRemove))
                            inventory.addProduct(productToRemove,quantityToRemove);
                    }else{
                        System.out.println("Product not found in cart. Please try again.");
                    }

                    break;
                case 4:
                    // View cart
                    cart.displayCart();
                    break;
                case 5:
                    // Checkout
                    scanner.nextLine();
                    double totalPrice = cart.getTotalPrice();
                    System.out.println("Total price: $" + totalPrice);

                    System.out.println("Enter your name:");
                    String customerName = scanner.nextLine();

                    System.out.println("Enter your address:");
                    String customerAddress = scanner.nextLine();

                    System.out.println("Enter your credit card number:");
                    String customerCreditCardNumber = scanner.nextLine();

                    if (cart.checkout(customerName, customerAddress, customerCreditCardNumber)) {
                        System.out.println("Order placed successfully!");
                    } else {
                        System.out.println("Error processing order. Please try again.");
                    }
                    break;
                case 6:
                    // Exit
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
