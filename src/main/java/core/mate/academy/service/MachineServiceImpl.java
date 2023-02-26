package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> result;
        switch (type.getSimpleName()) {
            case "Bulldozer":
                BulldozerProducer bulldozerProducer = new BulldozerProducer();
                return bulldozerProducer.get();
            case "Excavator":
                ExcavatorProducer excavatorProducer = new ExcavatorProducer();
                return excavatorProducer.get();
            case "Truck":
                TruckProducer truckProducer = new TruckProducer();
                return truckProducer.get();
            default:
                result = Collections.emptyList();
        }
        return result;
    }
    
    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
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
