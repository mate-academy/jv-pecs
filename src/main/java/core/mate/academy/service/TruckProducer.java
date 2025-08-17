package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck1 = new Truck("Loo", "pink", 23);
    private Truck truck2 = new Truck("Kol", "grey", 20);
    private Truck truck3 = new Truck("Took", "purple", 15);
    private List<Truck> trucks = List.of(truck1, truck2, truck3);

    @Override
    public List<? extends Truck> get() {
        return new ArrayList<Truck>(trucks);
    }
}
