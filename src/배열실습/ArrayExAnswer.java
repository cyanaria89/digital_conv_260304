package 배열실습;

import java.util.Scanner;

public class ArrayExAnswer {
    public static void main(String[] args) {
        // 실습 문제 1번
//        hamburgerEx();
        // 실습 문제 2번
        evenOddEx();
    }

    static void hamburgerEx() {
        Scanner sc = new Scanner(System.in);
        int[] menu = new int[5]; // 5개의 정수 배열 생성

        System.out.print("햄버거 3개, 음료 2개 가격 연속 입력 : ");
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }

        int minBurger = menu[0]; // 배열 내의 값으로 최소값 지정
        int minDrink = menu[3];

        for (int i = 0; i < menu.length; i++) {
            if (i < 3 && minBurger > menu[i]) minBurger = menu[i];
            if (i > 2 && minDrink > menu[i]) minDrink = menu[i];
        }

        System.out.printf("세트 메뉴 가격 : %d\n", minBurger + minDrink - 50);
    }

    static void evenOddEx() {
        Scanner sc = new Scanner(System.in);
        int[] inputArray = new int[8];  // 8개의 정수 저장 공간
        int[] oddArray = new int[8];    // 홀수 값 저장 배열
        int[] evenArray = new int[8];   // 짝수 값 저장 배열

        // 정수 입력 (8개)
        System.out.print("정수 입력 (8개) : ");
        for (int i = 0; i < inputArray.length; i++) { inputArray[i] = sc.nextInt(); }

        // 홀수 배열, 짝수 배열 나눠담기
        int oddIndex = 0, evenIndex = 0;
        for (int e : inputArray) {
            if (e % 2 == 0) evenArray[evenIndex++] = e; // 값 대입 후 인덱스 증가
            else oddArray[oddIndex++] = e;
        }

        // 출력
        System.out.print("홀수 : ");
        for (int i = 0; i < oddIndex; i++) System.out.print(oddArray[i] + " ");
        System.out.print("\n짝수 : ");
        for (int i = 0; i < evenIndex; i++) System.out.print(evenArray[i] + " ");
    }
}
