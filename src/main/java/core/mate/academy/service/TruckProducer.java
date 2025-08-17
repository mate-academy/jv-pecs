package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Komatsu HM300", "Yellow", "Dump truck"));
        trucks.add(new Truck("Tata Super Ace", "Khaki", "Flatbed"));
        trucks.add(new Truck("Mack Titan", "White", "Tank truck"));
        return trucks;
    }
}
