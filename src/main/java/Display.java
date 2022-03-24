package main.java;

import main.java.exception.InchException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Display {
    private String manufacture;
    private String types;
    private double inch;
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

    public Display() {

    }

    public Display(String manufacture, String types) {
        this.manufacture = manufacture;
        this.types = types;

    }

    public Display(String manufacture, String types, double inch) {
        this.manufacture = manufacture;
        this.types = types;
        this.inch = inch;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) throws InchException {
        if (inch <= 0) {
            throw new InchException("Inch is incorrect");

        }
        this.inch = inch;

    }

    @Override
    public String toString() {
        return ("\n" + "main.java.Display:" + "\n" + "Manufacture - " + getManufacture() + "\n" + "Types - " + getTypes() + "\n" + "Inch - " + getInch());
    }

    //Handle exception with try-catch
    public static void createdInch() {
        Display display = new Display();
        try {
            display.setInch(0);
            LOGGER.info("Inch is incorrect");
        } catch (InchException e) {
            System.err.println("Inch is incorrect");
            LOGGER.debug(e);
        }
    }

}
