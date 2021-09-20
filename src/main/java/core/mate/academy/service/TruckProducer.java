package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {

    @Override
    public List<Machine> get() {
        List<Machine> trucks = new ArrayList<>();
        trucks.add(new Truck("Tata","green"));
        trucks.add(new Truck("Volvo","white"));
        trucks.add(new Truck("Iveco","blue"));
        return trucks;
    }
}
