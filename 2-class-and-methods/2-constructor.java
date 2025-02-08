public class Main {
  public static void main(String[] args) {
    // 아래와 같이 Vector2를 자료형으로 갖는 데이터를 Vector2 **객체(object)**라고 한다.
    // Vector2 객체를 생성하는 방법은 new 키워드를 사용하는 것이다.
    Vector2 pos1 = new Vector2();
    Vector2 pos2 = new Vector2(2, 3);

    Vector2(1, 2);  // 이렇게 호출하면 안된다. *1
  }

  // *1
  // new 없이 생성자를 호출하려고 하면면 이 함수를 호출하려고 한다.
  // Vector2();
  public static void Vector2(int x, int y) {}
}

public class Vector2 {
  int x, y;

  // 생성자(constructor)는 클래스 이름과 동일한 이름을 함수명으로 적는다
  // 생성자를 선언하면서 반환형은 작성하지 않는다.
  // (작성하면 일반 메서드로 인식한다.)
  public Vector2(int x, int y) {
    // 생성자도 메서드이므로 this 키워드를 사용하여 자기 자신에 접근할 수 있다.
    this.x = x;
    this.y = y;
  }
  public Vector2() {
    // 생성자도 메서드이므로 메서드 오버로딩이 가능하다.
    x = 0;
    y = 0;
  }
}
