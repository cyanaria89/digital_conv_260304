package 기본_연산자;

// 연산자 : 프로그램에서 사용하는 값을 연산해야 하는 경우에 사용
// 산술연산자 : 사칙연산과 나머지 연산 (+, -, *, /, %)
// 대입연산자 : 변수에 값을 대입할 때 사용 (=)
// 복합대입연산자 : 하나의 변수에 연산하여 재대입 (+=, -=, *=, /=, %=)
// 증감연산자 (= 단항연산자) : 변수의 값을 1증가 또는 1감소 시키는 연산자 (++, --) (Python에는 없음)
// 비교연산자 : 좌변과 우변의 값을 비교하여 결과를 "참/거짓" 으로 판별 (==, >, <, >=, <=, !=)
// 논리연산자 : && and : 모두 만족해야 true
//            || or : 하나만 만족하면 true
//            ! not : 현재의 상태를 부정, true > false 또는 false > true
// 삼항연산자 : 참과 거짓만 있는 조건문을 만들 수 있음, 항이 3개인 연산자
// 비트연산자 : 비트 단위의 연산을 수행

import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args) {
        // 산술연산자
        int x = 10, y = 3;
        System.out.println(x + y); // 덧셈
        System.out.println(x - y); // 뺄셈
        System.out.println(x * y); // 곱셈
        System.out.println(x / y); // 나눗셈(몫 만 계산, 정수값)
        System.out.println(x % y); // 나눗셈(나머지만 계산, 정수값)
        System.out.println((double) x / y); // 나눗셈을 위해 명시적인 형 변환

        // 대입연산자
        int num1 = 10; // 정수 타입의 변수에 10을 대입
        System.out.println(num1);
        System.out.println(num1 += 2); // num1에 2를 더해서 다시 num1에 대입, 10 + 2 = 12
        System.out.println(num1 -= 2); // num1에 2를 빼서 다시 num1에 대입, 12 - 2 = 10
        System.out.println(num1 *= 2); // num1에 2를 곱해서 다시 num1에 대입, 10 * 2 = 20
        System.out.println(num1 /= 2); // num1에 2로 나눈 몫을 다시 num1에 대입, 20 * 2 = 10
        System.out.println(num1 %= 2); // num1에 2로 나눈 나머지를 다시 num1에 대입, 10 % 2 = 0

        // 증감연산자
        int num2 = 10;
        System.out.println(num2);
        System.out.println(++num2); // 선증가 후 대입, 11
        System.out.println(num2++); // 11 출력 후 증가하여 대입, 12 저장
        System.out.println(num2); // 확인, 12
        System.out.println(num2--); // 12 출력 후 감소하여 대입, 11 저장
        System.out.println(num2); // 확인, 11
        System.out.println(--num2); // 선감소 후 대입, 10

        // 비교연산자
        int num3 = 10, num4 = 20;
        System.out.println(num3 == num4); // 같음? false
        System.out.println(num3 != num4); // 다름? true
        System.out.println(num3 > num4); // num3이 큼? false
        System.out.println(num3 < num4); // num3이 작음? true
        System.out.println(num3 >= num4); // num3이 크거나 같음? false
        System.out.println(num3 <= num4); // num3이 작거나 같음? true

        // 논리연산자
        int num5= 10, num6 = 20;
        // 산술연산자가 논리연산자 보다 우선 순위가 높음
        System.out.println(num5 > 0 && num6 < 0); // true && false > false
        System.out.println(num5 > 0 || num6 < 0); // true || false > true
                                                  // (앞의 항이 true이므로 뒷 항은 연산하지 않는다고 함)
        System.out.println(!(num5 > 0 || num6 < 0)); // !true > false

        // 3항연산자 : 참과 거짓만 있는 조건문 대체
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력 : ");
        int age = sc.nextInt(); // 스캐너 객체로 나이를 입력 받음
        if (age > 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
        System.out.println((age > 18 ? "성인" : "미성년자") + "입니다.");

    }
}
