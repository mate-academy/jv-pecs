package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine implements MachineProducer<Machine> {
    private int weight;
    private int power;
    private String name;
    private String color;
    private final String[] colors = new String[] {"blue", "red", "black", "yellow", "green"};
    private final int colorsCount = colors.length;

    public Truck() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public List<Machine> get() {
        List<Machine> result = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            Truck newTruck = new Truck();
            newTruck.setName("Truck_" + i);
            newTruck.setColor(colors[rand.nextInt(colorsCount)]);
            int weightMax = 127000;
            int weightMin = 9000;
            newTruck.setWeight(rand.nextInt(weightMax - weightMin));
            int powerMax = 140;
            int powerMin = 20;
            newTruck.setPower(rand.nextInt(powerMax - powerMin));
            result.add(newTruck);
        }
        return result;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
