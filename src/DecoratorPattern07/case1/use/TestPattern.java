package DecoratorPattern07.case1.use;

import DecoratorPattern07.case1.base.IceCream;
import DecoratorPattern07.case1.base.IceCreamCake;
import DecoratorPattern07.case1.base.IceCreamCone;
import DecoratorPattern07.case1.base.IcePop;
import DecoratorPattern07.case1.decorator.Melon;
import DecoratorPattern07.case1.decorator.Strawberry;

public class TestPattern {

  public static void main(String[] args) {
    IceCream iceCream1 = new IceCreamCone();
    System.out.println(iceCream1.getDescription() + " cost : " + iceCream1.price());

    IceCream iceCream2 = new IceCreamCake();
    iceCream2 = new Strawberry(iceCream2);
    System.out.println(iceCream2.getDescription() + " cost : " + iceCream2.price());

    IceCream iceCream3 = new Melon(new Strawberry(new IcePop()));
    System.out.println(iceCream3.getDescription() + " cost : " + iceCream3.price());
  }
}
