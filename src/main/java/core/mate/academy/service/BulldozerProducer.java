
package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        Bulldozer bulldozer = new Bulldozer();
        list.add(bulldozer);
        return list;
    }
}
