package first.demo.utils;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateID {

    public static int randomInteger(int minValue, int maxValue) {
        int randomInteger = ThreadLocalRandom.current().nextInt(minValue, maxValue + 1);
        return randomInteger;
    }

    public static String uniqueID() {
        /** Based on AppSheet's UNIQUEID() function. */
        int randInt = randomInteger(0, 429496729);
        String id = Integer.toHexString(randInt);
        return id;
    }

    public static String uniqueUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static int registrationNumber(int digitsAmount) {
        String zerosString = "";
        String ninesString = "";

        for (int i = 0; i < digitsAmount; i++) {
            zerosString += "0";
            ninesString += "9";
        }

        int zerosInt = Integer.parseInt(zerosString);
        int ninesInt = Integer.parseInt(ninesString);

        int registration = randomInteger(zerosInt, ninesInt);
        return registration;
    }

}
