package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineProducerImp implements MachineProducer<Machine> {

    @Override
    public List<? extends Machine> get(Class type) {
        List<Machine> machines = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Machine machine = createMachine(type);
            if (machine == null) {
                return machines;
            } else {
                machine.setColor("Color" + i);
                machine.setName("name" + i);
            }
            machines.add(machine);
        }
        return machines;
    }

    private Machine createMachine(Class type) {
        if (Excavator.class.equals(type)) {
            return new Excavator();
        }
        if (Bulldozer.class.equals(type)) {
            return new Bulldozer();
        }
        if (Truck.class.equals(type)) {
            return new Truck();
        }
        return null;
    }
}
