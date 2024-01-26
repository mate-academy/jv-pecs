package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> getModels() {
        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(70));
        trucks.add(new Truck(800));
        trucks.add(new Truck(435));
        return trucks;
    }
}
