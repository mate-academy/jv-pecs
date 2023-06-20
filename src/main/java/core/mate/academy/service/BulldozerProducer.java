package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Komatsu", 45_000));
        bulldozerList.add(new Bulldozer("Case", 50_000));
        bulldozerList.add(new Bulldozer("Fiat", 34_000));
        return bulldozerList;
    }
}
