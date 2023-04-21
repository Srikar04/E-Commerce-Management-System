public class Electronics extends Product {
    private int maxVoltage;
    private int Power;

    public Electronics(int id, String name, double price, int quantity, int maxVoltage, int storageCapacity,String section) {
        super(id, name, price, quantity,section);
        this.maxVoltage = maxVoltage;
        this.Power = storageCapacity;
    }

    public int getMaxVoltage() {
        return maxVoltage;
    }

    public void setMaxVoltage(int maxVoltage) {
        this.maxVoltage = maxVoltage;
    }

    public int getStorageCapacity() {
        return Power;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.Power = storageCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Max Voltage = " + maxVoltage + "V \nMax Power = " + Power+"W\n";
    }
}

