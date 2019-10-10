package BridgePattern08.step3;

// want to add function without changing IRobot interface.
public class IAction {
  private IRobot robot;

  public IAction(IRobot robot) {
    this.robot = robot;
  }

  // make all functions from IRobot
  void powerOn() {
    robot.powerOn();
  }

  void powerOff() {
    robot.powerOff();
  }
}
