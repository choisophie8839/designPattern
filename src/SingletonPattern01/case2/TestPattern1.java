package SingletonPattern01.case2;

public class TestPattern1 {

  public static void main(String[] args) {
    LogWriter logWriter;

    logWriter = LogWriter.getInstance();
    logWriter.log("Sheldon");

    logWriter = LogWriter.getInstance();
    logWriter.log("Leonardo");
  }
}
