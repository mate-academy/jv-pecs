package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer().setEnginePower(1000).setWeight(5000));
        bulldozerList.add(new Bulldozer().setEnginePower(100).setWeight(5000));
        bulldozerList.add(new Bulldozer().setEnginePower(300).setWeight(7000));
        return bulldozerList;
    }
}
