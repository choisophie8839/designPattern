package DecoratorPattern07.case1.decorator;

import DecoratorPattern07.case1.base.IceCream;

public class Strawberry extends Decorator {
  IceCream iceCream;

  public Strawberry(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public String getDescription() {
    return iceCream.getDescription() + " + Strawberry";
  }

  @Override
  public int price() {
    return 500 + iceCream.price();
  }
}
