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
    private List<Truck> truckList;
    private List<Bulldozer> bulldozerList;
    private List<Excavator> excavatorList;

    public MachineServiceImpl() {
        truckList = new TruckProducer().get();
        bulldozerList = new BulldozerProducer().get();
        excavatorList = new ExcavatorProducer().get();
    }

    @Override
    public List getAll(Class type) {
        switch (type.getSimpleName()) {
            case "Truck": {
                return truckList;
            }
            case "Bulldozer": {
                return bulldozerList;
            }
            case "Excavator": {
                return excavatorList;
            }
            default: {
                return new ArrayList<>();
            }
        }
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
