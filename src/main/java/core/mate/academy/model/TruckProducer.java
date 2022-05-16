package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer<T extends Machine> implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        Truck thirdTruck = new Truck();
        truckList.add(firstTruck);
        truckList.add(secondTruck);
        truckList.add(thirdTruck);
        return truckList;
    }
}
