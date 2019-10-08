package AdapterPattern05.case1;

public class TestPattern {

  public static void main(String[] args) {
    APlayer player1 = new AplayerImpl();
    player1.play("aaa.mp3");

    // you cannot use AplayerImpl anymore because contract is ended.

    // Bplayer : new way (Should be worked well)
    Bplayer player2 = new BPlayerImpl();
    player2.playFile("bbb.mp3");

    // Aplayer obj = (Adapter) = new BPlayerImpl();
    // You want to use it without change of codes that worked in the past.
    // if this code makes error, you only can see "adapter part"
    player1 = new BToAAdapter(new BplayerImpl());
    player1.play("ccc.mp3");

    //
  }
}
