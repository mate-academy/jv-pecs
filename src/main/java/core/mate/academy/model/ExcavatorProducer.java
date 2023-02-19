package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator himars = new Excavator("RSZO", "Green", "USA",10866);
        Excavator olha = new Excavator("RSZO", "Piksel","Ukraine",7000);
        List<Excavator> excavators = new ArrayList<>();
        return List.of(himars, olha);
    }
}
