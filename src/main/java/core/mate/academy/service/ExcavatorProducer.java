package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("The bessttt", "Best color ever", 3000, "Lazer gun"),
                new Excavator("Modest", "Grey", 2999, "Some"),
                new Excavator("Excy", "White", 4000, "Lazer gun"));
    }
}
