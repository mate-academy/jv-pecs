package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<? super Machine> get() {
        return List.of(new Excavator("error"),new Excavator("sell"), new Excavator("theBest"));
    }
}
