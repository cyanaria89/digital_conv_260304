package 변수와자료형;

// class 이름은 대문자로 시작해야 함

import java.util.Scanner;

public class DataTypeMain {
    public static void main(String[] args) {
        // int age;
        // 정수 타입의 값을 저장하기 위한 변수 생성, 4Byte 메모리 공강을 확보 함

        // 변수? - 메모리 공간을 확보하고 이름을 붙이는 것
        // 자바에서는 JVM이 메모리(RAM) 할당을 담당 (운영체제 - JVM - 변수 ??)

        /*
          변수 이름 규칙
          1. 시작 문자로 영문자, 숫자, _, $ 사용 가능, 한글 가능
          2. 첫 글자로 숫자 불가능
          3. 자바의 키워드 사용 불가 ex) if, continue, while 등
             + 변수명 내에 공백 사용 불가
          4. 카멜 표기법(camel case) 준수 ex) camelCase
             + snake case (C언어, Python)에서 사용되는 표기법 ex) snake_case
             + 파스칼 표기법 (Class 명 등) ex) DataTypeMain
           * 오류는 없으나 협업을 위해 통일
          5. ☆ 가장 중요! ☆ : 사용 목적에 맞게 이름을 지어야 함
        */

        // 대문자로 시작하는 변수 타입은 참조 변수?

        // 나이, 이름, 주소, 전화번호, 성인 여부 확인하는 변수 이름 작성

        int age = 37; // 4byte 정수 타입의 age라는 이름의 변수를 생성하고 37을 대입
        String name = "HJH"; // 문자열 타입의 변수를 생성하고 "HJH"라는 문자열의 주소를 대입
                             // - 참조타입 (공간이 얼마가 필요한지 알 수 없기 때문)
        String phone = "010-0000-0000";
        boolean isAdult = true; // 참(true) 거짓(false) 으로 값을 판별

        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        System.out.println("연락처 : " + phone);
        System.out.println("성인여부 : " + isAdult);

        // 자료형(Data Type) : 저장할 데이터의 형태를 결정, 기본 자료형과 참조 자료형이 있음
        // bit = 0 or 1
        // 1byte = 8bit
        boolean isTrue = true; // 1byte, true or false

        char gender = '남'; // 문자(1글자) 저장, 2byte, 부호 없음, 내부적으로는 정수값이 사용, 문자: '', 문자열: ""
        String addr = "충남 천안시 동남구"; // 참조 타입(실제 값이 아닌 주소가 저장됨), "문자열"은 리터럴 상수 취급

        System.out.println(gender + " = " + (int)gender);

        // Number - 정수형과 실수형으로 나누어 짐
        // 정수형 : byte(1), short(2), int(4), long(8) - 소수점 이하 없고, 부호 있음
        // byte 표현 범위 : -128 ~ +127 (0은 양수 취급)
        // 근데 int, long 만 사용 ㅇㅇ
        // 실수형 : float(4), double(8) - 소수점 이하 있고, 부호 있음, switch문에서 사용 할 수 없음

        byte num1 = -128; // -129 이하, 128 이상 넣으면 오류
        float num2 = 1.729f; // 단정밀도 표현 방식 f 포함해야 함
        double num3 = 72.46; // 배정밀도 표현 방식이며 기본타입
        // 실수 표현 방식의 문제점, 연산 결과에 오차 발생(근사치 계산법)
        double num = 0.1;
        System.out.println(num + num + num + num + num + num + num + num + num + num);

        // 상수(constant) : 변수와 다른 점은 값이 대입된 후 변경 할 수 없음
        final double TAX_RATE = 0.10; // 세율에 대한 상수, 값이 최초 대입된 이후 변경 X
                                      // 관례상 변수명은 대문자로 표시
        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 스캐너 객체 생성
        System.out.print("수입을 입력 하세요. : "); // print() 줄 바꿈을 하지 않음
        int income = sc.nextInt(); // 스캐너 객체로 부터 정수값을 입력 받아 income 변수에 대입
        System.out.println("당신이 내야 할 세금은 " + (income * TAX_RATE) + "원 입니다.");

        // 형 변환 : 정해진 타입을 다른 타입으로 변환
        // 명시적 형 변환 : 개발자가 의도를 가지고 형을 변경
        // 묵시적 형 변환 : 컴파일러가 자동으로 유리한 방향으로 형을 변환
        int val1 = 10, val2 = 3;
        double rst1 = val1 / val2;
        double rst2 = val1 / (double)val2;
        System.out.println(rst1); // 3.0
        System.out.println(rst2); // 3.333333333...

        int kor = 92, eng = 59, mat = 76;
        double avg1 = (double)(kor + eng + mat) / 3; // or (kor + eng + mat) / 3.0
                                                     // 컴파일러가 이로운 방향으로 자동 형 변환
        double avg2 = (kor + eng + mat) / 3;
        System.out.println(avg1 + ", " + avg2);
        System.out.printf("%.2f\n", avg1); // 소수점 이하 3번째 자리에서 반올림하여 2번째 자리까지 표시, \n은 줄 바꿈

        // 타입 변환 메서드 : 문자열을 정수나, 실수로 변환 할 때 사용하는 메서드
        String str1 = "01001011";
        System.out.println(300 + Integer.parseInt(str1));
        String str2 = "0100.357";
        System.out.println(900 + Double.parseDouble(str2));

    }
}