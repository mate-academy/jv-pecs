package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer crawlerBull = new Bulldozer("S-Blade", 12000);
    private Bulldozer wheelBull = new Bulldozer("U-Blade", 15000);
    private Bulldozer miniBull = new Bulldozer("Semi-U Blade", 2500);

    @Override
    public List<Bulldozer> get() {
        return Arrays.asList(crawlerBull, wheelBull, miniBull);
    }
}
