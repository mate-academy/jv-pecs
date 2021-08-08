package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine implements MachineProducer<Machine> {
    private int bladeWidth;
    private String name;
    private String color;
    private final String[] colors = new String[] {"blue", "red", "black", "yellow", "green"};
    private final int colorsCount = colors.length;

    public Bulldozer() {
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

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public List<Machine> get() {
        List<Machine> result = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            Bulldozer newBulldozer = new Bulldozer();
            newBulldozer.setName("Bulldozer_" + i);
            newBulldozer.setColor(colors[rand.nextInt(colorsCount)]);
            int bladeWidthMax = 1000;
            int bladeWidthMin = 100;
            newBulldozer.setBladeWidth(rand.nextInt(bladeWidthMax - bladeWidthMin));
            result.add(newBulldozer);
        }
        return result;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
