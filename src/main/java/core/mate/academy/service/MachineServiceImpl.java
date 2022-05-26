package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final String BULLDOZER = "Bulldozer";
    private static final String EXCAVATOR = "Excavator";
    private static final String TRUCK = "Truck";

    @Override
    public List<Machine> getAll(Class type) {
        MachineProducer<? extends Machine> producer;
        switch (type.getSimpleName()) {
            case BULLDOZER:
                producer = new BulldozzerProducer();
                break;
            case EXCAVATOR:
                producer = new ExcavatorProducer();
                break;
            case TRUCK:
                producer = new TruckProducer();
                break;
            default:
                return new ArrayList<Machine>();
        }
        return (List<Machine>) producer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
