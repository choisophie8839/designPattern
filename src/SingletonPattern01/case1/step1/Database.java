package SingletonPattern01.case1.step1;

public class Database {
  private static Database singleton;
  private String name;

  public String getName() {
    return name;
  }

  //constructor should be "private"
  private Database(String name) {
/*    super();
    this.name = name;*/
    //This delays creating object for 100millis.
    try {
      Thread.sleep(100);
      this.name = name;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static Database getInstance(String name) {
    if (singleton == null) {
      singleton = new Database(name);
    }
    return singleton;
  }
}
