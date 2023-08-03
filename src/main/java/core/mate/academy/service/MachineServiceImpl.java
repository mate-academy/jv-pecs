package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        MachineProducer machineProducer = getMachineProduser(type.getName());
        if (machineProducer == null) {
            return new ArrayList<Machine>() {
            };
        }
        List<? extends Machine> machines = machineProducer.get();
        return new ArrayList<Machine>(machines);
    }

    private MachineProducer getMachineProduser(String typeFullName) {
        int indexStart = typeFullName.lastIndexOf('.') + 1;
        String typeName = typeFullName.substring(indexStart);
        switch (typeName) {
            case "Excavator": {
                return excavatorProducer;
            }
            case "Bulldozer": {
                return bulldozerProducer;
            }
            case "Truck": {
                return truckProducer;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> list) {
    }
}
