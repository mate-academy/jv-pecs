package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("Hitachi", "yellow", "Ditch Cleaning"),
                new Excavator("Volvo", "gray", "Clean-up"),
                new Excavator("Cat", "yellow", "General duty"));
    }
}
