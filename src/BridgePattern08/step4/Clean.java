package BridgePattern08.step4;

public class Clean extends IAction {

  public Clean(IRobot robot) {
    super(robot);
  }

  public void doClean () {
    System.out.println("clean");
  }
}
