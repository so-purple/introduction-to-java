public class Main {
  public static void main(String[] args) {
    // 리터럴(Literal): 코드에 직접 입력된 값
    // - 실행 순간에 이미 값이 결정되어 있음
    // - 직접 작성됨: 값이 변하지 않음 (= 읽기 전용)
    int lint = 10;
    float lfloat = 10.0f;

    // - 객체는 리터럴이 아님
    //   아래는 정수 리터럴과 문자열 리터럴을 이용하여 생성자를 호출할 뿐임
    A a = new A(10, "Hello");
    //   객체를 리터럴처럼 사용하고자 할 때 익명 클래스(Anonymous Class)라는 기능이 존재하나
    //   범위 외의 고급 기능임
    //   https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html


    // 객체(Object): 클래스의 구조에 따라 메모리에 올라간 데이터 값
    // - 클래스를 구조물, 형틀이라고 할 때, 객체는 그 형틀에 맞춰진 실제 데이터
    // - 이 객체는 참조형임

    // 참조형
    // - c에서의 포인터 같이 동작함
    A b = a;  // a와 b는 메모리 상의 같은 데이터를 가리킴
              // 즉 a와 b의 주소값은 같음
    a.a = 20;
    System.out.println(b.a); // 20

    // - 객체를 복사하고 싶다면, 참조형이 아닌 값을 직접 복사해야함
    A c = new A(a.a, a.b);
  }
}

public class A {
  public int a;
  public String b;

  public A(int a, String b) {
    this.a = a;
    this.b = b;
  }
}
