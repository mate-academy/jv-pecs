package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck bredly = new Truck("BMP", "Yellow", "Сaterpillar", 6450);
        Truck marder = new Truck("BTR", "Green", "Wheeled", 6790);
        List<Truck> trucks = new ArrayList<>();
        return List.of(bredly, marder);
    }
}
