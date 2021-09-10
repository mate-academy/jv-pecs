package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(1,"BigBulldozer","Stark-corp.", LocalDateTime.now()));
        bulldozers.add(new Bulldozer(2,"MiddleBulldozer","Stark-corp.", LocalDateTime.now()));
        bulldozers.add(new Bulldozer(3,"SmallBulldozer","Stark-corp.", LocalDateTime.now()));
        return bulldozers;
    }
}
