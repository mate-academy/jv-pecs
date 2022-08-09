package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozerList;

    public BulldozerProducer() {
        bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Rock", "Black"));
        bulldozerList.add(new Bulldozer("Rave", "Purple"));
        bulldozerList.add(new Bulldozer("River", "Blue"));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }

}
