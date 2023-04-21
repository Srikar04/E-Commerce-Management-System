public class Product implements Discountable{
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String section;
    private double discountedPrice;
    private double discountPercentage;


    public Product(int id, String name, double price, int quantity,String section) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.section = section;
        discountedPrice = price;// No discount unless administrator changes the prices
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
            return "Product Id: " + id +
                    "\nSection: " + section +
                    "\nName: " + name +
                    "\nPrice: " + price +
                    "\nQuantity: " + quantity +
                    "\nDiscount Percentage: " + discountPercentage + "\n";
    }

    @Override
    public void setDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
        discountedPrice = price - (price * (discountPercentage / 100));
    }
    
    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

}
