public class Main {
  // * 주의: 프로그램 진입점은
  // 처음으로 선언된 클래스의 static void main(String[] args) 함수이다.
  public static void main(String[] args) {
    Account acc = new Account();
    acc.name = "John";
    acc.password = "1234";

    System.out.println("Name: " + acc.name);
    System.out.println("Password: " + acc.password);

    acc.changePassword("5678");
    System.out.println("New password: " + acc.password);
  }
}

public class Account {
  String name;
  String password;

  // 클래스는 구조체와 함수를 합친 것이라고 볼 수 있다.
  // 그래서 클래스 아래에 함수를 선언할 수 있다.
  // 이 함수를 메서드라고 부른다.
  void changePassword(String newPassword) {
    password = newPassword;
  }
}
