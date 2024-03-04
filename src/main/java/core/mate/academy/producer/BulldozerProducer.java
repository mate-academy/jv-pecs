package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.util.RandomTruncateNumberGenerator;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final RandomTruncateNumberGenerator generator;

    public BulldozerProducer() {
        generator = new RandomTruncateNumberGenerator();
    }

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(generator.generateRandomInteger(),
                generator.generateRandomInteger(),
                generator.generateRandomInteger()));
        bulldozerList.add(new Bulldozer(generator.generateRandomInteger(),
                generator.generateRandomInteger(),
                generator.generateRandomInteger()));
        bulldozerList.add(new Bulldozer(generator.generateRandomInteger(),
                generator.generateRandomInteger(),
                generator.generateRandomInteger()));
        return bulldozerList;
    }
}
