package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("CAT C32B", "water truck", "yellow"));
        list.add(new Truck("CAT 798 AC", "mining truck", "green"));
        list.add(new Truck("CAT 777", "off highway truck", "black"));
        return list;
    }
}
