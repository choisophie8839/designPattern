package DecoratorPattern07.case1.base;

public class IceCreamCone extends IceCream {

  public IceCreamCone() {
    this.description = "IceCream(Cone)";
  }

  @Override
  public int price() {
    return 1200;
  }
}
