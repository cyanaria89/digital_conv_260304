package 기본_연산자_실습;

// [윤년 계산하기]
// 1. 연도가 4로 나누어 떨어짐 (4의 배수) year % 4 == 0
// 2. 100으로 나누어 떨어지면 윤년이 아님 (4의 배수 O, 100의 배수 X) year % 4 == 0 && year % 100 != 0
// 3. 400으로 나누어 떨어지면 윤년 year % 400 == 0

// [100의 자리 정수 나누어 대입]
// 1. 정수 입력 받기
// 2. 각 자리 정수를 각각 변수에 대입 하여 서로 비교 후 가장 큰 수 출력

import java.util.Scanner;

public class OperatorEx {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 연도 입력 받기
        System.out.println("[윤년 판별기]");
        System.out.print("연도를 입력해주세요 : ");
        int year = sc.nextInt();
        // 윤년 판별
//        if (year%400 == 0) {
//            System.out.println("윤년입니다.");
//        } else if (year%4 == 0 && year%100 == 0) {
//            System.out.println("윤년이 아닙니다.");
//        } else if (year%4 == 0) {
//            System.out.println("윤년입니다.");
//        } else {
//            System.out.println("윤년이 아닙니다.");
//        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }

        System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "윤년입니다." : "윤년이 아닙니다.");

        // 100의 자리 정수 비교
        System.out.println("[각 자리의 숫자 비교]");
        System.out.print("세 자리 숫자를 입력해주세요. : ");
        int num = sc.nextInt();
        int fst, snd, trd;
        fst = num / 100;
        snd = (num % 100) / 10;
        trd = num % 10;

        if (fst > snd) {
            if (fst > trd) System.out.println(fst);
            else System.out.println(trd);
        } else {
            if (snd > trd) System.out.println(snd);
            else System.out.println(trd);
        }
        System.out.println(fst + ", " + snd + ", " + trd);

        // 연산자 우선 순위 확인
        int val1 = 5, val2 = 5, val3 = 5;
        int rst1 = val1 + val2 * val3; // *, / 은 +, - 보다 우선순위가 높음, 30
        int rst2 = (val1 + val2) * val3; // ()는 연산자 우선순위가 가장 높음, 50
        int rst3 = val1 + (++val2) * val3; // 값 증가 후 연산 수행, 35
        System.out.println(rst1 + ", " + rst2 + ", " + rst3);

    }
}
