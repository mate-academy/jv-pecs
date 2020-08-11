package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BuldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> buldozerList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            buldozerList.add(new Bulldozer("Small " + i, "Grinder - " + i));
        }
        return buldozerList;
    }
}
