package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();

        String name1 = "firstTruck";
        String color1 = "Yellow";
        Truck firstTruck = new Truck(name1, color1);
        trucks.add(firstTruck);

        String name2 = "secondTruck";
        String color2 = "Blue";
        Truck secondTruck = new Truck(name2, color2);
        trucks.add(secondTruck);

        String name3 = "thirdTruck";
        String color3 = "PerfectBlue";
        Truck thirdTruck = new Truck(name3, color3);
        trucks.add(thirdTruck);

        return trucks;
    }
}
