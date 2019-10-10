package BridgePattern08.step2;

import BridgePattern08.step1.IRobot;

public class RobotModel2 implements IRobot {

  @Override
  public void powerOn() {
    System.out.println("type2 : power on");
  }

  @Override
  public void powerOff() {
    System.out.println("type2 : power off");
  }

  public void doCook() {
    System.out.println("cook!");
  }
}
