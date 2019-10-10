package AdapterPattern05.case2;

public class TestPattern {

  public static void main(String[] args) {
    APlayer player1 = new AplayerImpl();
    player1.play("aaa.mp3");

    BPlayer player2 = new BPlayerImpl();
    player2.playFile("bbb.mp3");

    APlayer player3 = new BToAAdapter();
    player3.play("ccc.mp3");

    //Imagine that every codes are made based on APlayer interface.
    // so if you only change the object for the interface, you don't need to revise other codes except the adapter.
  }
}
