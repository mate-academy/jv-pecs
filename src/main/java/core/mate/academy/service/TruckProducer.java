package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setLiftCapacity(40);
        truck1.setSpeed(30);
        truck1.setName("Volvo");
        truck1.setColor("yellow");

        Truck truck2 = new Truck();
        truck2.setLiftCapacity(20);
        truck2.setSpeed(40);
        truck2.setName("MAN");
        truck2.setColor("red");

        Truck truck3 = new Truck();
        truck3.setLiftCapacity(35);
        truck3.setSpeed(35);
        truck3.setName("Komatsu");
        truck3.setColor("grey");

        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
