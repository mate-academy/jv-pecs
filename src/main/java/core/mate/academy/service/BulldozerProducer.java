package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers = new ArrayList<>();

    @Override
    public List<Bulldozer> get() {
        bulldozers.add(new Bulldozer(1200, "Lil guy"));
        bulldozers.add(new Bulldozer(1400, "Dozer"));
        bulldozers.add(new Bulldozer(2000, "Boss"));
        return bulldozers;
    }
}
