package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Mercedes", "Black", 15, 4, 189));
        bulldozerList.add(new Bulldozer("Mercedes", "White", 11, 3, 17));
        bulldozerList.add(new Bulldozer("Subaru", "White", 17, 6, 546));
        return bulldozerList;

    }
}
