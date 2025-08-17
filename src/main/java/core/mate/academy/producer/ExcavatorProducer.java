package core.mate.academy.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.util.RandomTruncateNumberGenerator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final RandomTruncateNumberGenerator generator;

    public ExcavatorProducer() {
        generator = new RandomTruncateNumberGenerator();
    }

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(generator.generateRandomInteger(),
                generator.generateRandomInteger(),
                generator.generateRandomInteger()));
        excavatorList.add(new Excavator(generator.generateRandomInteger(),
                generator.generateRandomInteger(),
                generator.generateRandomInteger()));
        excavatorList.add(new Excavator(generator.generateRandomInteger(),
                generator.generateRandomInteger(),
                generator.generateRandomInteger()
        ));
        return excavatorList;
    }
}
