package core.mate.academy.service;

import java.util.List;

public interface MachineService {

    List<Object> getAll(Class type);

    void fill(List<Object> machines, Object value);

    void startWorking(List<Object> machines);
}
