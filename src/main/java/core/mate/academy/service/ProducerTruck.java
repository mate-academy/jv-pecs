package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class ProducerTruck implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("MAN", "yellow", 20, "VX3000"));
        trucks.add(new Truck("VOLVO", "White", 30, "TF2000"));
        trucks.add(new Truck("SCANIA", "black", 40, "SC4500"));
        return trucks;
    }
}
