package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("The bessttt",
                        "Best color ever", 3000, "Lazer gun"),
                new Excavator("Modest", "Grey", 2999, "Some"),
                new Excavator("Excy", "White", 4000, "Lazer gun"));
    }
}
