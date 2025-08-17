package core.mate.academy.implementations;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozersList = new ArrayList<>();
        bulldozersList.add(new Bulldozer("bulldozer1", "red",2.5, "easy"));
        bulldozersList.add(new Bulldozer("bulldozer2", "black",3.5, "heavy"));
        bulldozersList.add(new Bulldozer("bulldozer1", "white",6.5, "super heavy"));
        return bulldozersList;
    }
}
