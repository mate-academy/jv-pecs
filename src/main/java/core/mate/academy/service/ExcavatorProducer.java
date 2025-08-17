package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator336 = new Excavator("Cat 336", "Yellow", 2.12, 8210, 210);
        Excavator excavator340 = new Excavator("Cat 340", "Yellow", 2.6, 8260, 202);
        Excavator excavator349 = new Excavator("Cat 349", "Yellow", 3.08, 7660, 268);
        return List.of(excavator336, excavator340, excavator349);
    }
}
