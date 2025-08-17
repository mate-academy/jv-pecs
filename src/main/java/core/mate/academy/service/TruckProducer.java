package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List get() {
        Truck truckDongfeng = new Truck();
        Truck truckHino = new Truck();
        Truck truckIveco = new Truck();
        List<Truck> truckList = List.of(truckDongfeng, truckHino, truckIveco);
        return truckList;
    }
}
