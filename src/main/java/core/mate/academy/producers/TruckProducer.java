package core.mate.academy.producers;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final Truck truckOne = new Truck("narrow",10);
    private final Truck truckTwo = new Truck("medium",20);
    private final Truck truckThree = new Truck("wide",30);

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(truckOne);
        truckList.add(truckTwo);
        truckList.add(truckThree);
        return truckList;
    }
}
