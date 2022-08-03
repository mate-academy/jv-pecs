package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck = new Truck();
        truck.setColor("green");
        truck.setName("big");
        Truck secondTruck = new Truck();
        secondTruck.setName("small");
        secondTruck.setColor("red");
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck);
        trucks.add(secondTruck);
        return trucks;
    }
}
