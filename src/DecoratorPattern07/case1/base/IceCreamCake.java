package DecoratorPattern07.case1.base;

public class IceCreamCake extends IceCream {

  public IceCreamCake() {
    this.description = "IceCream(Cake)";
  }

  @Override
  public int price() {
    return 1500;
  }
}
