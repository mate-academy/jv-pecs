package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Excavator excavator336;
    private final Excavator excavator340;
    private final Excavator excavator349;

    public ExcavatorProducer() {
        excavator336 = new Excavator(2.12, 8210, 210);
        excavator336.setName("Cat excavator 336");
        excavator336.setColor("Yellow");
        excavator340 = new Excavator(2.6, 8260, 202);
        excavator340.setName("Cat excavator 340");
        excavator340.setColor("Yellow");
        excavator349 = new Excavator(3.08, 7660, 268);
        excavator349.setName("Cat excavator 349");
        excavator349.setColor("Yellow");
    }

    @Override
    public List<Excavator> get() {
        return List.of(excavator336, excavator340, excavator349);
    }
}
