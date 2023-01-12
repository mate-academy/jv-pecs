package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    private List<Machine> bulldozerList = new ArrayList<>();

    public BulldozerProducer() {
        bulldozerList.add(new Bulldozer());
        bulldozerList.add(new Bulldozer());
        bulldozerList.add(new Bulldozer());
    }

    @Override
    public List<Machine> get() {
        if (bulldozerList.isEmpty()) {
            return null;
        }
        return bulldozerList;
    }
}
