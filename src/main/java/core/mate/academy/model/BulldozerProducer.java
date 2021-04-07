package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Max", "yellow", "first type"));
        bulldozerList.add(new Bulldozer("Big", "red", "second type"));
        bulldozerList.add(new Bulldozer("Vaz", "blue", "third type"));
        return bulldozerList;
    }
}
