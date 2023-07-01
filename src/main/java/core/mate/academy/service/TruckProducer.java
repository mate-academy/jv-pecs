package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();

        Truck firstTruck = new Truck();
        firstTruck.setName("firstTruck");
        firstTruck.setColor("Yellow");
        trucks.add(firstTruck);

        Truck secondTruck = new Truck();
        secondTruck.setName("secondTruck");
        secondTruck.setColor("Blue");
        trucks.add(secondTruck);

        Truck thirdTruck = new Truck();
        thirdTruck.setName("thirdTruck");
        thirdTruck.setColor("PerfectBlue");
        trucks.add(thirdTruck);

        return trucks;
    }
}
