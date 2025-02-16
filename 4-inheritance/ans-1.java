public class Main {
  public static void main(String[] args) {
    /**
     * 과제 #1
     * 
     * 다음 클래스를 완성하라
     * Vector3
     * + x: float  // 동-서
     * + y: float  // 상-하
     * + z: float  // 남-북
     * + Vector3(x: float, y: float, z: float)
     * 
     * Entity
     * + position: Vector3
     * 
     * Animal (Entity를 상속받음)
     * + name: String
     * + age: int
     * + speed: float
     * 
     * Frog (Animal을 상속받음)
     * + jump(): void
     *   // 실행 시
     *   // 1. "Frog is jumping" 출력
     *   // 2. position.y에 speed를 더함
     *   // 3. position.y 출력
     */

    // 아래 코드가 정상적으로 동작해야한다.
    Frog frog = new Frog("Kermit", 3, 1.5f, new Vector3(0, 0, 0));
    frog.jump();
    frog.jump();
    frog.jump();
    assert frog.position.y == 4.5f;
  }
}

public class Vector3 {
  public float x;
  public float y;
  public float z;

  public Vector3(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
}

public class Entity {
  public Vector3 position;
}

public class Animal extends Entity {
  public String name;
  public int age;
  public float speed;
}

public class Frog extends Animal {
  public Frog(String name, int age, float speed, Vector3 position) {
    this.name = name;
    this.age = age;
    this.speed = speed;
    this.position = position;
  }

  public void jump() {
    System.out.println("Frog is jumping");
    this.position.y += this.speed;
    System.out.println(this.position.y);
  }
}
