/**
 * static 키워드
 * - static 키워드는 클래스 변수, 클래스 메서드, static 블록에 사용할 수 있다.
 * - static 키워드가 붙은 변수나 함수는 클래스 내에서 공유된다.
 * 
 * - static 키워드가 붙은 변수나 메서드는 인스턴스를 생성하지 않아도 사용할 수 있어, 클래스 이름으로 직접 접근한다.
 * - static 키워드가 붙은 변수나 메서드는 클래스가 로딩될 때 메모리에 할당되어 프로그램이 종료될 때까지 유지된다.
 */

public class Program {
  public static void main(String[] args) {
    MobController mobController = MobController.getInstance();
    Mob frog = mobController.addMob(new MobType("animal:frog", "Frog"), new Vector3(0, 0, 0));
    Mob rabbit = mobController.addMob(new MobType("animal:rabbit", "Rabbit"), new Vector3(0, 0, 0));
    Mob turtle = mobController.addMob(new MobType("aninal:turtle", "Turtle"), new Vector3(0, 0, 0));
    
    Mob[] generated = new Mob[100];
    for (int i = 0; i < 100; i++) {
      generated[i] = mobController.addMob(new MobType("animal:dog", "Dog"), new Vector3(0, 0, 0));
    }

    // MobController.addMob의 조건문에 따라 98, 99, 100번째 Mob 객체는 생성되지 않음
    // 위에서 frog, rabbit, turtle 세 객체를 이미 생성한 후 100회 반복문을 처리하였기 때문에 97회에서 100개의 객체가 생성됨
    System.out.println("배열의 100번째 공간에 Mob 객체가 " + (generated[99] == null ? "성성되지 않았습니다." : "생성되었습니다."));
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

public class MobType {
  public String id;  // for internal identification
  public String name;  // for display name to user
  public MobType(String id, String name) {
    this.id = id;
    this.name = name;
  }
}

public class Mob {
  public Vector3 position;
  public MobType type;

  // generated: 생성된 Mob 객체의 수 기록
  public static int generated = 0;

  public Mob(MobType type, Vector3 position) {
    this.type = type;
    this.position = position;
    Mob.generated++;
  }

  public void killSelf() {
    Mob.generated--;
  }
}

public class MobController {
  // final 키워드가 붙은 변수는 값을 더 이상 바꿀 수 없다.
  // 이후에 MAX_MOB = 77; 과 같은 코드 호출 시 컴파일 에러 발생
  public static final int MAX_MOB = 100;

  private static MobController instance;

  private MobController() {}
  public static MobController getInstance() {
    if (instance == null) {
      instance = new MobController();
    }
    return instance;
  }

  public Mob addMob(MobType type, Vector3 position) {
    // (조기 반환, 조기 종료) 생성된 Mob 객체의 수가 MAX_MOB을 넘으면 null을 반환하도록 하여 더 이상의 진행을 막음
    if (Mob.generated >= MAX_MOB) {
      return null;
    }

    Mob mob = new Mob(type, position);
    return mob;
  }

  public void removeMob(Mob mob) {
    mob.killSelf();
  }
}
