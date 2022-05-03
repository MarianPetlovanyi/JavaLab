package ua.lviv.iot.lab2.hierarchy;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.lab2.manager.Gym;
import ua.lviv.iot.lab2.manager.Manager;

public class MachineWriterTest {
  private Manager manager;
  private Treadmill treadmill1;
  private StationaryBike stationaryBike1;
  private SkippingRope skippingRope1;
  private Gym gym;

  @Test
  public void testWriteToCSV() throws IOException {
    treadmill1 = new Treadmill(10, 5, 5, 10, "treadmill");
    stationaryBike1 = new StationaryBike(20, 10, 10, 1000, "starionarybike");
    skippingRope1 = new SkippingRope(0, 10, 15, "skakalka", 120);
    Machine[] machines = { treadmill1, stationaryBike1, skippingRope1 };
    manager = new Manager(machines);
    gym = new Gym(manager);
    MachineWriter writer = new MachineWriter();
    writer.writeToFile(gym.getAvailableMachines(), "src\\test\\resources\\expected.csv");

  }

}