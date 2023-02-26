package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Random random = new Random();

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(random.nextInt());
        Excavator excavator2 = new Excavator(random.nextInt());
        Excavator excavator3 = new Excavator(random.nextInt());
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
