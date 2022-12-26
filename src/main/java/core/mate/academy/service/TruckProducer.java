package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> bulldozerList = new ArrayList<>();

    @Override
    public List<Truck> get() {
        bulldozerList.add(new Truck());
        return bulldozerList;
    }
}
