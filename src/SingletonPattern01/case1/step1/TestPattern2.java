package SingletonPattern01.case1.step1;

public class TestPattern2 {
  static int nNum = 0;

  public static void main(String[] args) {
    Runnable task = () -> {
      nNum++;
      Database database = Database.getInstance(nNum + " Database");
      System.out.println("This is the " + database.getName() + " !!!");
    };

    for (int i = 0; i < 10; i++) {
      Thread t = new Thread(task);
      t.start();
    }
  }
}
