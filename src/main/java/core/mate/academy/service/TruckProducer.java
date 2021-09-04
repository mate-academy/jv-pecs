package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Freightliner M2", "orange",
                "dump truck", 30, 6));
        truckList.add(new Truck("Liebherr T 282B", "white",
                "mining truck", 363, 4));
        truckList.add(new Truck("A Mack Titan", "blue",
                "road train", 200, 44));
        return truckList;
    }
}
