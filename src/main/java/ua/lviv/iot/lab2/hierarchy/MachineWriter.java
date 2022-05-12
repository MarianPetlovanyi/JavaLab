package ua.lviv.iot.lab2.hierarchy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MachineWriter {

  public void writeToFile(Machine[] machines, String fileName) throws IOException {
    final BufferedWriter writer;
    File file = new File(fileName + ".csv");
    writer = new BufferedWriter(new FileWriter(file));
    try {
      
      writer.write(machines[0].getHeaders() + "\n");
      for (Machine machine : machines) {
        writer.write(machine.toCSV() + "\n");
        writer.flush();
      }
      
    } finally {
      writer.close();

    }
  }
}
