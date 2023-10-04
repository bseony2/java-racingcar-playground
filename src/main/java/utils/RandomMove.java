package utils;

import java.util.Random;

public class RandomMove implements MovingStrategy{

    private static final int MIN_DISTANCE = 4;
    @Override
    public boolean movable() {
        return getRandomNum() >= MIN_DISTANCE;
    }


    private int getRandomNum() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
