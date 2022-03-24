package main.java;

import main.java.exception.MemoryException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Memory {
    private String manufacture;
    private int capacity;
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

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

    public void setCapacity(int capacity) throws MemoryException {
        if (capacity % 64 != 0 || capacity <= 0) {
            throw new MemoryException("The memory is incorrect");
        }
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return ("\n" + "main.java.Memory: " + "\n" + "Manufacture - " + getManufacture() + "\n" + "Capacity - " + getCapacity() + " Gb");

    }

    public static void createdMemory() {
        Memory memory = new Memory();
        try {
            memory.setCapacity(63);
        } catch (MemoryException e) {
            System.err.println("The memory is incorrect");
            LOGGER.debug(e);
        }
    }


}
