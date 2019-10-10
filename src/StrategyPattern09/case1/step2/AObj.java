package StrategyPattern09.case1.step2;

public class AObj {
  BInterface bInterface;

  public AObj() {
    bInterface = new BImplement();
  }

  public void SomeFunc() {
    //System.out.println("AAA");
    //System.out.println("AAA");

    //To make same function above, ask b to make it.
    //Delegate it.
    bInterface.funcA();
    bInterface.funcA();
  }
}
