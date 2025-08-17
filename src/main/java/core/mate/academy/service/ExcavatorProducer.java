package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator(15, false, false, "Cat312E", "Yellow"),
                new Excavator(5, true, false, "KobelcoSK28SR", "Green"),
                new Excavator(10, false, true,"LiebherrA910", "White"));
    }
}
