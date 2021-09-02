package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer<T extends Bulldozer> implements MachineProducer {
    private List<Bulldozer> produce() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        for (int i = 0; i < DEFAULT_NUMBER_OF_MACHINES; i++) {
            bulldozerList.add(new Bulldozer());
        }
        return bulldozerList;
    }

    @Override
    public List<Bulldozer> get() {
        return produce();
    }
}
