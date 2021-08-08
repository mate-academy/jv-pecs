package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine implements MachineProducer<Machine> {
    private int weight;
    private int hydraulicPower;
    private String name;
    private String color;
    private final String[] colors = new String[] {"blue", "red", "black", "yellow", "green"};
    private final int colorsCount = colors.length;

    public Excavator() {
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

    public int getHydraulicPower() {
        return hydraulicPower;
    }

    public void setHydraulicPower(int hydraulicPower) {
        this.hydraulicPower = hydraulicPower;
    }

    @Override
    public List<Machine> get() {
        List<Machine> result = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            Excavator newExcavator = new Excavator();
            newExcavator.setName("Excavator_" + i);
            newExcavator.setColor(colors[rand.nextInt(colorsCount)]);
            int weightMax = 100000;
            int weightMin = 15000;
            newExcavator.setWeight(rand.nextInt(weightMax - weightMin));
            int hydraulicPowerMax = 120;
            int hydraulicPowerMin = 48;
            newExcavator.setHydraulicPower(rand.nextInt(hydraulicPowerMax - hydraulicPowerMin));
            result.add(newExcavator);
        }
        return result;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
