package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int COUNT = 5;

    @Override
    public List<Bulldozer> get() {
        return IntStream.range(0, COUNT)
                        .mapToObj(i -> new Bulldozer())
                        .collect(Collectors.toList());
    }
}
