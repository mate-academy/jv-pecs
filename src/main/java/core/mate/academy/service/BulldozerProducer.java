package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("A type",500));
        bulldozerList.add(new Bulldozer("B type",100));
        bulldozerList.add(new Bulldozer("C type",350));
        return bulldozerList;
    }
}
