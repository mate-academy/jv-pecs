package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
  @Override
  public List<Bulldozer> get() {
    Bulldozer bulldozer1 = new Bulldozer(15, 250);
    Bulldozer bulldozer2 = new Bulldozer(35, 300);
    Bulldozer bulldozer3 = new Bulldozer(10, 345);
    return List.of(bulldozer1, bulldozer2, bulldozer3);
  }
}
