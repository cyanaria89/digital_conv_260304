package 스위치실습;

// "좌변 값", "연산자", "우변 값" 을 임력받아 산술 연산을 수행하는 스위치문 만들기
// ex) 입력 : 23 + 45
//     출력 : 68

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        int a, b, rst;
        char o;
        Scanner sc = new Scanner(System.in);
//        System.out.print("두 개의 수를 'a b'형식으로 입력하세요 : ");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        System.out.print("어떤 연산을 할 것인지 입력하세요(+, -, *, /, %) : ");
//        o = sc.next().charAt(0);

        System.out.print("입력 : ");
        a = sc.nextInt();
        o = sc.next().charAt(0);
        b = sc.nextInt();

        switch (o) {
            case '+':
                rst = a + b;
                break;
            case '-':
                rst = a - b;
                break;
            case '*':
                rst = a * b;
                break;
            case '/':
                rst = a / b;
                break;
            case '%':
                rst = a % b;
                break;
            default:
                System.out.println("딴거 써서 종료함 ㅇㅇ");
                return;
        }
//        System.out.println("결과 : " + rst);
        System.out.println("출력 : " + rst);

    }
}
