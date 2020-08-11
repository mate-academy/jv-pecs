package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerMachineProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBuldozer = new Bulldozer("CAT", "caterpillar");
        Bulldozer secondBuldozer = new Bulldozer("Hitachi", "wheels");
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(firstBuldozer);
        bulldozerList.add(secondBuldozer);
        return bulldozerList;
    }
}
