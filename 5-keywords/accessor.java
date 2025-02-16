public class Main {
  public static void main(String[] args) {
    GameManager gameManager = GameManager.get();
    gameManager.play();
  }
}

public enum GameState {
  PLAY,
  PAUSE,
  STOP
}

/**
 * private 접근 제한자는 외부에서 접근할 수 없다.
 * 
 * 이에 따라, 생성자를 private으로 선언한 GameManager 클래스는 클래스 밖에서 new GameManager()로 객체를 생성할 수 없다.
 * 따라서 GameManager 클래스는 생성자를 GameManager 클래스 내부에서 호출해야한다.
 * 
 * get() 메서드는 public으로 선언되어 있으면서 GameManager 내부에서 GameManager 객체를 생성하고 반환하게 해 준다.
 * 따라서 get() 메서드를 통해 GameManager 객체를 생성하고 사용할 수 있다.
 */

public class GameManager {
  public GameState state;

  /**
   * GameManager 생성자를 private으로 선언하여 외부에서 객체를 생성할 수 없게 하고,
   * GameManager 내부에서 GameManager 객체를 저장할 수 있는 정적 변수를 선언한 후,
   * get() 메서드를 통해 GameManager 객체를 생성하고 반환하게 한다.
   * 
   * get() 메서드는 내부에 정적 변수에 이 객체가 생성되어 있지 않을 때만 객체를 생성하여,
   * GameManager 객체가 항상 1개만 존재함을 보장한다.
   */
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
