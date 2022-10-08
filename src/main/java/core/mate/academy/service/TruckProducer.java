package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Truck());
        return bulldozerList;
    }
}
