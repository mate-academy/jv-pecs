package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int MACHINE_NUMBER = 3;

    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer();
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        List<Bulldozer> list = new ArrayList<>();
        list.add(bulldozer);
        list.add(bulldozer1);
        list.add(bulldozer2);
        return list;
    }
}
