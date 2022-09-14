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
    @Override
    public List<Machine> getAll(final Class<? extends Machine> type) {
        List<Machine> list = new ArrayList<>();
        if(type == Bulldozer.class){
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            list = new ArrayList<>(bulldozerProducer.get());
        }
        if(type == Excavator.class){
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            list = new ArrayList<>(excavatorProducer.get());
        }
        if(type == Truck.class){
            TruckProducer truckProducer = new TruckProducer();
            list = new ArrayList<>(truckProducer.get());
        }
        return list;
    }

    @Override
    public void fill(final List<? super Machine> machines, final Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i,value);
        }
    }

    @Override
    public void startWorking(final List<? extends Machine> machines) {
        for (final Machine machine : machines) {
            machine.doWork();
        }
    }
}
