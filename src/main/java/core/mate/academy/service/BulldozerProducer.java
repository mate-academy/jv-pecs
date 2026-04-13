package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> newList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Bulldozer bulldozer = new Bulldozer();
            newList.add(bulldozer);
        }
        return newList;
    }
}
