package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer extends Truck implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Truck firstTruck = new Truck();
        firstTruck.setName("Mitsubishi");
        firstTruck.setColor("Silver");
        firstTruck.setLoadCapacity(42);
        Truck secondtTruck = new Truck();
        secondtTruck.setName("MAN");
        secondtTruck.setColor("White");
        secondtTruck.setLoadCapacity(35);
        List<Machine> truckList = List.of(firstTruck, secondtTruck);
        return truckList;
    }
}
