public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(int id, String name, double price, int quantity, String size,String material,String section) {
        super(id, name, price, quantity,section);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + "Size = " + size + "\nMaterial = " + material + ".\n";
    }
}

