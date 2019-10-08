package ObserverPattern04.case2.step1;

public class TestPattern {

  public static void main(String[] args) {
    PlayController pager = new PlayController();
    Observer ob1 = new MyClassA();
    Observer ob2 = new MyClassB();

    //Sign up for Observer
    pager.addObserver(ob1);
    pager.addObserver(ob2);

    //register message
    pager.setFlag(false);

    //stop observing
    pager.deleteObserver(ob2);

    System.out.println("-------------------------");

    //sign up for message
    pager.setFlag(true);
  }
}
