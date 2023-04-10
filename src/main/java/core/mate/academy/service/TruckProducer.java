package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<? extends Machine> get() {
        return listOfTrucks();
    }

    private List<Truck> listOfTrucks() {
        Truck truck1 = new Truck(45, 3);
        Truck truck2 = new Truck(30, 6);
        Truck truck3 = new Truck(40, 2);
        truck1.setName("Elena");
        truck2.setName("Paula");
        truck3.setName("Viktoria");
        return List.of(truck1, truck2, truck3);
    }
}
