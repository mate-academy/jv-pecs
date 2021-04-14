package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer {

    @Override
    public List<Machine> get() {
        Truck ford = new Truck("Ford", "Blue", "Ford F-150");
        Truck gmc = new Truck("GMC", "Grey", "Canyon");
        Truck ram = new Truck("RAM", "Purple", "1500S");
        return List.of(ford, gmc, ram);
    }
}
