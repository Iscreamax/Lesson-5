package main.java;

import main.java.exception.PriceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Discount {
    int discountPrice;
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

    //Handle exception with try-catch and signature
    public void getDiscount(String str) throws PriceException {
        Iphone iphone = new Iphone(12, "Pro Max");
        try {
            int price = Integer.parseInt(str);
            iphone.setPrice(0);
            discountPrice = iphone.getPrice() * 07;
        } catch (NumberFormatException e) {
            try {
                throw new PriceException("String is incorrect!", e);

            } catch (PriceException ex) {
                System.err.println("The price is incorrect");
                LOGGER.debug(ex);

            }
            LOGGER.debug(e);
        }

    }
}
