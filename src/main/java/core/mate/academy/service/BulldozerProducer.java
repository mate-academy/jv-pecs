package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("bul2342", "black");
        Bulldozer bulldozer2 = new Bulldozer("bul2342", "red");
        Bulldozer bulldozer3 = new Bulldozer("bul1231", "green");

        bulldozer1.setPower(1000);
        bulldozer2.setPower(3000);
        bulldozer3.setPower(2000);

        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
