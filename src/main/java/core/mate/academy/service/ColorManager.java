package core.mate.academy.service;

import java.util.Random;

public class ColorManager {
    public String getRandomColor() {
        Random random = new Random();
        int randomInt = random.nextInt(4);
        switch (randomInt) {
            case 1:
                return "black";
            case 2:
                return "white";
            default:
                return "silver";
        }
    }
}
