package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator = new Excavator();
        excavator.putItemToStorage(new Excavator());
        excavator.putItemToStorage(new Excavator());
        excavator.putItemToStorage(new Excavator());
        excavator.putItemToStorage(new Excavator());
        excavator.putItemToStorage(new Excavator());
        return excavator.readStorage();
    }
}
