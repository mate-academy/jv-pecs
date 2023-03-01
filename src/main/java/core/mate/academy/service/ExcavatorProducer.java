package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int COUTN = 4;

    @Override
    public List<Excavator> get() {
        return IntStream.range(0, COUTN)
                        .mapToObj(i -> new Excavator())
                        .collect(Collectors.toList());
    }
}
