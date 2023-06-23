package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setColor("Green");
        truck1.setName("Chris");
        truck1.setModel("Cool");
        Truck truck2 = new Truck();
        truck2.setColor("Yellow");
        truck2.setName("Big");
        truck2.setModel("NotCool");
        Truck truck3 = new Truck();
        truck3.setColor("Orange");
        truck3.setName("Orest");
        truck3.setModel("Coolest");

        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
