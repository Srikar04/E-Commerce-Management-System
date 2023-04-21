public class Food extends Product {
    private String expirationDate;
    private int calories;

    public Food(int id, String name, double price, int quantity, String section, String expirationDate, int calories) {
        super(id, name, price, quantity, section);
        this.expirationDate = expirationDate;
        this.calories = calories;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getAmount() {
        return calories;
    }

    public void setAmount(int amount) {
        this.calories = amount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Expiration Date: " + expirationDate + "\n" +
                "Amount of Calories: " + calories + "\n";
    }
}

