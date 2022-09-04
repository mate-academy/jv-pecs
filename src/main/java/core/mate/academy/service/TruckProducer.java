package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("yellow", "MAN", "12", "20"));
        truckList.add(new Truck("red", "DAF", "10", "22"));
        truckList.add(new Truck("grin", "VOLVO", "11", "25"));
        return truckList;
    }
}
