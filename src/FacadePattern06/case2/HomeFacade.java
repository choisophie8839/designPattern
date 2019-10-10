package FacadePattern06.case2;

public class HomeFacade {
  private Computer computer;
  private Light light;
  private Radio radio;

  public HomeFacade(Computer computer, Light light, Radio radio) {
    this.computer = computer;
    this.light = light;
    this.radio = radio;
  }

  public void homeIn () {
    System.out.println("When you come home, turn the computer, light and radio on");
    if (!computer.isTurnedOn()) computer.turnOn();
    if (!light.isTurnedOn()) light.turnOn();
    if (!radio.isTurnedOn()) radio.turnOn();
  }

  public void homeOut() {
    System.out.println("turn the computer, light and radio off");
    if (computer.isTurnedOn()) computer.turnOff();
    if (light.isTurnedOn()) light.turnOff();
    if (radio.isTurnedOn()) radio.turnOff();
  }
}
