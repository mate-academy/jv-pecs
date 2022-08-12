package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers = new ArrayList<>();

    public BulldozerProducer() {
        bulldozers.add(new Bulldozer("firstBulldozer", "yellow"));
        bulldozers.add(new Bulldozer("secondBulldozer", "pink"));
        bulldozers.add(new Bulldozer("thirdBulldozer", "white"));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
