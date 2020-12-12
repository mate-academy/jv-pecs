package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weightBucket;

    public int getWeightBucket() {
        return weightBucket;
    }

    public Bulldozer(int weightBucket) {
        this.weightBucket = weightBucket;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<? super Machine> get() {
        List<Machine> returnValue = new ArrayList<>();
        returnValue.add(new Bulldozer(500));
        returnValue.add(new Bulldozer(200));
        returnValue.add(new Bulldozer());
        return returnValue;
    }
}
