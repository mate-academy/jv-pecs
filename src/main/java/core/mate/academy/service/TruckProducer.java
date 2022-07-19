package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("MAN","white","refrigerator", 30, 20));
        trucks.add(new Truck("MERSEDES","blue","platform", 20,15));
        trucks.add(new Truck("SCANIA","gold","awning", 60,40));
        return trucks;
    }
}
