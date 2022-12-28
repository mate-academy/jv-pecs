package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckArrayList = new ArrayList<>();
        truckArrayList.add(new Truck("diesel","Dump",5000));
        return truckArrayList;
    }
}
