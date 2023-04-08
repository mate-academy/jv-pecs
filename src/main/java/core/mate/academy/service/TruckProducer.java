package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck firstTruck = new Truck("firstTruck", "blue", 2015);
    private Truck secondTruck = new Truck("secondTruck", "white", 2009);
    private Truck thirdTruck = new Truck("thirdTruck", "black", 2018);

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(firstTruck);
        truckList.add(secondTruck);
        truckList.add(thirdTruck);
        return truckList;
    }
}
