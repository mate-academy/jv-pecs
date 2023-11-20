package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorPoducer implements MachineProducer<Excavator> {
    private static final int NUMBER_OF_MACHINES = 3;
    private Excavator excavator = new Excavator();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_MACHINES; i++) {
            String randomName = excavator.getRandomName();
            String randomColor = excavator.getRandomColor();
            double randomVolume = excavator.getRandomBucketVolume();
            excavators.add(new Excavator(randomName, randomColor, randomVolume));
        }

        return excavators;
    }
}
