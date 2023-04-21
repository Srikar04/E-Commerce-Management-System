import java.util.HashMap;
import java.util.Map;

public class Cart {
    private HashMap<Product, Integer> productsMap;

    public Cart(){
        productsMap = new HashMap<>();
    }

    public void addProduct(int quantity, Product product) {
        if(productsMap.containsKey(product)){
            productsMap.put(product, productsMap.get(product) + quantity);
        }else{
            productsMap.put(product, quantity);
        }
    }

    public boolean removeProduct(int quantity, Product product) {
        if(productsMap.containsKey(product)){
            int currentQuantity = productsMap.get(product);
            if(currentQuantity >= quantity){
                productsMap.put(product, currentQuantity - quantity);
                System.out.println(quantity + " " + product.getName() + " removed from cart.");
                return true;
            }else{
                System.out.println("Insufficient quantity of " + product.getName() + " in cart.");
                return false;
            }
        } else {
            System.out.println(product.getName() + " not found in cart.");
            return false;
        }
    }
    

    public void displayCart() {
        if(productsMap.isEmpty()) {
            System.out.println("Cart is Empty");
            return ;
        }
        System.out.println("Products in Cart:");
        for (Map.Entry<Product, Integer> entry : productsMap.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Product ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Quantity in Cart: " + quantity);
            System.out.println("Original Price: Rs " + product.getPrice());
            System.out.println("Price After Applying Discount: Rs " + product.getDiscountedPrice()+"\n");
        }
        System.out.println("Total cost: " + getTotalPrice());
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Product, Integer> entry : productsMap.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            totalPrice += product.getDiscountedPrice()*quantity;
        }
        return totalPrice;
    }

    public boolean checkout(String customerName, String customerAddress, String customerCreditCardNumber) {        
        if(customerCreditCardNumber == null || customerAddress == null || customerName == null) 
            return false;
        // Calculate the total price
        double totalPrice = getTotalPrice();
    
        // Display the order details
        System.out.println("Order details:");
        System.out.println("Customer name: " + customerName);
        System.out.println("Customer address: " + customerAddress);
        System.out.println("Customer credit card number: " + customerCreditCardNumber);
        System.out.println("Total price: " + totalPrice);

        // Clear the cart after its usage is completed
        clear();
    
        // Display a confirmation message
        System.out.println("Thank you for your order and Continue Shopping with us!");
        return true;
    }
    
    
    //Method to clear the cart
    public void clear() {
        this.productsMap.clear();
    }
}

