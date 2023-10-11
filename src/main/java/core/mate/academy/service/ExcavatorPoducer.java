package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.random.Color;
import core.mate.academy.random.Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorPoducer implements MachineProducer<Excavator> {
    private static final int NUMBER_OF_MACHINES = 3;
    private Random random = new Random();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_MACHINES; i++) {
            String randomName = Model.values()[random.nextInt(Model.values().length)].name();
            String randomColor = Color.values()[random.nextInt(Color.values().length)].name();
            double randomVolume = random.nextInt(500);
            excavators.add(new Excavator(randomName, randomColor, randomVolume));
        }

        return excavators;
    }
}
