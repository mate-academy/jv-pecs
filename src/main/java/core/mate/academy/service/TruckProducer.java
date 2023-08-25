package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private List<? extends Machine> trucks = new ArrayList<>();
    MachineService<Truck> truckService = new MachineServiceImpl();

    @Override
    public List<Truck> get() {
        Truck truck = new Truck();
        truck.setPrice(10000);
        truck.setName("Truck");
        truck.setColor("Yellow");

        truckService.fill((List<? super Machine>) trucks, truck);
        return (List<Truck>) trucks;
    }
}
