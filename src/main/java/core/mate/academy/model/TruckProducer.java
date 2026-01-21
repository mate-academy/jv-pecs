package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> truck = new ArrayList<>();

        Truck hyundai_H350 = new Truck();
        hyundai_H350.setLoadCapacity(2);

        Truck scania_R500 = new Truck();
        scania_R500.setLoadCapacity(39);

        Truck dAF_XF_Electric = new Truck();
        dAF_XF_Electric.setLoadCapacity(25);

        truck.add(hyundai_H350);
        truck.add(scania_R500);
        truck.add(dAF_XF_Electric);

        return truck;
    }
}
