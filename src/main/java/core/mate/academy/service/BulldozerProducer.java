package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Caterpillar", "D11T", "U blade"));
        bulldozers.add(new Bulldozer("Komatsu", "D65EX-16", "S blade"));
        bulldozers.add(new Bulldozer("Leiebherr", "PR 736 LGP", "Semi U"));
        return bulldozers;
    }
}
