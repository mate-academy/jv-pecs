package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBER_OF_MACHINES = 3;
    private Bulldozer bulldozer = new Bulldozer();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_MACHINES; i++) {
            String randomName = bulldozer.getRandomName();
            String randomColor = bulldozer.getRandomColor();
            int randomHorsePowers = bulldozer.getRandomHorsePowers();
            bulldozers.add(new Bulldozer(randomName, randomColor, randomHorsePowers));
        }

        return bulldozers;
    }
}
