package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Truck firstTruck = new Truck(121, "MAN");
        Truck secondTruck = new Truck(140,"ZIL");
        Truck thirdTruck = new Truck(170,"VOLVO");
        return List.of(firstTruck,secondTruck,thirdTruck);
    }
}
