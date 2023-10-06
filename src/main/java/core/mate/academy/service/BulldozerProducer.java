package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private static final int NUMBER_OF_MODELS = 3;
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_MODELS; i++) {
            bulldozerList.add(new Bulldozer());
        }
        return bulldozerList;
    }
}
