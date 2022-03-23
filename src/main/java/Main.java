package main.java;

import main.java.exception.PriceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);
    Memory memory = new Memory("Profit", 256);
    Battery batteryIphone = new Battery("Apple", 3300);
    Display displayIphone = new Display("Samsung", "Oled", 6.1);
    Cpu cpuIphone = new Cpu("Bionic", 2.7);
    Battery batterySamsung = new Battery("Samsung", 4300);
    Display displaySamsung = new Display("Samsung", "Oled", 6.4);
    Cpu cpuSamsung = new Cpu("Exynos", 2.9);
    Client firstClient = new Client("Jack ", "Vorobey ", "Aleksandrovich", 18);
    Client secondClient = new Client("Valet ", "Kozirny ", "Albertovich", 25);
    Client thirdClient = new Client("Vitya", "Samuel", "Viktorovich", 13);
    Message message = new Message("I'm going to be late for work, I'm sorry!");
    Message emptyMessage = new Message("");
    Iphone iphone = new Iphone(13, "Pro", memory, batteryIphone, displayIphone, cpuIphone, 1350, true);
    Samsung samsung = new Samsung(21, "S", memory, batterySamsung, displaySamsung, cpuSamsung, 1270);
    Iphone iphoneMini = new Iphone(12, "Mini", memory, batteryIphone, displayIphone, cpuIphone, 1200, false);
    Landline philips = new Landline("Philips", 2230, "One", 60);
    Landline lg = new Landline("LG", 007, "Home", 110);


    public void previousLesson() {
        System.out.println("Previous Lesson" + "\n");
        System.out.println(iphone.toString());
        System.out.println(memory.toString());
        System.out.println(batteryIphone.toString());
        System.out.println(displayIphone.toString());
        System.out.println(cpuIphone.toString());
        System.out.println("");
        System.out.println("Sending a message:");
        iphone.sendMessage(message, firstClient, secondClient);
        System.out.println("Making a call:");
        iphone.makeCall(firstClient, secondClient);
        System.out.println("We change names and make a call:");
        firstClient.setFirstName("Max ");
        secondClient.setFirstName("Oleg ");
        iphone.makeCall(firstClient, secondClient);
    }

    public void thirdLesson() {
        MobileStore appleStore = new MobileStore(iphone);
        MobileStore newSamsung = new MobileStore(samsung);
        //buy new main.java.Iphone
        //turn on main.java.Iphone
        //establish an iPhone connection with a satellite
        //registering a user
        //setting up an Iphone Internet connection
        //registering an account
        //installing the app in the App store
        //updating the main.java.Iphone
        //taking photos on main.java.Iphone
        //shooting a video on an main.java.Iphone
        //a call to the 911 service from an main.java.Iphone

        appleStore.buying(iphone, firstClient);
        iphone.turnOnMobile();
        iphone.satelliteConnection();
        iphone.internetConnection();
        iphone.registration(firstClient);
        iphone.update();
        iphone.installingApplication();
        iphone.makePhoto();
        iphone.makeVideo();
        iphone.alarmCall();
        System.out.println("");

        //buy new main.java.Samsung
        //turn on main.java.Samsung
        //establish a Samsung connection with a satellite
        //registering a user
        //setting up a main.java.Samsung Internet connection
        //registering an account
        //installing the app in the Play Market
        //updating the main.java.Samsung
        //taking photos on main.java.Samsung
        //shooting a video on a main.java.Samsung
        //a call to the 911 service from a main.java.Samsung


        newSamsung.buying(samsung, secondClient);
        samsung.turnOnMobile();
        samsung.satelliteConnection();
        samsung.internetConnection();
        samsung.registration(secondClient);
        samsung.installingApplication();
        samsung.update();
        samsung.makePhoto();
        samsung.makeVideo();
        samsung.alarmCall();
        MobileStore.purchased();
    }

    public void fourthLesson() {
        System.out.println("Equals main.java.Landline: " + philips.equals(lg));
        System.out.println("Equals main.java.Iphone: " + iphone.equals(iphoneMini));
        System.out.println("Equals main.java.Samsung: " + samsung.equals(iphoneMini));
        System.out.println("main.java.Samsung hashCode: " + samsung.hashCode());
        System.out.println("main.java.Iphone hashCode: " + iphone.hashCode());
        System.out.println("IphoneMini hashCode: " + iphoneMini.hashCode());
        System.out.println("Philips hashCode: " + philips.hashCode());
        System.out.println("LG hashCode: " + lg.hashCode());
    }

    public void fifthLesson() {
        MobileStore iStore = new MobileStore(iphone);
        //created class LoggerRunner as in the lesson
        LoggerRunner.getLog();
        //attempt to send an empty message
        iphone.sendMessage(emptyMessage, firstClient, secondClient);
        //attempt to purchase a phone by a minor
        iStore.buying(iphoneMini, thirdClient);
        //attempt to set inch = 0;
        Display.createdInch();
        //attempt to enter incorrect data
        //attempt to set price = 0;
        Discount discount = new Discount();

        try {
            discount.getDiscount("g");
        } catch (PriceException e) {
            LOGGER.debug(e);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.previousLesson();
        main.thirdLesson();
        main.fourthLesson();
        main.fifthLesson();


    }
}
