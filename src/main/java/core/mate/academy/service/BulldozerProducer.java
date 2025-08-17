package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {

        Bulldozer smallDozer = new Bulldozer("Hydrostatic Transmission",
                                            13270,
                                            "Cat C4.4");
        Bulldozer largeDozer = new Bulldozer("3-speed planetary powershift",
                                            70170,
                                            "Cat C27");
        Bulldozer wheelDozer = new Bulldozer("Cat Planetary Power Shift",
                                            74880,
                                            "Cat C27");
        return List.of(smallDozer, largeDozer, wheelDozer);
    }
}
