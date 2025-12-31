package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setYear(2002);
        truck1.setColor("yellow");
        truck1.setName("CAT");

        Truck truck2 = new Truck();
        truck2.setName("BYD");
        truck2.setYear(2020);
        truck2.setColor("Green");

        return List.of(truck1, truck2);
    }
}
