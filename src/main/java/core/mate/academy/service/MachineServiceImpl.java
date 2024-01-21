package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private enum TypeEnum {
        TRUCK,
        BULLDOZER,
        EXCAVATOR,
        MACHINE
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        TypeEnum typeEnum = TypeEnum.valueOf(type.getSimpleName().toUpperCase());
        switch (typeEnum) {
            case EXCAVATOR:
                ExcavatorProducer excavatorProducer = new ExcavatorProducer();
                return new ArrayList<>(excavatorProducer.get());
            case BULLDOZER:
                BulldozerProducer bulldozerProducer = new BulldozerProducer();
                return new ArrayList<>(bulldozerProducer.get());
            case TRUCK:
                TruckProducer truckProducer = new TruckProducer();
                return new ArrayList<>(truckProducer.get());
            case MACHINE:
            default:
                return Collections.emptyList();
        }
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            try {
                machines.get(i).getClass().getMethod("doWork").invoke(machines.get(i));
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                System.out.println("The method isn't found");
            }
        }
    }
}
