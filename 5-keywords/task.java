/**
 * 과제
 * 
 * 지금까지 분석한 코드를 바탕으로 다음과 같은 클래스를 작성하여라.
 * 
 * AudioManagement 클래스
 * 시나리오:
 *   - AudioManagement는 컴퓨터 시스템의 볼륨을 처리하한다.
 *   - 볼륨은 0에서 100까지의 실수 값을 가질 수 있다.
 *   - 최초 볼륨은 50으로 설정한다.
 * 시스템이 사용할 AudioManagement는 두 개 이상의 객체가 필요하지 않으므로
 * 이 객체가 항상 한 개만 존재함을 보장하여야 한다.
 * 
 * AudioManagement 클래스는 다음과 같은 메서드를 가진다.
 *  + setVolume(volume: float): void
 */

public class Main {
  public static void main(String[] args) {
    AudioManagement audioManagement = AudioManagement.get();
    audioManagement.setVolume(80);
    assert audioManagement.getVolume() == 80;
  }
}
