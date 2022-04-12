package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private Truck model = new Truck();

    @Override
    public List<Truck> get() {
        List<Truck> listTruck = new ArrayList<>();
        listTruck.add(model);
        return listTruck;
    }
}
