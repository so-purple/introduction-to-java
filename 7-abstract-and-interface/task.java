/**
 * 과제
 * 
 * 마인크래프트에는 아이템에 이름과 아이디 데이터가 각각 존재한다.
 * 예를 들어, 철 곡괙이의 아이디는 "minecraft:iron_pickaxe"이고, 이름은 "Iron Pickaxe" 혹은 각 나라의 언어로 번역되어 표시된다.
 * 
 * 위와 비슷한 시스템을 구현하고, 메인 클래스에서 아이템을 생성하고 출력하는 코드를 작성하시오.
 * 
 */

public class Main {
  public static void main(String[] args) {
    /**
     * 요구 사항 2:
     * (요구 사항 1을 먼저 풀이하여야 한다.)
     * 
     * 요구 사항 1에서 작성한 클래스를 이용하여 아이템을 생성하고 출력하는 코드를 작성하시오.
     * - 철광석
     *   - 아이디: minecraft:iron_ore
     *   - 이름: (영어) Iron Ore (한국어) 철광석
     * - 철 곡괭이
     *   - 아이디: minecraft:iron_pickaxe
     *   - 이름: (영어) Iron Pickaxe (한국어) 철 곡괭이
     * - 황금 당근
     *   - 아이디: minecraft:golden_carrot
     *   - 이름: (영어) Golden Carrot (한국어) 황금 당근
     */


    
  }
}

/**
 * 요구 사항 1:
 * 아래의 추상클래스와 인터페이스를 읽어보고, 아이템을 표현할 수 있는 클래스를 작성하라.
 * 아이템은 이름과 아이디를 가지며, 이름은 영어와 한국어로 번역되어 표시될 수 있다.
 */



public interface Displayable {
  public void display();
}

public abstract class DisplayableObject implements Displayable {
  public String identifier;
  public abstract String getDisplayName(Locale locale);
}

public enum Locale {
  enUS,
  koKR,
};

public interface Localizable {
  public String getLocalizedName(Locale locale);
}

public abstract class LocalizableObject implements Localizable {
  public String enUS;
  public String koKR;
}
