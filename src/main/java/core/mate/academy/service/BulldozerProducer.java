package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        Bulldozer newBulldozer = new Bulldozer(true, "WorldWide", 1500, 25000);
        bulldozerList.add(newBulldozer);
        bulldozerList.add(newBulldozer);
        return bulldozerList;
    }
}
