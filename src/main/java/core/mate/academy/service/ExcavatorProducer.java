package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public static final int MAX_POWER = 100;
    private final Random random = new Random();

    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("Volvo", "Yellow", random.nextInt(MAX_POWER), true),
                new Excavator("JCB", "Orange", random.nextInt(MAX_POWER), false),
                new Excavator("Hitachi", "Orange", random.nextInt(MAX_POWER), false)
        );
    }
}
