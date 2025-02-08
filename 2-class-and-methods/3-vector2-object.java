public class Main {
  public static void main(String[] args) {
    // 방법 1
    Vector2 pos1 = new Vector2(10, 20);
    Vector2 pos2 = new Vector2(2, 3);
    Vector2 pos3 = add(pos1, pos2);

    System.out.println("pos1: " + pos1.x + ", " + pos1.y);
    System.out.println("pos2: " + pos2.x + ", " + pos2.y);
    System.out.println("pos3: " + pos3.x + ", " + pos3.y);

    // 방법2
    Vector2 newPos = new Vector2(5, 5);
    newPos.add(
      new Vector2(1, 2)   // (1, 2) 벡터
    );
    newPos.add(1, 2);
    System.out.println("newPos: " + newPos.x + ", " + newPos.y);
  }

  static Vector2 add(Vector2 a, Vector2 b) {
    Vector2 c = new Vector2(a.x + b.x, a.y + b.y);
    return c; 
  }
}

public class Vector2 {
  int x, y;

  public void add(int x, int y) {
    this.x += x;
    this.y += y;
  }

  public void add(Vector2 other) {
    this.x += other.x;
    this.y += other.y;
  }

  // 생성자
  public Vector2(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public Vector2() {
    this.x = 0;
    this.y = 0;
  }
}
