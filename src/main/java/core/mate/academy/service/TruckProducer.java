package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> truckList = new ArrayList<Truck>();

    @Override
    public List<Truck> get() {
        truckList.add(new Truck());
        return truckList;
    }
}
