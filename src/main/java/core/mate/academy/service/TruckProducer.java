package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckDaf = new Truck("Daf", "Red",
                200, 50.0, "Tent");
        Truck truckVolvo = new Truck("Volvo", "White",
                250, 30, "Open trailer");
        Truck truckReno = new Truck("Reno", "Red",
                200, 30, "Tent");
        return List.of(truckDaf, truckVolvo, truckReno);
    }
}
