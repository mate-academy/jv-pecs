package core.mate.academy.model.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < AMOUNT_TO_GET; i++) {
            truckList.add(new Truck());
        }
        return truckList;
    }
}
