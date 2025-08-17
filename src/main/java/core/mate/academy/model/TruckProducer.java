package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> TruckList = new ArrayList<>();
        TruckList.add(new Truck("Red" , "Vpered" , "leto"));
        TruckList.add(new Truck("Pink" , "Ryl" , "vesna"));
        TruckList.add(new Truck("Black" , "Bomba" , "osen"));
        return TruckList;
    }
}
