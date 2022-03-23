package main.java;

public class Memory {
    private String manufacture;
    private int capacity;

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    public Memory() {

    }

    public Memory(String manufacture, int capacity) {
        this.manufacture = manufacture;
        this.capacity = capacity;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return ("\n" + "main.java.Memory: " + "\n" + "Manufacture - " + getManufacture() + "\n" + "Capacity - " + getCapacity() + " Gb");

    }


}
