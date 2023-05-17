package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private MachineProducer<Bulldozer> bulldozerMachineProducer = new BulldozerProducer();
    private MachineProducer<Excavator> excavatorMachineProducer = new ExcavatorProducer();
    private MachineProducer<Truck> truckMachineProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class type) {
        return (type == Truck.class) ? new ArrayList<>(truckMachineProducer.get()) :
                (type == Bulldozer.class) ? new ArrayList<>(bulldozerMachineProducer.get()) :
                        (type == Excavator.class) ? new ArrayList<>(excavatorMachineProducer.get())
                                : new ArrayList<>();
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
