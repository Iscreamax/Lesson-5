package main.java;

import main.java.exception.BuyAgeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public final class MobileStore {
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);
    public final String imei;
    public static int purchasedMobile = 0;
    public static final String WORKING_TIME = "Yes";


    static {
        System.out.print("Does the Mobile Store open?(Yes/No) ");
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.next().equals(WORKING_TIME)) {
                System.out.println("You are welcome!");

            } else {
                System.out.println("The Mobile Store is closed.Come back later!");
                Runtime.getRuntime().exit(0);
            }

        }
    }

    public String createImei() {
        String result = "";
        for (int i = 0; i < 15; i++) {
            String j;
            j = Integer.toString((int) (Math.random() * 10));
            result = result + j;
        }
        return result;
    }

    //Handle exception with try-catch
    public void buying(MobilePhone mobilePhone, Client client) {
        try {
            if (client.getAge() > 18) {
                System.out.println(client.getFirstName() + " " + client.getSurname() + ", you've purchased the phone - " + mobilePhone.toString());
                System.out.println("The IMEI of this phone is - " + imei);
            } else throw new BuyAgeException("You're too younger to buy!");
        } catch (BuyAgeException e) {
            LOGGER.debug(e);
        }
    }

    public static void purchased() {
        System.out.println("\n" + "Number of phones purchased today: " + purchasedMobile);
    }

    public MobileStore(MobilePhone mobilePhone) {
        LOGGER.info("Created IMEI");
        imei = createImei();
        mobilePhone.setImei(imei);
        purchasedMobile++;
    }


}

