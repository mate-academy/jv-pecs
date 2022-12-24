package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private Machine machine;

    @Override
    public List getAll(Class<? extends Machine> type) {
        List<? extends Machine> listOfMachinery = new ArrayList<>();
        if (Bulldozer.class.equals(type)) {
            machine = new Bulldozer();
            listOfMachinery = machine.get();
        } else if (Excavator.class.equals(type)) {
            machine = new Excavator();
            listOfMachinery = machine.get();
        } else if (Truck.class.equals(type)) {
            machine = new Truck();
            listOfMachinery = machine.get();
        }
        return listOfMachinery;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            if (machine.getClass() == Bulldozer.class) {
                Bulldozer bulldozer = new Bulldozer();
                machine.doWork();
            } else if (machine.getClass() == Excavator.class) {
                Excavator excavator = new Excavator();
                machine.doWork();
            } else {
                Truck truck = new Truck();
                machine.doWork();
            }
        }
    }
}
