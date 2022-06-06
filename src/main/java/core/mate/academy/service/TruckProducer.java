package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Volvo", "grey", 100, "metal"));
        truckList.add(new Truck("Rum", "white", 80, "corn"));
        return truckList;
    }
}
