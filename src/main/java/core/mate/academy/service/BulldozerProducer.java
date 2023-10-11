package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.random.Color;
import core.mate.academy.random.Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int NUMBER_OF_MACHINES = 3;
    private Random random = new Random();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_MACHINES; i++) {
            String randomName = Model.values()[random.nextInt(Model.values().length)].name();
            String randomColor = Color.values()[random.nextInt(Color.values().length)].name();
            int randomHorsePowers = random.nextInt(300);
            bulldozers.add(new Bulldozer(randomName, randomColor, randomHorsePowers));
        }

        return bulldozers;
    }
}
