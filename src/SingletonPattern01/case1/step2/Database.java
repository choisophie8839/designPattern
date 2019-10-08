package SingletonPattern01.case1.step2;

public class Database {
  private static Database singleton;
  private String name;

  public String getName() {
    return name;
  }

  //This thread is for making actual environment.
  private Database(String name) {
    try {
      Thread.sleep(100);
      this.name = name;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  //if you add "synchronized" request will be lined up so that only one object will be created
  public synchronized static Database getInstance(String name) {
    if (singleton == null) {
      singleton = new Database(name);
    }
    return singleton;
  }
}
