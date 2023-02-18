package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BuldozerProducer implements MachineProducer {
    @Override
    public List<? extends Machine> get() {
        List<Bulldozer> machines = new ArrayList();
        machines.add(new Bulldozer("LoveDozer", "red", 3, 5));
        machines.add(new Bulldozer("DarkKnight", "black", 1, 3));
        return machines;
    }
}
