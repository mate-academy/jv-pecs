package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("Volvo FH", "tractor unit", "8x4");
        Truck secondTruck = new Truck("DAF LF", "box truck", "6x2");
        Truck thirdTruck = new Truck("Scania P-series", "rigid truck", "6x2");
        return List.of(firstTruck, secondTruck, thirdTruck);
    }
}
