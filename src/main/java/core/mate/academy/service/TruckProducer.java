package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck volvoTruck = new Truck("Volvo","grey",300);
        Truck nissanTruck = new Truck("Nissan","black",250);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(volvoTruck);
        trucks.add(nissanTruck);
        return trucks;
    }
}
