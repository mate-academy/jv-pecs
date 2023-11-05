package core.mate.academy.producers;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator(getRandomNum(), getRandomNum()),
                new Excavator(getRandomNum(), getRandomNum()));
    }
}
