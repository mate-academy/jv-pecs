package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Machine> {

    @Override
    public List<Machine> get() {
        Truck truckOne = new Truck();
        truckOne.setHaveTrailer(true);
        truckOne.setColor("white");
        truckOne.setName("Mercedes-Benz");
        Truck truckTwo = new Truck();
        truckTwo.setHaveTrailer(true);
        truckTwo.setColor("blue");
        truckTwo.setName("Volvo");
        return List.of(truckOne,truckTwo);
    }
}
