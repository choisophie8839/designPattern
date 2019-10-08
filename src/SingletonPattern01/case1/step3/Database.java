package SingletonPattern01.case1.step3;

public class Database {
  private static Database singleton = new Database("products");
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

  //"synchronized" is expensive
  public static Database getInstance(String name) {
    return singleton;
  }
}
