package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Komatsy D", "Yellow", 6, 2));
        bulldozers.add(new Bulldozer("BobCat", "Red", 2, 1));
        bulldozers.add(new Bulldozer("Caterpillar", "Grin", 7, 2));
        bulldozers.add(new Bulldozer("Dressta", "Grey", 5, 1));
        return bulldozers;
    }
}
