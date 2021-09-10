package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final LocalDateTime DATE_TIME = LocalDateTime.now();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(1, "BigBulldozer", "Stark-bulldozers-corp.", DATE_TIME));
        bulldozers.add(new Bulldozer(2, "BigBulldozer", "Stark-bulldozers-corp.", DATE_TIME));
        bulldozers.add(new Bulldozer(3, "BigBulldozer", "Stark-bulldozers-corp.", DATE_TIME));
        return bulldozers;
    }
}
