package SingletonPattern01.case2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogWriter {
  private static LogWriter singleton = new LogWriter();
  private static BufferedWriter bufferedWriter;

  private LogWriter() {
    try {
      bufferedWriter = new BufferedWriter(new FileWriter("log.txt"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static LogWriter getInstance() {
    return singleton;
  }

  public synchronized void log(String str) {
    try {
      bufferedWriter.write(str + "\n");
      bufferedWriter.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  protected void finalize() {
    try {
      super.finalize();
      bufferedWriter.close();
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
  }

}
