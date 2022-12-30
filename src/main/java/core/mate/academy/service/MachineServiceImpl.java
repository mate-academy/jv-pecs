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
    private BulldozerSupplier bulldozer = new BulldozerSupplier();
    private ExcavatorSupplier excavator = new ExcavatorSupplier();
    private TruckSupplier truck = new TruckSupplier();

    @Override
    public List getAll(Class<? extends Machine> type) {
        List<? super Machine> listOfMachinery = new ArrayList<>();
        if (Bulldozer.class.equals(type)) {
            listOfMachinery = bulldozer.get();
        } else if (Excavator.class.equals(type)) {
            listOfMachinery = excavator.get();
        } else if (Truck.class.equals(type)) {
            listOfMachinery = truck.get();
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
            machine.doWork();
        }
    }
}
