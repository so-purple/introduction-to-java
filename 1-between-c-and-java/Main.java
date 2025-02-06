class Main {
    public static void main(String[] args) {
        // # C와 자바의 문법적 유사성

        //   자바는 C 문법의 변형에서 시작됨
        //   변수 선언하기:
        //   (타입) (변수 이름) = (값);
        int intVar = 10;
        float floatVar = 10.0f;
        double doubleVar = 10.0;
        char charVar = 'A';


        // # 유사하지만 차이가 있는 데이터 타입입

        //   C에서는 #include <stdbool.h>를 사용하여 bool 타입을 사용할 수 있지만
        //   자바에서는 boolean 타입이 대신 기본 제공됨
        boolean boolVar = true;

        //   C에서는 문자열을 char[]로 표현하거나 #include <string.h>를 사용하여 string 타입을 사용할 수 있지만
        //   자바에서는 String 타입이 기본 제공됨
        String stringVar = "Hello, World!";

        //   C와 다르게 자바에는 기본 타입 이름이지만 대문자로 시작하는 타입이 존재함
        Integer I = Integer.valueOf(10);
        Float F = Float.valueOf(10.0f);
        Double D = Double.valueOf(10.0);
        Character C = Character.valueOf('A');
        Boolean B = Boolean.valueOf(true);

        //   다시 말해 String도 위와 같은 부류의 타입이라고 볼 수 있음
        //   이러한 타입은 C에서의 포인터처럼 동작할 수 있음
        //   ```c
        //   int var = 1;
        //   int *ptr1 = &var;
        //   int *ptr2 = &var;
        //   ```
        //   위의 C 코드에서 ptr1과 ptr2는 같은 주소를 가리키고 있음
        int var = (int)1e10;
        Integer ptr1 = Integer.valueOf(var);
        Integer ptr2 = ptr1;
        //   위의 자바 코드에서 ptr1과 ptr2는 같은 주소를 가리키고 있음


        // # C의 구문과 자바의 구문: 제어문
        //   C와 자바의 제어문은 동일함

        //   조건문
        if (true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //   for문
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //   while문
        while (true) {
            System.out.println("true");
            break;
        }

        //   do-while문
        do {
            System.out.println("true");
            break;
        } while (false);

        //   switch문
        switch (1) {
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("default");
                break;
        }


        // # C의 구문과 자바의 구문: 열거형과 구조체
        //   열거형은 자바에서도 사용할 수 있지만, 구조체는 클래스로 대체됨
        enum Majors {
            COMPUTER_SCIENCE,
            SOFTWARE_ENGINEERING,
            COMPUTER_ENGINEERING
        }
        Majors major = Majors.COMPUTER_SCIENCE;
        //    *클래스는 이후 내용

    }


    // # C의 구문과 자바의 구문: 함수
    //   자바의 함수는 C에서와 같이 선언할 수 있지만 더 많은 내용을 담을 수도 있음
    //   함수 선언하기:
    //   (반환 타입) (함수 이름)((인자 타입) (인자 이름), ...) {

    //   C처럼 선언하기:
    int f(int x) {
        return x + 1;
    }
}
