package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("ДЗ-29", "green",
                "hydraulic", 2560, 780));
        bulldozerList.add(new Bulldozer("Д-492А", "grey",
                "mechanical", 3200, 1850));
        bulldozerList.add(new Bulldozer("ТМ-10", "yellow",
                "hydraulic",3310, 2510));
        return bulldozerList;
    }
}
