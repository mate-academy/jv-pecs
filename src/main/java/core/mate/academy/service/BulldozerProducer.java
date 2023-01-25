package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer model1 = new Bulldozer();
        Bulldozer model2 = new Bulldozer();
        Bulldozer model3 = new Bulldozer();
        List<Bulldozer> listOfModels = List.of(model1, model2, model3);
        return listOfModels;
    }
}
