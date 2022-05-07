package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Denny", "red", 250));
        truckList.add(new Truck("Bobby", "blue", 230));
        truckList.add(new Truck("Billy", "green", 180));
        return truckList;
    }
}
