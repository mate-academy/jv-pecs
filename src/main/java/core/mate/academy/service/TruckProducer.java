package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> listTrucks;

    public TruckProducer() {
        listTrucks = new ArrayList<>();
        listTrucks.add(new Truck("BelAZ 75710", "yellow", 450, 4600));
        listTrucks.add(new Truck("Caterpillar 798 AC", "yellow", 372, 3500));
        listTrucks.add(new Truck("Caterpillar 797F", "yellow", 364, 4000));
    }

    @Override
    public List<Truck> get() {
        return listTrucks;
    }
}
