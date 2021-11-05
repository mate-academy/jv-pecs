package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck num1 = new Truck("Truck_T34vU", "Magenta", 8, 140, "onboard");
        Truck num2 = new Truck("Truck-TDA-76", "Sean", 12, 180, "van");
        List<Truck> truckList = new ArrayList<>();
        truckList.add(num1);
        truckList.add(num2);
        return truckList;
    }
}
