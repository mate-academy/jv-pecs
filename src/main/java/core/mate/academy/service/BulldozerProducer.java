package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("bulldozer1", "red");
        Bulldozer bulldozer2 = new Bulldozer("bulldozer2", "green");
        Bulldozer bulldozer3 = new Bulldozer("bulldozer3", "blue");

        bulldozer1.setPower(1000);
        bulldozer2.setPower(2000);
        bulldozer3.setPower(3000);

        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
