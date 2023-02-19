package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    public static final int PRODUCTION_AMOUNT = 3;

    @Override
    public List<Machine> get() {
        List<Machine> bulldozerList = new ArrayList<>();
        for (int i = 0; i < PRODUCTION_AMOUNT; i++) {
            bulldozerList.add(new Bulldozer());
        }
        return bulldozerList;
    }
}
