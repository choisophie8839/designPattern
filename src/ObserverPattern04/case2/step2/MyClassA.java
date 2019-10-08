package ObserverPattern04.case2.step2;

public class MyClassA implements Observer {
  Publisher observable;
  private boolean bPlay;

  public MyClassA(Publisher o) {
    this.observable = o;
    observable.addObserver(this);
  }

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
