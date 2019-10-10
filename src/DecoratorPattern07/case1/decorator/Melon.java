package DecoratorPattern07.case1.decorator;

import DecoratorPattern07.case1.base.IceCream;

public class Melon extends Decorator {

  IceCream iceCream;

  public Melon(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public String getDescription() {
    return iceCream.getDescription() + " + Melon";
  }

  @Override
  public int price() {
    return 300 + iceCream.price();
  }
}
