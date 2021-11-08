package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<? extends Machine> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(true, 3.4, 200,
                500, "Bulldozer1", "Red"));
        bulldozers.add(new Bulldozer(false, 4.5, 160,
                345, "Bulldozer2", "Yellow"));
        bulldozers.add(new Bulldozer(true, 6.3, 210,
                435, "Bulldozer3", "Black"));
        return bulldozers;
    }
}
