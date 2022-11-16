package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckArrayList = new ArrayList<>();
        int bmwNumberOfAxles = 3;
        truckArrayList.add(new Truck("BMW", "white", "trolley", bmwNumberOfAxles));
        truckArrayList.add(new Truck());
        truckArrayList.add(new Truck());
        return truckArrayList;
    }
}
