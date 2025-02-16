public class Main {
  public static void main(String[] args) {
    // Class<Type> variable = new Class<Type>(value);
    // 생성자 호출 시 <> 안은 생략 가능하나, 되도록 작성할 것
    // Type은 참조형만 가능
    Box<Integer> box1 = new Box<Integer>(1);
    Box<Float> box2 = new Box<>(2.5f);
    Box<String> box3 = new Box<>("Hello, World!");

    Container<String> container = new Container<>();
    System.out.println(container.<Float>get((float)3));

    System.out.println(box1.get());
    System.out.println(box2.get());
    System.out.println(box3.get());
  }
}

public class Box<T> {
  private T value;

  public T get() {
    return value;
  }

  public void set(T value) {
    this.value = value;
  }

  public Box(T value) {
    this.value = value;
  }
}

public class Container<T> {
  public <S> S get(S value) {
    return value;
  }
}
