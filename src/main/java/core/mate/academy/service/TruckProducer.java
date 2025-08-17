package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final Truck firstTruck = new Truck("firstTruck", "blue", 200);
    private final Truck secondTruck = new Truck("secondTruck", "white", 340);
    private final Truck thirdTruck = new Truck("thirdTruck", "black", 360);

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(firstTruck);
        truckList.add(secondTruck);
        truckList.add(thirdTruck);
        return truckList;
    }
}
