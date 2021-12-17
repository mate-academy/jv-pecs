package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> resultList = new ArrayList<>();
        resultList.add(new Truck());
        resultList.add(new Truck());
        return resultList;
    }
}
