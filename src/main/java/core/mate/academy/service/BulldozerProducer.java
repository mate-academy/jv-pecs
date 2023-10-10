package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.random.Colors;
import core.mate.academy.random.Models;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Random random = new Random();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_MACHINES; i++) {
            String randomName = Models.values()[random.nextInt(Models.values().length)].name();
            String randomColor = Colors.values()[random.nextInt(Colors.values().length)].name();
            int randomHorsePowers = random.nextInt(300);
            bulldozers.add(new Bulldozer(randomName, randomColor, randomHorsePowers));
        }

        return bulldozers;
    }
}
