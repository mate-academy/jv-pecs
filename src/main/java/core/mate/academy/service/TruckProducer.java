package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Truck #1", "black", 0, "1st field"));
        trucks.add(new Truck("Truck #2", "red", 1, "2nd field"));
        trucks.add(new Truck("Truck #3", "yellow", 2, "3rd field"));
        return trucks;
    }   
}
