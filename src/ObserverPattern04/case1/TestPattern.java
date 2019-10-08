package ObserverPattern04.case1;

public class TestPattern {

  public static void main(String[] args) {
    PlayController playController = new PlayController();
    MyClassA classA = new MyClassA(playController);
    MyClassB classB = new MyClassB(playController);

    System.out.println("----------all class pause---------");
    playController.setFlag(false);

    System.out.println();

    System.out.println("----------all class restart---------");
    playController.setFlag(true);

    System.out.println();
  }
}
