package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Excavator lt8065w = new Excavator("LT8065W", "home excavator");
    private final Excavator lt815w = new Excavator("LT8065W", "rugged terrain");
    private final Excavator lt822 = new Excavator("LT822-7", "for heavy equipment");
    private List<Excavator> excavators = List.of(lt8065w, lt815w, lt822);

    @Override
    public List<? extends Machine> get() {
        return excavators;
    }
}
