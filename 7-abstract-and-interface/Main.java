/**
 * 추상클래스와 인터페이스를 이용하여 3차원 벡터 값 다루기
 */
public class Main {
  public static void main(String[] args) {
    Vector3 v1 = new Vector3(1, 2, 3);
    Vector3 v2 = new Vector3(4, 5, 6);
    assert v1.size() == 3.7416575f;
    assert v2.size() == 8.774964f;
    assert v1.compareTo(v2) == -1;
    assert v1.equals(v1.clone());
    assert v1.greaterThan(v1.clone()) == false;
    assert v1.lessThan(v2) == true;
    assert v1.greaterThanOrEqual(v1.clone()) == true;
    assert v1.lessThanOrEqual(v2) == true;
    System.out.println("All tests passed!");
  }
}

/**
 * Clonable 인터페이스는 객체를 깊은 복사할 수 있도록 합니다.
 * 이 인터페이스를 구현하는 모든 클래스는 Clonable 인터페이스의 구현 요구사항을 충족해야 합니다.
 */
public interface Cloneable {
  public Object clone();
}

/**
 * Comparable 인터페이스는 같은 타입의 두 객체를 비교할 수 있도록 한다.
 */
public interface Comparable {
  /**
   * compareTo 메서드
   */
  // o보다 크면 1, 같으면 0, 작으면 -1을 반환하도록 구현해야 한다.
  public int compareTo(Object o);
  
  public boolean equals(Object o);
  public boolean greaterThan(Object o);
  public boolean lessThan(Object o);
  public boolean greaterThanOrEqual(Object o);
  public boolean lessThanOrEqual(Object o);
}

public abstract class Vector {
  public float[] values;
  public abstract float size();
}

public class Vector3 extends Vector implements Cloneable, Comparable {
  public Vector3(float x, float y, float z) {
    this.values = new float[] {x, y, z};
  }

  public float size() {
    return (float) Math.sqrt(Math.pow(this.values[0], 2) + Math.pow(this.values[1], 2) + Math.pow(this.values[2], 2));
  }

  public Object clone() {
    return new Vector3(this.values[0], this.values[1], this.values[2]);
  }

  public int compareTo(Object o) {
    Vector3 v = (Vector3) o;
    if (this.size() > v.size()) {
      return 1;
    } else if (this.size() < v.size()) {
      return -1;
    } else {
      return 0;
    }
  }

  public boolean equals(Object o) {
    Vector3 v = (Vector3) o;
    return this.size() == v.size();
  }

  public boolean greaterThan(Object o) {
    Vector3 v = (Vector3) o;
    return this.size() > v.size();
  }

  public boolean lessThan(Object o) {
    Vector3 v = (Vector3) o;
    return this.size() < v.size();
  }

  public boolean greaterThanOrEqual(Object o) {
    Vector3 v = (Vector3) o;
    return this.size() >= v.size();
  }

  public boolean lessThanOrEqual(Object o) {
    Vector3 v = (Vector3) o;
    return this.size() <= v.size();
  }
}
