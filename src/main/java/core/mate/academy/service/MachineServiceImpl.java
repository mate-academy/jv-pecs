package core.mate.academy.service;

import core.mate.academy.model.Machine;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T>{


    @Override
    public List<T> getAll(Class<? extends T> type) {
        return null;
    }

    @Override
    public void fill(List<Object> machines, T value) {

    }

    @Override
    public void startWorking(List<? extends T> machines) {

    }
}
