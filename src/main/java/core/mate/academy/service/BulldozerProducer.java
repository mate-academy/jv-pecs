package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozerList;

    public BulldozerProducer() {
        bulldozerList = new ArrayList<>();
        bulldozerList.add(
                new Bulldozer("D6R LGP", "yellow", "CATERPILLAR", 5.4, true));
        bulldozerList.add(
                new Bulldozer("TD-14M", "red", "DRESSTA", 1.6, true));
        bulldozerList.add(
                new Bulldozer("D65EX12", "black", "KOMATSU", 2.1, false));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
