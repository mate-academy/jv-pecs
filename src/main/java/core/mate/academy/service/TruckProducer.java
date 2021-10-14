package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks = new ArrayList<>();

    {
        Truck truck = new Truck();
        truck.setName("Track");
        truck.setColor("Green");
        truck.setPower(700);
        trucks.add(truck);
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
