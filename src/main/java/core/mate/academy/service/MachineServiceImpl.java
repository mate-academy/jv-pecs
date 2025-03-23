package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.producers.BulldozerProducer;
import core.mate.academy.service.producers.ExcavatorProducer;
import core.mate.academy.service.producers.TruckProducer;
import java.util.List;

public class MachineServiceImpl<T> {

  BulldozerProducer bd = new BulldozerProducer();
  TruckProducer tp = new TruckProducer();
  ExcavatorProducer ex = new ExcavatorProducer();

  List<? extends Machine> getAll(Class<T> type) {

    if (type == Truck.class) {
      return tp.get();
    } else if (type == Bulldozer.class) {
      return bd.get();
    } else if (type == Excavator.class) {
      return ex.get();
    }
    return List.of();
  }

  void fill(List<T> machines, T value) {
    for (T m : machines) {
      m = value;
    }
  }

  public void startWorking(List<? extends Machine> machines) {
    for (Machine machine : machines) {
      machine.doWork();
    }
  }
}
