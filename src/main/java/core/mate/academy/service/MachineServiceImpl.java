package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        ExcavatorProducer excavatorProducer = new ExcavatorProducer();
        BulldozerProducer bulldozerProducer = new BulldozerProducer();
        TruckProducer truckTruckProducer = new TruckProducer();

        List<Machine> excavatorList = new ArrayList<>(excavatorProducer.get());
        List<Machine> bulldozerList = new ArrayList<>(bulldozerProducer.get());
        List<Machine> truckList = new ArrayList<>(truckTruckProducer.get());

        return type.equals(Excavator.class) ? excavatorList
                : type.equals(Bulldozer.class) ? bulldozerList
                : type.equals(Truck.class) ? truckList
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
