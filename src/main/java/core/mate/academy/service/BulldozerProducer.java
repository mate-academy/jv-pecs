package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("TM-10","red",300));
        bulldozerList.add(new Bulldozer("CAT","yellow",290));
        bulldozerList.add(new Bulldozer("T-130","blue",305));
        return bulldozerList;
    }
}
