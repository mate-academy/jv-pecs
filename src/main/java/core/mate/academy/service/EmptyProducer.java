package core.mate.academy.service;

import java.util.List;

public class EmptyProducer implements MachineProducer {
    public List get() {
        return List.of();
    }
}
