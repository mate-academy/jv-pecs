package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(1000, 5000));
        bulldozerList.add(new Bulldozer(200, 2000));
        bulldozerList.add(new Bulldozer(700, 4000));
        return bulldozerList;
    }
}
