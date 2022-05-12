package ua.lviv.iot.lab2.hierarchy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MachineWriter {

  public void writeToFile(Machine[] machines, String fileName) {
    File file = new File(fileName + ".csv");

    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(file));
      writer.write(machines[0].getHeaders() + "\n");
      for (Machine machine : machines) {
        writer.write(machine.toCSV() + "\n");

      }
      writer.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}