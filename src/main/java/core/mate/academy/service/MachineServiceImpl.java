package core.mate.academy.service;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<Machine> implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        return null;
    }

    @Override
    public void fill(List<? super Machine> list, Object value) {

    }

    @Override
    public void startWorking(List<? extends Machine> list) {

    }
}
