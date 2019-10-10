package DecoratorPattern07.case1.base;

public class IcePop extends IceCream {

  public IcePop() {
    this.description = "IceCream(Pop)";
  }

  @Override
  public int price() {
    return 1000;
  }
}
