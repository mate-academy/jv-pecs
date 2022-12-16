package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> trucks = new ArrayList<>();
        Truck firstTruck = new Truck(1000);
        firstTruck.setName("First truck");
        firstTruck.setColor("Red");
        trucks.add(firstTruck);
        Truck secondTruck = new Truck(2000);
        secondTruck.setName("Second truck");
        secondTruck.setColor("White");
        trucks.add(secondTruck);
        return trucks;
    }

}
