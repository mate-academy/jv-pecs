package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck model1 = new Truck();
        Truck model2 = new Truck();
        Truck model3 = new Truck();
        List<Truck> listOfModels = List.of(model1, model2, model3);
        return listOfModels;
    }
}
