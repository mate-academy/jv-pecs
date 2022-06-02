package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.LinkedList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator320 = new Excavator("CAT 320 GC", "Yellow", 22);
        Excavator excavator330 = new Excavator("CAT 330 - Tier 4F", "Yellow", 24);
        Excavator excavator326 = new Excavator("CAT 326 - Tier 4F", "Yellow", 22);
        List<Excavator> excavators = new LinkedList<>();
        excavators.add(excavator320);
        excavators.add(excavator330);
        excavators.add(excavator326);
        return excavators;
    }
}
