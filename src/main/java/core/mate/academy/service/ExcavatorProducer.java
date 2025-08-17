package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Machine> {
    private final String[] colors = new String[] {"blue", "red", "black", "yellow", "green"};
    private final int colorsCount = colors.length;

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
}
