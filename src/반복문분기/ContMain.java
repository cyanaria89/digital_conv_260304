package 반복문분기;

// break : 반복문 탈출
// continue : 반복문의 조건식으로 이동. continue 이하 코드 스킵

import java.util.Scanner;

public class ContMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt();
        sc.nextLine();
        // continue를 이용해 짝수만 출력
        for (int i = 1; i <= num1; i++) {
            if (i % 2 != 0) continue; // 홀수 일 때 이하 스킵
            System.out.print(i + " ");
        }
        System.out.println();
        // continue 이용, 입력 받은 수의 범위 이내의 5의 배수를 1줄에 10개씩 출력
        System.out.print("정수 입력2 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        int cnt = 0;
        for (int i = 1; i <= num2; i++) {
            if (i % 5 != 0) continue;       // 5의 배수가 아니면 이하 코드 스킵
            System.out.printf("%4d", i);
            cnt++;                          // 출력 횟수 누적
            if (cnt % 10 != 0) continue;    // 출력 횟수가 10의 배수가 아니면 이하 코드 스킵
            System.out.println();
        }
    }
}
