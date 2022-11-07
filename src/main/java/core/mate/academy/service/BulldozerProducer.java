package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        firstBulldozer.setPower(240);
        firstBulldozer.setColor("Red");
        firstBulldozer.setName("FirstBulldozer");
        Bulldozer secondBulldozer = new Bulldozer();
        secondBulldozer.setPower(320);
        secondBulldozer.setColor("Yellow");
        secondBulldozer.setName("SecondBulldozer");
        Bulldozer thirdBulldozer = new Bulldozer();
        thirdBulldozer.setPower(290);
        thirdBulldozer.setColor("Blue");
        thirdBulldozer.setName("ThirdBulldozer");
        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
