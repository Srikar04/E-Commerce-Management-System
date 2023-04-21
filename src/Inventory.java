import java.util.ArrayList;
import java.util.List;

public class Inventory {
    //Food,Electronics and many child classes of Product stroed in this array.
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayAllProducts() {
        System.out.println("All products in inventory:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    //dynamically changing the products available in inventory
    public void addProduct(Product product, int quantity) {
        if (product != null && quantity > 0) {
            int index = this.products.indexOf(product);
            Product existingProduct = this.products.get(index);
            int existingQuantity = existingProduct.getQuantity();
            existingProduct.setQuantity(existingQuantity + quantity);
            System.out.println(quantity + " units of " + product.getName() + " added to inventory.");
        } else {
            System.out.println("Invalid product or quantity. Please try again.");
        }
    }
    


    //dynamically changing the products avaible in inventory
    public boolean removeProduct(Product product, int quantity) {
        if (this.products.contains(product)) {
            int index = this.products.indexOf(product);
            Product existingProduct = this.products.get(index);
            int existingQuantity = existingProduct.getQuantity();
            if (existingQuantity >= quantity) {
                existingProduct.setQuantity(existingQuantity - quantity);
                if (existingQuantity == quantity) {
                    this.products.remove(existingProduct);
                }
                return true;
            } else {
                System.out.println("Quantity entered is greater than available quantity");
                return false;
            }
        } else {
            System.out.println("Product not found in inventory.");
            return false;
        }
    }
    

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(int productId) {
        for (Product product : this.products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null; // If product not found
    }
}

