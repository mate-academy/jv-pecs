package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine>{

  @Override
  public List<Machine> getAll(Class<? extends Machine> type) {
    if (type == Bulldozer.class) {
      List<Bulldozer> machines = new BulldozerProducer().get();
      return new ArrayList<>(machines);
    }
    if (type == Excavator.class) {
      List<Excavator> machines = new ExcavatorProducer().get();
      return new ArrayList<>(machines);
    }
    if (type == Truck.class) {
      List<Truck> machines = new TruckProducer().get();
      return new ArrayList<>(machines);
    }

    return Collections.emptyList();
  }

  @Override
  public void fill(List<? super Machine> machines, Machine value) {
    for (int i = 0; i < machines.size(); i++) {
      machines.set(i, value);
    }

  }

  @Override
  public void startWorking(List<? extends Machine> machines) {
    for (Machine machine: machines) {
      machine.doWork();
    }
  }
}
