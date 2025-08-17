package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();

        truck1.setColor("Red");
        truck2.setColor("Grey");
        truck1.setName("Jim");
        truck2.setName("Leo");
        truck1.setFuelType("Gas");
        truck2.setFuelType("Diesel");
        truck1.setMileage(65654);
        truck2.setMileage(125322);

        return List.of(truck1, truck2);
    }
}
