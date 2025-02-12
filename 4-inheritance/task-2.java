/**
 * 과제 2
 * 작성된 코드를 읽고 성공적으로 GameManager의 play 메서드를 호출하여라.
 */

public class Main {
  public static void main(String[] args) {
    // 코드 작성 시작







    // 코드 작성 끝
  }
}

/**
 * 아래 코드는 수정해선 안된다.
 */
public enum GameState {
  PLAY,
  PAUSE,
  STOP
}

public class GameManager {
  public GameState state;

  private static GameManager _instance;

  public static GameManager get() {
    if (GameManager._instance == null) {
      GameManager._instance = new GameManager();
    }
    return GameManager._instance;
  }

  private GameManager() {
    this.state = GameState.STOP;
  }

  public void play() {
    this.state = GameState.PLAY;
    System.out.println("GameManager: play");
  }
}
