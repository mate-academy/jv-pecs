package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckOne = new Truck();
        truckOne.setCabinCapacity(20.5);
        truckOne.setName("Volvo");
        truckOne.setColor("white");
        Truck truckTwo = new Truck();
        truckTwo.setCabinCapacity(31.2);
        truckTwo.setName("MAN");
        truckTwo.setColor("grey");
        return List.of(truckOne, truckTwo);
    }
}
