package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator("Caterpillar 320", "construction", "medium");
        Excavator secondExcavator = new Excavator("Komatsu PC200", "mining", "heavy");
        Excavator thirdExcavator = new Excavator("Hitachi ZX33U-5A", "excavation", "compact");
        return List.of(firstExcavator, secondExcavator, thirdExcavator);
    }
}
