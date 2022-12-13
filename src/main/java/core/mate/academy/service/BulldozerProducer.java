package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer extends Bulldozer {
    List<? extends Bulldozer> get() {
        return List.of(new Bulldozer(), new Bulldozer(), new Bulldozer());
    }
}
