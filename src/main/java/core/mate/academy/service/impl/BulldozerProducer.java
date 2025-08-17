package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("M.A.G.E.N.T.A.", "magenta", true),
                new Bulldozer("Y.E.L.L.O.W.", "yellow", true),
                new Bulldozer("C.Y.A.N.", "cyan", true));
    }
}
