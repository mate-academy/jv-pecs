package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine implements MachineProducer{
    private int bucketLoadCapacity;
    private int weight;

    public int getBucketLoadCapacity() {
        return bucketLoadCapacity;
    }

    public void setBucketLoadCapacity(int bucketLoadCapacity) {
        this.bucketLoadCapacity = bucketLoadCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.bucketLoadCapacity = 20;
        excavator1.weight = 50;
        excavator1.setName("Volvo");
        excavator1.setColor("yellow");

        Excavator excavator2 = new Excavator();
        excavator2.bucketLoadCapacity = 30;
        excavator2.weight = 60;
        excavator2.setName("Man");
        excavator2.setColor("RED");

        Excavator excavator3 = new Excavator();
        excavator3.bucketLoadCapacity = 25;
        excavator3.weight = 55;
        excavator3.setName("Komatsu");
        excavator3.setColor("green");

        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }

}
