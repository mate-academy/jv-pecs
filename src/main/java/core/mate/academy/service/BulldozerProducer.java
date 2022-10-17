package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final double DEFAULT_BUCKET_VOLUME = 12d;
    private final List<Bulldozer> bulldozerList;

    public BulldozerProducer() {
        this.bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(DEFAULT_BUCKET_VOLUME));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
