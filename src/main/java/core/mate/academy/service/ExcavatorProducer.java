package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("Jelly", "Orange", "CAT"),
                new Excavator("Grown", "Black", "KOBELCO"),
                new Excavator("Metro", "Orange", "VOLVO")
        );
    }
}
