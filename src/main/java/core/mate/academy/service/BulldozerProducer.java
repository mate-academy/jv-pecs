package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return new ArrayList<>(Arrays.asList(new Bulldozer("Bulldozer1", "blue", "123456"),
                new Bulldozer("Bulldozer2", "white", "723456"),
                new Bulldozer("Bulldozer3", "black", "323456")));
    }
}
