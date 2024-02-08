
package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    List<Bulldozer> list = new ArrayList<>();
    Bulldozer bulldozer = new Bulldozer();

    @Override
    public List<Bulldozer> get() {
        list.add(bulldozer);
        return list;
    }
}