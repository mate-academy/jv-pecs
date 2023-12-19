package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(20.0, "small"));
        bulldozerList.add(new Bulldozer(25.0, "big"));
        bulldozerList.add(new Bulldozer(15.0, "large"));
        return bulldozerList;
    }
}
