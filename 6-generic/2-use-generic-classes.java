import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    // 리스트 사용 시 List<리스트가 담을 타입> 타입으로 선언
    // 생성자에 List가 아니라 ArrayList와 LinkedList를 사용하는 것은 추상클래스와 인터페이스 파트에서 다룸
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    arrayList.add(1);
    linkedList.add(2);
    System.out.println(arrayList.get(0));
    System.out.println(linkedList.get(0));
  }
}
