package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozersList = new ArrayList<>();
        bulldozersList.add(new Bulldozer("CAT", "black", 140, "garbage type"));
        bulldozersList.add(new Bulldozer("Komatsu", "red", 200, "peat type"));
        return bulldozersList;
    }
}
