import java.util.Scanner;

public class Administrator {
    private Inventory inventory;
    private int counter = 6;//initially five products are there int the shop

    public Administrator(Inventory inventory){ 
        this.inventory = inventory;
    }

    public void run(){ 
        Scanner scanner = new Scanner(System.in);
        String name;
        double price;
        int quantity;
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Display all products");
            System.out.println("4. Restock Items");
            System.out.println("5. Change Prices");
            System.out.println("6. Apply Discounts");
            System.out.println("7. Exit to Main Menu");

            System.out.print("\nYour Option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a product
                    System.out.println("Which type of product do you want to add?");
                    System.out.println("1. Clothing");
                    System.out.println("2. Book");
                    System.out.println("3. Electronics");
                    System.out.println("4. Food");
                    System.out.println("5. Miscellaneous");

                    int choice2 = scanner.nextInt();

                    switch (choice2) {
                        case 1:
                            System.out.println("Enter the product name:");
                            name = scanner.next();
                            
                            System.out.println("Enter the product price:");
                            price = scanner.nextDouble();
                            
                            System.out.println("Enter the product quantity:");
                            quantity = scanner.nextInt();
                            
                            System.out.println("Enter the product size(Example : XL):");
                            String size = scanner.next();
                            
                            System.out.println("Enter the product material(Example : Leather):");
                            String material = scanner.next();
                            
                            
                            Clothing newClothing = new Clothing(counter++, name, price, quantity, size, material, "Clothing");
                            inventory.addProduct(newClothing);
                            
                            System.out.println("This product will be given an ID "+ (counter-1));
                            System.out.println("Clothing product added successfully.");
                            break;
                        case 2:
                            System.out.println("Enter the book name:");
                            name = scanner.next();

                            System.out.println("Enter the book price:");
                            price = scanner.nextDouble();

                            System.out.println("Enter the book quantity:");
                            quantity = scanner.nextInt();

                            System.out.println("Enter the book author:");
                            String bookAuthor = scanner.next();

                            System.out.println("Enter the book pages:");
                            int bookPages = scanner.nextInt();

                            Book newBook = new Book(counter++, name, price , quantity, bookAuthor, bookPages, "Books");
                            inventory.addProduct(newBook);

                            System.out.println("This product will be given an ID "+ (counter-1));
                            System.out.println("Book added successfully.");
                            break;
                        case 3:
                            System.out.println("Enter the product name:");
                            name = scanner.next();
                            
                            System.out.println("Enter the product price:");
                            price = scanner.nextDouble();
                            
                            System.out.println("Enter the product quantity:");
                            quantity = scanner.nextInt();

                            System.out.println("Enter the maximum voltage:");
                            int maxVoltage = scanner.nextInt();

                            System.out.println("Enter the storage capacity:");
                            int storageCapacity = scanner.nextInt();
                            
                            Electronics newElectronics = new Electronics(counter++, name, price, quantity, maxVoltage, storageCapacity, "Electronics");
                            inventory.addProduct(newElectronics);

                            System.out.println("This product will be given an ID "+ (counter-1));
                            System.out.println("Electronics product added successfully.");
                            break;
                        case 4:
                            System.out.println("Enter the product name:");
                            name = scanner.next();

                            System.out.println("Enter the product price:");
                            price = scanner.nextDouble();

                            System.out.println("Enter the product quantity:");
                            quantity = scanner.nextInt();

                            System.out.println("Enter the expiration date (yyyy-MM-dd):");
                            String expirationDate = scanner.next();

                            System.out.println("Enter the amount of Calories in this product:");
                            int amount = scanner.nextInt();

                            Food newFood = new Food(counter++, name, price, quantity,"Food", expirationDate, amount);
                            inventory.addProduct(newFood);

                            System.out.println("This product will be given an ID "+ (counter-1));
                            System.out.println("Food product added successfully.");

                        case 5:
                            System.out.println("Enter the product name:");
                            name = scanner.next();

                            System.out.println("Enter the product price:");
                            price = scanner.nextDouble();

                            System.out.println("Enter the product quantity:");
                            quantity = scanner.nextInt();


                            Product newProduct = new Product(counter++, name, price, quantity, "Miscellaneous");
                            inventory.addProduct(newProduct);

                            System.out.println("This product will be given an ID "+ (counter-1));
                            System.out.println("Product added successfully.");
                            break;

                            default:
                            System.out.println("Invalid choice. Please choose again.");
                    }
                    break;
                case 2:
                    // Remove a product
                    System.out.println("Enter the product ID:");
                    int removeId = scanner.nextInt();
                    Product removeProduct = inventory.getProduct(removeId);

                    if (removeProduct == null) {
                        System.out.println("Product not found.");
                    } else {
                        inventory.removeProduct(removeProduct);
                        System.out.println("Product removed successfully.");
                    }
                    break;
                case 3:
                    // Display all products
                    if (inventory.getProducts().size() == 0) {
                        System.out.println("No products in inventory. Please contact administrator.");
                    } else {
                        System.out.println("All products:");
                        for (Product product : inventory.getProducts()) {
                            System.out.println(product);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter the product ID:");
                    int productId = scanner.nextInt();
                    Product product = inventory.getProduct(productId);                    
                    if (product != null) {
                        System.out.println("Enter the quantity to add:");
                        int quantityToAdd = scanner.nextInt();
                        inventory.addProduct(product, quantityToAdd);
                    }else {
                         System.out.println("Product not found in inventory.");
                    }
                    break;

                case 5:
                    System.out.println("Enter the product ID:");
                    productId = scanner.nextInt();
                    
                    System.out.println("Enter the new price:");
                    double newPrice = scanner.nextDouble();
                    Product productToUpdate = inventory.getProduct(productId);
                    if(productToUpdate != null) {
                        productToUpdate.setPrice(newPrice);
                        System.out.println("Price updated successfully!");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 6:
                    System.out.println("Enter the product ID: ");
                    int productId2 = scanner.nextInt();
                    Product product6 = inventory.getProduct(productId2);
                    if (product6 != null) {
                        System.out.println("Enter the discount percentage: ");
                        double discountPercentage = scanner.nextDouble();
                        product6.setDiscount(discountPercentage);
                        System.out.println("Discounted price set successfully.");
                    }else {
                        System.out.println("Product not found in inventory.");
                    }
                    break;
                
                case 7:
                    // Exit the program
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}


