package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.random.Colors;
import core.mate.academy.random.Models;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorPoducer implements MachineProducer<Excavator> {
    private Random random = new Random();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_MACHINES; i++) {
            String randomName = Models.values()[random.nextInt(Models.values().length)].name();
            String randomColor = Colors.values()[random.nextInt(Colors.values().length)].name();
            double randomVolume = random.nextInt(500);
            excavators.add(new Excavator(randomName, randomColor, randomVolume));
        }

        return excavators;
    }
}
