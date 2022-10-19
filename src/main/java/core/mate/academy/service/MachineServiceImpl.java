package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private BuldozerProducer buldozerProducer = new BuldozerProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private TruckProducer truckProducer = new TruckProducer();
    private MachineProducer machineProducer;

    public MachineProducer getMachineService(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            return machineProducer = new BuldozerProducer();
        } else if (type.equals(Excavator.class)) {
            return machineProducer = new ExcavatorProducer();
        } else if (type.equals(Truck.class)) {
            return machineProducer = new TruckProducer();
        }
        return ArrayList::new;
    }

    @Override
    public List<? extends Machine> getAll(Class type) {
        List<? extends Machine> machines = getMachineService(type).get();
        return machines;
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i,value);
        }
    }
}
