package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozersList = new ArrayList<>();
        bulldozersList.add(new Bulldozer("U blade"));
        bulldozersList.add(new Bulldozer("S blade"));
        bulldozersList.add(new Bulldozer("S-U"));
        return bulldozersList;
    }
}
