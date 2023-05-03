package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("deepMiner",
                        "LongBucket",
                        "Brutal Blue",
                        3),
                new Excavator("fieldMiner",
                        "SirJon",
                        "Green",
                        2),
                new Excavator("apartmentHelper",
                        "Jelly-Bally",
                        "Dirty",
                        1));
    }
}
