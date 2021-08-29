package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> listTruck = new ArrayList<>();
        listTruck.add(new Truck("tru1", "red", 1000));
        listTruck.add(new Truck("tru2", "green", 1500));
        return listTruck;
    }
}
