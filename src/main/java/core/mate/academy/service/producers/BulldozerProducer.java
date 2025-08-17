package core.mate.academy.service.producers;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Titan Trax", "Yellow", 200));
        bulldozers.add(new Bulldozer("PowerProwler", "Black", 220));
        bulldozers.add(new Bulldozer("BulldozeMaster", "Dark blue", 180));
        return bulldozers;
    }
}
