package 참조타입_배열실습;

// 1번
// 햄버거 3개, 음료 2개의 가격을 입력 받기 (5개의 가격을 연속으로 입력 받음)
// 세트 메뉴 가격 (햄버거 3개 중 가장 싼 메뉴 가격 + 음료 2개 중 싼 메뉴 가격) - 50(세트 할인)

// 2번
// 8개의 정수를 입력 받아 배열에 저장
// 홀수는 홀수 배열에 나누어 담고, 짝수는 짝수배열에 나누어 담아서 출력

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        hamburger();
        System.out.println();
        number();
    }

    static void hamburger() {
        Scanner sc = new Scanner(System.in);

        // 1번
        int[] burger = new int[3];
        int[] drink = new int[2];

        System.out.print("햄버거 3개와 음료 2개의 가격을 순서대로 입력하세요 : ");
        burger[0] = sc.nextInt();
        burger[1] = sc.nextInt();
        burger[2] = sc.nextInt();
        drink[0] = sc.nextInt();
        drink[1] = sc.nextInt();
        sc.nextLine();

        int bPrice = burger[0], dPrice = drink[0];
        for (int i = 0; i < burger.length; i++) {
            if (bPrice > burger[i]) { bPrice = burger[i]; }
        }
        for (int i = 0; i < drink.length; i++) {
            if (dPrice > drink[i]) { dPrice = drink[i]; }
        }


        int set = (bPrice + dPrice) - 50;
        System.out.printf("가장 저렴한 세트 메뉴는 %d원 입니다.\n", set);
    }

    static void number() {
        Scanner sc = new Scanner(System.in);

        // 2번
        int[] numArray = new int[8];
        System.out.print("정수 8개 입력 : ");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }
        sc.nextLine();

        int eCnt = 0, oCnt = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0) eCnt++;
            else oCnt++;
        }

        int[] odd = new int[oCnt], even = new int[eCnt];
        eCnt = 0; oCnt = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0) { even[eCnt++] = numArray[i]; }
            else { odd[oCnt++] = numArray[i]; }
        }

        System.out.print("짝수 : ");
        for (int e : even) { System.out.print(e + " "); }
        System.out.print("\n홀수 : ");
        for (int e : odd) { System.out.printf(e + " "); }
        System.out.println();
    }
}
