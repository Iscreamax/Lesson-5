package main.java;

import main.java.exception.PriceException;

public abstract class Phone {

    private int model;
    private String version;
    private int price;


    public Phone(int model, String version) {
        this.model = model;
        this.version = version;
    }

    public Phone(int price) {
        this.price = price;
    }

    public Phone(int model, String version, int price) {
        this.model = model;
        this.version = version;
        this.price = price;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws PriceException {
        if (price <= 0) {
            throw new PriceException("Price is incorrect!");

        }

        this.price = price;
    }

    public void alarmCall() {
        System.out.println("Hello this is 911");
    }


    public void makeCall(Client firstClient, Client secondClient) {

        System.out.println(firstClient.getFirstName() + " called " + secondClient.getFirstName() + " on the analog line.");


    }


}
