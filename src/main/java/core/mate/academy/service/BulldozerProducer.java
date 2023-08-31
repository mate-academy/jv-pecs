package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("BelAzZ-7823", "yellow", 23456, "m1"));
        bulldozerList.add(new Bulldozer("HTZ-150K", "black", 25768, "m2"));
        bulldozerList.add(new Bulldozer("D275", "red", 22678, "m3"));
        bulldozerList.add(new Bulldozer("CHTZ B12", "deep blue", 23444, "m4"));
        return bulldozerList;
    }
}
