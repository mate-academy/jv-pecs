package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer firstBulldozer = new Bulldozer("Caterpillar", "white", 6);
    private Bulldozer secondBulldozer = new Bulldozer("Komatsu", "orange", 7);

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(firstBulldozer);
        bulldozerList.add(secondBulldozer);
        return bulldozerList;
    }
}
