package BridgePattern08.step4;

public class Cook extends IAction {

  public Cook(IRobot robot) {
    super(robot);
  }

  public void doCook() {
    System.out.println("cook");
  }
}
