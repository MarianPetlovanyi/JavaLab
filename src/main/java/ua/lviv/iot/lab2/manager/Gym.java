package ua.lviv.iot.lab2.manager;

import ua.lviv.iot.lab2.hierarchy.Machine;

public class Gym {

  public Machine[] getAvailableMachines() {
    return availableMachines;
  }

  public void setAvailableMachines(Machine[] availableMachines) {
    this.availableMachines = availableMachines;
  }

  private Machine[] availableMachines;

  public Manager getManager() {
    return manager;
  }

  Manager manager;

  public Gym(Manager manager) {
    this.manager = manager;
    this.availableMachines = this.manager.getArrOfMachines();
  }

}
