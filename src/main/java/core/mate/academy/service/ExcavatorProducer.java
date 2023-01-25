package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator model1 = new Excavator();
        Excavator model2 = new Excavator();
        Excavator model3 = new Excavator();
        List<Excavator> listOfModels = List.of(model1, model2, model3);
        return listOfModels;
    }
}
