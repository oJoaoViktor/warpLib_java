package UTILS;

import java.util.Random;

public class utils {

    public static int generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(999999);
        return randomNumber;
    }
}
