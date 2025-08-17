package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Machine> {
    private final String[] colors = new String[] {"blue", "red", "black", "yellow", "green"};
    private final int colorsCount = colors.length;

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
}
