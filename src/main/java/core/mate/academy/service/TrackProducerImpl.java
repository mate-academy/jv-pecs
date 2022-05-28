package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TrackProducerImpl<T extends Machine> implements MachineProducer<Truck> {
    private List<Truck> truckList;

    @Override
    public List<Truck> get() {
        truckList = new ArrayList<>();
        Truck man = new Truck(80, "Man TGX", Truck.TruckType.INTERCITY);
        Truck belaz = new Truck(320, "BelAz-75601", Truck.TruckType.CAREER);
        Truck reno = new Truck(10,"Renault D-140", Truck.TruckType.URBAN);
        truckList.add(man);
        truckList.add(belaz);
        truckList.add(reno);
        return truckList;
    }
}
