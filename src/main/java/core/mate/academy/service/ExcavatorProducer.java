package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Random random = new Random();

    @Override
    public List<? extends Machine> get() {
        Excavator excavator1 = new Excavator(random.nextInt());
        Excavator excavator2 = new Excavator(random.nextInt());
        Excavator excavator3 = new Excavator(random.nextInt());
        List<Excavator> list = new ArrayList<>();
        list.add(excavator1);
        list.add(excavator2);
        list.add(excavator3);
        return list;
    }
}
