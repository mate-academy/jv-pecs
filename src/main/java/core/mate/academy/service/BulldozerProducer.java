package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private static final int MACHINE_NUMBER = 3;

    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        for (int i = 0; i <= MACHINE_NUMBER; i++) {
            Bulldozer bulldozer = new Bulldozer();
            list.add(bulldozer);
        }
        return list;
    }
}
