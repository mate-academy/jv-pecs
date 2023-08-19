package core.mate.academy.service.producerimpl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        IntStream.range(1, 10)
                .forEach(i -> bulldozers.add(new Bulldozer()));
        return bulldozers;
    }
}
