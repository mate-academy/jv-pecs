package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("BTL-12", "yellow", 450));
        bulldozerList.add(new Bulldozer("MTB", "yellow", 400));
        bulldozerList.add(new Bulldozer("Caterpillar RL09", "black", 800));
        return bulldozerList;
    }
}
