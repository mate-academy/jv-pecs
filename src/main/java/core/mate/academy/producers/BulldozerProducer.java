package core.mate.academy.producers;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer cat = new Bulldozer();
    private Bulldozer komatsu = new Bulldozer();
    private Bulldozer johnDeere = new Bulldozer();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(cat);
        bulldozers.add(komatsu);
        bulldozers.add(johnDeere);
        return bulldozers;
    }
}
