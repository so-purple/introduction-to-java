/**
 * Task 2
 * 한국어 문장의 자모를 분리하고 출력하고자 한다.
 * 수업 중에 다루지 않았거나 수업 범위를 벗어나는 내용의 코드는 미리 작성하였다.
 * 작성된 코드를 이용하여 한국어 문장의 자모를 분리하고 출력하여라.
 * 
 * 아래와 같이 출력되도록 하여라:
 * 저 호수 만큼 자기를 사랑해. 정적분을 이용하여 호수의 넓이를 알아내면 얼마나 나를 사랑하는지 알겠군!
 * 저(ᄌ, ᅥ, ᆨ) 호(ᄒ, ᅩ, ᆨ)수(ᄉ, ᅮ, ᆨ) 만(ᄆ, ᅡ, ᆬ)큼(ᄏ, ᅳ, ᆸ) 자(ᄌ, ᅡ, ᆨ)기(ᄀ, ᅵ, ᆨ)를(ᄅ, ᅳ, ᆰ) 사(ᄉ, ᅡ, ᆨ)랑(ᄅ, ᅡ, ᆽ)해(ᄒ, ᅢ, ᆨ). 정(ᄌ, ᅥ, ᆽ)적(ᄌ, ᅥ, ᆩ)분(ᄇ, ᅮ, ᆬ)을(ᄋ, ᅳ, ᆰ) 이(ᄋ, ᅵ, ᆨ)용(ᄋ, ᅭ, ᆽ)하(ᄒ, ᅡ, ᆨ)여(ᄋ, ᅧ, ᆨ) 호(ᄒ, ᅩ, ᆨ)수(ᄉ, ᅮ, ᆨ)의(ᄋ, ᅴ, ᆨ) 넓(ᄂ, ᅥ, ᆳ)이(ᄋ, ᅵ, ᆨ)를(ᄅ, ᅳ, ᆰ) 알(ᄋ, ᅡ, ᆰ)아(ᄋ, ᅡ, ᆨ)내(ᄂ, ᅢ, ᆨ)면(ᄆ, ᅧ, ᆬ) 얼(ᄋ, ᅥ, ᆰ)마(ᄆ, ᅡ, ᆨ)나(ᄂ, ᅡ, ᆨ) 나(ᄂ, ᅡ, ᆨ)를(ᄅ, ᅳ, ᆰ) 사(ᄉ, ᅡ, ᆨ)랑(ᄅ, ᅡ, ᆽ)하(ᄒ, ᅡ, ᆨ)는(ᄂ, ᅳ, ᆬ)지(ᄌ, ᅵ, ᆨ) 알(ᄋ, ᅡ, ᆰ)겠(ᄀ, ᅦ, ᆼ)군(ᄀ, ᅮ, ᆬ)!
 * 
 */

public class Main {
  static int hangulCodeBase = 0xAC00;
  static int hangulCodeEnd = 0xD7A3;
  public static void main(String []args) {
    char[] exampleString = "저 호수 만큼 자기를 사랑해. 정적분을 이용하여 호수의 넓이를 알아내면 얼마나 나를 사랑하는지 알겠군!".toCharArray();
    int exampleStringLength = exampleString.length;

    // 메인함수 작성 과제 시작














    // 메인함수 작성 과제 끝
  }

  static boolean isHangul(char _char) {
    /**
     * isHangul(문자) 에서 문자가 한글인지 확인합니다.
     */
    return _char >= hangulCodeBase && _char <= hangulCodeEnd;
  }

  static void print(HangulCharacter hangul) {
    HangulProcessor processor = new HangulProcessor();
    System.out.print(processor.combine(hangul) + "(" + hangul.chosung + ", " + hangul.jungsung + ", " + hangul.jongsung + ")");
  }
  static void print(char _char) {
    System.out.print(_char);
  }
}

public class HangulCharacter {
  public char chosung;
  public char jungsung;
  public char jongsung;
  public HangulCharacter(
    char chosung,
    char jungsung,
    char jongsung
  ) {
    this.chosung = chosung;
    this.jungsung = jungsung;
    this.jongsung = jongsung;
  }
}

public class HangulProcessor {
  int hangulCodeBase = 0xAC00;
  int chosungCodeBase = 0x1100;
  int jungsungCodeBase = 0x1161;
  int jongsungCodeBase = 0x11A8;
  int chosungCodeLength = 19;
  int jungsungCodeLength = 21;
  int jongsungCodeLength = 28;

  public HangulProcessor() {}

  public HangulCharacter seperate(char code) {
    int hangulCode = code - hangulCodeBase;
    int chosungIndex = hangulCode / (jungsungCodeLength * jongsungCodeLength);
    int jungsungIndex = (hangulCode / jongsungCodeLength) % jungsungCodeLength;
    int jongsungIndex = hangulCode % jongsungCodeLength;

    return new HangulCharacter(
      (char)(chosungCodeBase + chosungIndex),
      (char)(jungsungCodeBase + jungsungIndex),
      (char)(jongsungCodeBase + jongsungIndex)
    );
  }

  public String combine(HangulCharacter hangul) {
    int chosungIndex = hangul.chosung - chosungCodeBase;
    int jungsungIndex = hangul.jungsung - jungsungCodeBase;
    int jongsungIndex = hangul.jongsung - jongsungCodeBase;

    int code = chosungIndex * jungsungCodeLength * jongsungCodeLength +
      jungsungIndex * jongsungCodeLength +
      jongsungIndex +
      hangulCodeBase;

    return String.valueOf((char)code);
  }
}
