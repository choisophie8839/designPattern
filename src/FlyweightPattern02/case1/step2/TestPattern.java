package FlyweightPattern02.case1.step2;

public class TestPattern {
  public static void main(String[] args) {
    MyData myData1 = new MyData();
    myData1.xpos = 10;
    myData1.ypos = 11;
    myData1.name = "Sheldon";

    MyData myData2 = new MyData();
    myData2 = myData1;

    MyData myData3 = new MyData();
    myData3.xpos = 20;
    myData3.ypos = 21;
    myData3.name = "Penny";

    myData2.name = "Leonard";
    myData2.xpos = 5;
  }
}

class MyData {
  int xpos;
  int ypos;
  String name;
}
