public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    Mob mob = new Mob("Zombie", 100, 10);
    Player player = new Player("Player", 100, 10, "Player1");
    Player newPlayer = new Player();

    mob.printInfo();
    player.printInfo();

    mob.setHealth(1);
    mob.printInfo();
    mob.setHealth(2.5f);
    mob.printInfo();

    player.setHealth(3);
    player.printInfo();
    player.setHealth(4.5f);
    player.printInfo();
  }
}

public class Mob {
  public String name;
  public float health;
  public int speed;
  public Mob(String name, float health, int speed) {
    this.name = name;
    this.health = health;
    this.speed = speed;
  }

  public void printInfo() {
    System.out.println("Name: " + name + " Health: " + health + " Speed: " + speed);
  }

  // 메서드 오버로딩
  private void setHealth(int health) {
    System.out.println("void Mob.setHealth(int)");
    this.health = (float)health;
  }

  private void setHealth(float health) {
    System.out.println("void Mob.setHealth(float)");
    this.health = health;
  }
}

// `extends <classname>` => `classname`을 상속받음
// `super`               => 부모 클래스를 가리킴
// `super.<method>`      => 부모 클래스의 메서드를 호출
// `super()`             => 부모 클래스의 생성자를 호출
public class Player extends Mob {
  public String playerName;

  public Player(String name, float health, int speed, String playerName) {
    super(name, health, speed);
    this.playerName = playerName;
  }
  
  public Player() {
    super("Player", 100, 10);
    this.playerName = "Player1";
  }

  public void printInfo() {
    super.printInfo();
    System.out.println("Name: " + name + " Health: " + health + " Speed: " + speed + " Player Name: " + playerName);
  }

  // 메서드 오버라이딩 + 오버로딩
  public void setHealth(int health) {
    System.out.println("void Player.setHealth(int)");
    super.setHealth(health);
  }

  public void setHealth(float health) {
    System.out.println("void Player.setHealth(float)");
    this.health = health;
  }
}
