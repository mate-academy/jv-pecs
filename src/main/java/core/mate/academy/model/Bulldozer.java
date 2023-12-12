package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine implements MachineProducer {
    private int horsePower;
    private int bucketWidth;

    public Bulldozer() {
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getBucketWidth() {
        return bucketWidth;
    }

    public void setBucketWidth(int bucketWidth) {
        this.bucketWidth = bucketWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.bucketWidth = 4;
        bulldozer1.horsePower = 500;
        bulldozer1.setName("Volvo");
        bulldozer1.setColor("yellow");

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.bucketWidth = 5;
        bulldozer2.horsePower = 600;
        bulldozer2.setName("MAN");
        bulldozer2.setColor("green");

        Bulldozer bulldozer3 = new Bulldozer();
        bulldozer3.bucketWidth = 6;
        bulldozer3.horsePower = 700;
        bulldozer3.setName("Komatsu");
        bulldozer3.setColor("red");

        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        return bulldozers;
    }
}
