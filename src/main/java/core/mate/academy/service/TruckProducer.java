package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("T-154", "brown", "Vasiliy D", 23000));
        trucks.add(new Truck("BT-45", "yellow", "Anton D", 13400));
        trucks.add(new Truck("TY-12", "red", "Sergey V", 235));
        return trucks;
    }
}
