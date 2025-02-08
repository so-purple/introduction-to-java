/**
 * Task 1
 * 아래 소스코드가 동작하도록 소스코드를 완성하여라.
 */

public class Main {
  public static void main(String []args) {
    Player player1 = new Player(
      "John", // 이름
      5, // 레벨
      100f // 체력
    );

    /**
     * (배우지 않은 문법)
     * assert (condition)
     * condition이 참이 아니면 프로그램이 오류를 발생하고 종료된다.
     */
    Player player2 = new Player();
    // 아래 조건이 참이어야 아래 assert 문이 오류를 발생하지 않는다.
    // 아래 조건이 참일 수 있도록 생성자를 작성하여야 한다.
    assert player2.name.equals("");
    assert player2.level == 1;
    assert player2.health == 100f;

    player1.levelUp();
    player1.getAttack(10);
    player2.levelUp(2);
    player2.getAttack(5.5f);

    printPlayer(player1);
  }
}

public class Player {
  Player(String name, int level, float health)  {
    this.name = name;
    this.level = level;
    this.health = health;
  }
}
