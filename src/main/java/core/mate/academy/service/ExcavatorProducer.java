package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer extends Excavator {
    List<? extends Excavator> get() {
        return List.of(new Excavator(), new Excavator(), new Excavator());
    }
}
