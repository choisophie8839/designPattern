package ObserverPattern04.case2.step2;

public class TestPattern {

  public static void main(String[] args) {
    PlayController controller = new PlayController();
    Observer ob1 = new MyClassA(controller);
    Observer ob2 = new MyClassB(controller);

    System.out.println("-------pause all classes-------");
    //register message
    controller.setFlag(false);

    System.out.println();

    System.out.println("-------restart classes-------");

    //sign up for message
    controller.setFlag(true);
  }
}
