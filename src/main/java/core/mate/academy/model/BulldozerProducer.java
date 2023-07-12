package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        firstBulldozer.setName("Caterpillar");
        firstBulldozer.setColor("Yellow");
        firstBulldozer.setDumpArea(25.2);
        Bulldozer secondBulldozer = new Bulldozer();
        secondBulldozer.setName("Komatsu");
        secondBulldozer.setColor("Orange");
        secondBulldozer.setDumpArea(24.8);
        List<Machine> bulldozerList = List.of(firstBulldozer, secondBulldozer);
        return bulldozerList;
    }
}
