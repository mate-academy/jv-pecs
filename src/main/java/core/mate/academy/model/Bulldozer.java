package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Bulldozer extends Machine {
    private int bucketVolume;
    private List<Bulldozer> listOfBulls = new ArrayList<>();

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bucketVolume) {
        super(name , color);
        this.bucketVolume = bucketVolume;
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<Bulldozer> get() {
        BulldozerSupplier bulldozer = new BulldozerSupplier();
        for (int i = 0; i < 4; i++) {
            listOfBulls.add(bulldozer.getBulldozer());
        }
        return listOfBulls;
    }
}
