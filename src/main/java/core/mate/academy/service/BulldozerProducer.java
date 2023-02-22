package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public static final int PRODUCTION_AMOUNT = 3;

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        for (int i = 0; i < PRODUCTION_AMOUNT; i++) {
            bulldozerList.add(new Bulldozer(3, 25));
        }
        return bulldozerList;
    }
}
