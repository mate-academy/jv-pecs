package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();

        truck1.setName("truck1");
        truck2.setName("truck2");
        truck3.setName("truck3");

        truck1.setColor("Orange");
        truck2.setColor("Violet");
        truck3.setColor("White");

        truck1.setTrailerLength(7);
        truck2.setTrailerLength(8);
        truck3.setTrailerLength(9);

        return List.of(truck1, truck2, truck3);
    }
}
