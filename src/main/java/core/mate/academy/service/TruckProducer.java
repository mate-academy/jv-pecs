package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setName("Jack");
        truck1.setColor("black");
        truck1.setOffroadCapable(false);
        truck1.setWheelSize(24);

        Truck truck2 = new Truck();
        truck2.setName("John");
        truck2.setColor("grey");
        truck2.setOffroadCapable(true);
        truck2.setWheelSize(34);

        return new ArrayList<>(Arrays.asList(truck1, truck2));
    }
}
