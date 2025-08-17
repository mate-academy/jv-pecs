package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<? extends Machine> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck.TruckBuilder()
                .setEngineNumber(254578)
                .setLength(13)
                .setModel("Fujitsu")
                .build());
        trucks.add(new Truck.TruckBuilder()
                .setEngineNumber(129687)
                .setLength(12)
                .setModel("Volvo")
                .build());
        trucks.add(new Truck.TruckBuilder()
                .setEngineNumber(784125)
                .setLength(18)
                .setModel("Renault")
                .build());
        return trucks;
    }
}
