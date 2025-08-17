package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucksList = new ArrayList<>();
        trucksList.add(new Truck((int) (Math.random() * 1000), "blue", "Iris"));
        trucksList.add(new Truck((int) (Math.random() * 1000), "black", "Rose"));
        trucksList.add(new Truck((int) (Math.random() * 1000), "purple", "Deep"));
        return trucksList;
    }
}
