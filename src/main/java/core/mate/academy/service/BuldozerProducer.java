package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BuldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> buldozerList;

    public BuldozerProducer() {
        buldozerList = new ArrayList<>();
        buldozerList.add(new Bulldozer("First bulldozer", "Gray"));
        buldozerList.add(new Bulldozer("Second bulldozer", "Yellow"));
    }

    @Override
    public List<Bulldozer> get() {
        return buldozerList;
    }
}
