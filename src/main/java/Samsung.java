package main.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Samsung extends MobilePhone {

    public Samsung(int model, String version, Memory memory, Battery battery, Display display, Cpu cpu, int price) {
        super(model, version, memory, battery, display, cpu, price);

    }

    public Samsung(int model, String version) {
        super(model, version);
    }

    public String toString() {
        return ("main.java.Samsung " + getModel() + "/" + getVersion() + "/" + getMemory().getCapacity() + "Gb/"
                + getBattery().getCapacity() + "mah/" + getDisplay().getInch() + "inh/" + getCpu().getFrequency() +
                "Ggz/price -" + getPrice() + "$");
    }

    @Override
    public void turnOnMobile() {
        System.out.println("You've turned on your phone" + "\n" + "main.java.Samsung enabled");
    }

    @Override
    public void registration(Client client) {
        System.out.println("The user " + client.getFirstName() + " " + client.getSurname() + " is registered an account via main.java.Samsung");
    }

    @Override
    public void installingApplication() {
        System.out.println("Install application via Play Market");
    }

    @Override
    public void update() {
        System.out.println("Android updated");
    }

    @Override
    public void sendMessage(Message message, Client firstClient, Client secondClient) {
        System.out.println("Dear " + secondClient.getFirstName() + secondClient.getSurname() + secondClient.getPatronymic() + ", " +
                "It's " + firstClient.getFirstName() + firstClient.getSurname() + firstClient.getPatronymic() + ", " + message.getLetterField());
    }

    @Override
    public void makeVideo() {
        System.out.println("Shot a video in FullHD");
    }

    @Override
    public void makePhoto() {
        System.out.println("The photo was taken on a 15 Mp, 22mm camera");
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
        Samsung that = (Samsung) obj;
        if (getModel() != that.getModel()) return false;
        if (getVersion() != that.getVersion()) return false;
        if (getDisplay() != that.getDisplay()) return false;
        if (getCpu() != that.getCpu()) return false;
        if (getBattery() != getBattery()) return false;
        if (getPrice() != getPrice()) return false;
        return Objects.equals(getImei(), that.getImei());
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
