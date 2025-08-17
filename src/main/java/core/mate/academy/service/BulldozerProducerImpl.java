package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozersList = new ArrayList<>();
        bulldozersList.add(new Bulldozer(5000, "CAT", "yellow"));
        bulldozersList.add(new Bulldozer(6005, "T-130", "red"));
        bulldozersList.add(new Bulldozer(4321, "T-131", "green"));
        return bulldozersList;
    }
}
