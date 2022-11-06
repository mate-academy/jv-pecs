package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("Truck-1",
                "Black",50_000,"Box truck");
        Truck secondTruck = new Truck("Truck-2",
                "White",45_000,"Flatbed truck");
        Truck thirdTruck = new Truck("Truck-3",
                "Black",47_000,"Box truck");
        return List.of(firstTruck,secondTruck,thirdTruck);
    }
}
