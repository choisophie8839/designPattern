package ObserverPattern04.case2.step1;

public class MyClassA implements Observer {
  private boolean bPlay;

  @Override
  public void update(boolean play) {
    this.bPlay = play;
    myActControl();
  }

  public void myActControl() {
    if (bPlay) {
      System.out.println("MyClassA :  동작을 시작합니다.");
    } else {
      System.out.println("MyClassA :  동작을 정지합니다.");
    }
  }
}
