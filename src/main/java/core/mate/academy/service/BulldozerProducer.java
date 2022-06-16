package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer bulldozer1 = new Bulldozer("T-191", "yellow", "S-Blade");
    private final Bulldozer bulldozer2 = new Bulldozer("S-500", "orange", "U-Blade");
    private final Bulldozer bulldozer3 = new Bulldozer("SD-501", "brown", "Semi-U");
    private final List<Bulldozer> bulldozerList = List.of(bulldozer1, bulldozer2, bulldozer3);

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
