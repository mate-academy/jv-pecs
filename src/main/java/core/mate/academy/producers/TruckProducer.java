package core.mate.academy.producers;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck volvo = new Truck();
    private Truck ford = new Truck();
    private Truck freightliner = new Truck();

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(volvo);
        trucks.add(ford);
        trucks.add(freightliner);
        return trucks;
    }
}
