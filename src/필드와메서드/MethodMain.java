package 필드와메서드;

//  필드 : 객체의 속성 값을 저장하는 것
//      > 인스턴스 필드 / 지역 필드 / 전역 필드
//  메서드 : 기능 / 동작을 구현 하는 것, JAVA는 클래스 기반의 언어이므로 모든 함수는 메서드 형태로 클래스 내부에 정의되어야 함
//      > 인스턴스 메서드 / 클래스 메서드
//  메서드 구성요소
//  - 접근제한자 : public, default (private, protected)
//  - 반환 타입 : 해당 메서드 수행 이후 결과를 되돌려 주는 타입을 지정
//              > void : 반환 값 없음
//  메서드 : camelCase (매개변수) { 구현문 }
//  - 메서드 이름 : camel case로 작성
//  - 매개 변수 : 외부에서 해당 메서드에 전달하는 값 (없을 수도 있음)
//  - 구현문 : 실제 기능을 구현하는 부분 {  } 내부에 작성

/*
    Memory - Static / Heap / Stack
*/

public class MethodMain {
    public static void main(String[] args) {
        Sample sample = new Sample();   // Sample 클래스로 sample 객체 생성
        // 객체.메서드 로 호출
        System.out.println(sample.sum(10, 20)); // sum 메서드에 10, 20 을 넣어 결과값 리턴 받아 출력
        System.out.println(sample.sum(10, 20, 30)); // sum 메서드에 10, 20 을 넣어 결과값 리턴 받아 출력
        sample.hello();                               // 반환값이 없고 메서드에서 바로 출력문 실행
        System.out.println(sample.rtnHello());        // String 값을 반환 받아 출력
        System.out.println(sample.rtnNum());          // Sample 클래스 내에 저장된 x, y 를 더한 값을 출력

        // 뺄셈, 곱셈, 나눗셈을 하는 메서드를 만들고 결과를 반환받아 출력 : 간단 실습
        Cal cal = new Cal();
        System.out.println(cal.plus() + " / " + cal.plus(20, 5));
        System.out.println(cal.minus() + " / " + cal.minus(20, 5));
        System.out.println(cal.mul() + " / " + cal.mul(20, 5));
        System.out.println(cal.divide() + " / " + cal.divide(20, 6));

        // 문자열 3개를 입력 받아 문자열 연결하는 함수
        System.out.println(sample.sum("YOU ","ARE ","IRONMAN?"));
        // 실수값 1개, 정수 1개를 입력 받아 더하는 함수
        System.out.println(sample.sum(1.2549, 6));
        // 문자열 1개, 정수값 1개, 실수값 1개를 더하는 함수
        System.out.println(sample.sum("PI : ", 3, 0.141592));

        // 매개변수의 개수를 모르는 경우
        System.out.println(sample.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        {
            int k = 100;
            System.out.println(k);  // 100
        }
//        System.out.println(k);  // error (k가 없음)
        /*
            int k; { k = 100; System.out.println(k) } System.out.printLn(k) > 는 가능
        */
    }
}

class Sample {
    int x = 200, y = 150;   // 인스턴스 필드 : 클래스 내부에 선언된 변수. 객체와 생성과 소멸을 함께 함
    static int z = 100;     // 정적 필드 : 클래스 생성 시 한 번만 생성, 프로그램 종료 시 까지 유지
    /* 이름 : "sum" / 매개변수 : int 타입 x, y / 반환타입 : int / 접근제한자 : default */
    int sum (int x, int y) { return x + y; }
    int sum (int x, int y, int z) { return x + y + z; }
    String sum (String x, String y, String z) { return x + y + z; }
    double sum (double x, int y) { return x + y; }
    String sum (String x, int y, double z) {
        int w = 1000;   // 지역 변수 : 해당 메서드 내에서만 사용되고 삭제?됨
        return w + x + (y + z); }

    // 매개변수의 개수를 가변적으로 받기
    // * ... : spread operator - 자바에서 쓰는 용어는 아님
    //      입력된 매개변수를 배열에 넣어서 연산?
    int sum (int... nums) {
        int sum = 0;
        for (int num : nums) {  // 이터러블 객체 자동 순회
            sum += num;
        }
        return sum;
    }

    void hello () { System.out.println("Hello World!"); }
    String rtnHello () { return "Hi! Hello!"; }

    int rtnNum() { return x + y; }
}

class Cal {
    double x = 10, y = 2;
    double plus () { return x + y; }
    double plus (double x, double y) { return x + y; }

    double minus () { return x - y; }
    double minus (double x, double y) {return x - y; }

    double mul () { return x * y; }
    double mul (double x, double y ) { return x * y; }

    double divide () { return x / y; }
    double divide (double x, double y) { return x / y; }
}
