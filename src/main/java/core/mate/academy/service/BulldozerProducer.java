package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozersList = new ArrayList<>();
        bulldozersList.add(new Bulldozer("Man", 1991, 500));
        bulldozersList.add(new Bulldozer("Volvo", 2009, 560));
        bulldozersList.add(new Bulldozer("CAT", 2015, 700));
        return bulldozersList;
    }
}
