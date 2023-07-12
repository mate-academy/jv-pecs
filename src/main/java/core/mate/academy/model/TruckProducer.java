package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        firstTruck.setName("Mitsubishi");
        firstTruck.setColor("Silver");
        firstTruck.setLoadCapacity(42);
        Truck secondtTruck = new Truck();
        secondtTruck.setName("MAN");
        secondtTruck.setColor("White");
        secondtTruck.setLoadCapacity(35);
        List<Truck> truckList = List.of(firstTruck, secondtTruck);
        return truckList;
    }
}
