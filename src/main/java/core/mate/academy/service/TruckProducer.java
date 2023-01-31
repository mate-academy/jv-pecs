package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        List<Machine> resultTruck = new ArrayList<>();
        resultTruck.add(new Truck("tr1","t1",10));
        resultTruck.add(new Truck("tr2","t2",20));
        resultTruck.add(new Truck("tr3","t3",30));
        return resultTruck;
    }
}
