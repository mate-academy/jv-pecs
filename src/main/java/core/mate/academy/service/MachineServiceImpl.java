package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List getAll(Class type) {
        List<? extends Machine> listOfMachines;
        switch (type.getSimpleName()) {
            case "Truck": {
                listOfMachines = new TruckProducer().get();
                break;
            }
            case "Bulldozer": {
                listOfMachines = new BulldozerProducer().get();
                break;
            }
            case "Excavator": {
                listOfMachines = new ExcavatorProducer().get();
                break;
            }
            default: {
                listOfMachines = new ArrayList<>();
                break;
            }
        }
        return new ArrayList(listOfMachines);
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
            machine.doWork();
        }
    }
}
