package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Random random = new Random();

    @Override
    public List<? extends Machine> get() {
        Bulldozer bulldozer1 = new Bulldozer(random.nextInt());
        Bulldozer bulldozer2 = new Bulldozer(random.nextInt());
        Bulldozer bulldozer3 = new Bulldozer(random.nextInt());
        List<Bulldozer> list = new ArrayList<>();
        list.add(bulldozer1);
        list.add(bulldozer2);
        list.add(bulldozer3);
        return list;
    }
}
