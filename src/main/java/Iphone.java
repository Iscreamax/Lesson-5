package main.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Objects;

public class Iphone extends MobilePhone {
    private boolean waterProof;
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

    public Iphone(int model, String version, Memory memory, Battery battery, Display display, Cpu cpu, int price, boolean waterProof) {
        super(model, version, memory, battery, display, cpu, price);
        this.waterProof = waterProof;
    }

    public Iphone(int model, String version){
        super(model,version);
    }

    @Override
    public String toString() {
        return ("main.java.Iphone " + getModel() + "/" + getVersion() + "/" + getMemory().getCapacity() + "Gb/"
                + getBattery().getCapacity() + "mah/" + getDisplay().getInch() + "inh/" + getCpu().getFrequency() +
                "Ggz/price -" + getPrice() + "$" + " WaterProof - " + waterProof);
    }

    @Override
    public void turnOnMobile() {
        System.out.println("You've turned on your phone" + "\n" + "main.java.Iphone enabled");
    }

    @Override
    public void registration(Client client) {
        System.out.println("The user " + client.getFirstName() + " " + client.getSurname() + " is registered an account via main.java.Iphone");
    }

    @Override
    public void installingApplication() {
        System.out.println("Install application via App store");
    }

    @Override
    public void update() {
        System.out.println("iOs updated");
    }

    @Override
    public void sendMessage(Message message, Client firstClient, Client secondClient) {
        try {
            System.out.println("Dear " + secondClient.getFirstName() + secondClient.getSurname() + secondClient.getPatronymic() + ", " +
                    "It's " + firstClient.getFirstName() + firstClient.getSurname() + firstClient.getPatronymic() + ", " + message.getLetterField());
            if (message.getLetterField().isEmpty()) throw new IOException();
        } catch (Exception exception) {
            System.err.println("The message is empty");
            LOGGER.debug(exception);
            LOGGER.info("The message is empty");


        }
    }

    @Override
    public void makeVideo() {
        System.out.println("Shot a video in 4K");
    }

    @Override
    public void makePhoto() {
        System.out.println("The photo was taken on a 12 Mp, 26mm camera");
    }

    @Override
    public void internetConnection() {
        System.out.println("5G works here");
        ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Iphone that = (Iphone) obj;
        if (getDisplay() != that.getDisplay()) return false;
        if (getCpu() != that.getCpu()) return false;
        return Objects.equals(getBattery(), that.getBattery());
    }

    @Override
    public int hashCode() {
        int result = getModel() == 0 ? 0 : Objects.hashCode(getModel());
        result = 31 * result * getPrice();
        result = 31 * result * getBattery().hashCode();
        result = 31 * result * getCpu().hashCode();
        result = 31 * result * getDisplay().hashCode();
        result = 31 * result * getVersion().hashCode();
        result = 31 * result * getMemory().hashCode();
        return result;
    }


}