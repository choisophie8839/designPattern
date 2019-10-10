package FacadePattern06.case2;

public class TestPattern {

  public static void main(String[] args) {
    Computer computer = new Computer();
    Light light = new Light();
    Radio radio = new Radio();

    // Before the facade pattern
    computer.turnOff();
    light.turnOff();
    radio.turnOff();

    // After the facade pattern
    HomeFacade homeFacade = new HomeFacade(computer, light, radio);
    homeFacade.homeIn();
  }
}
