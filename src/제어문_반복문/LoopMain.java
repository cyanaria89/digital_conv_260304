package 제어문_반복문;

// 반복문 : 주어진 조건이 참인 경우 혹은 주어진 횟수 만큼을 반복적으로 프로그램을 수행
// for : 주어진 횟수만큼 반복, for(초기값; 최종값; 증강값)
// Enhanced for : 배열이나 컬렉션과 같은 반복 가능한(iterable) 객체를 간편하게 순회할 때 사용
//                내부 값 변경 불가, 자동 순회
//                해당 페이지에선 배우지 않음(후반부 내용)
// while : 조건이 참인 경우 반복 (반복 횟수를 알 수 없을 때)
// do ~ while : 일단 한번 실행 후 조건이 참인 경우 반복 (잘 안씀)

// memory > Static / Heap / Stack
// Stack - 지역변수저장공간?, 자동 초기화 안됨

import java.util.Scanner;

public class LoopMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sumWhile1 = 0, sumWhile2 = 0, sumFor = 0; // sum > 반드시 초기화 필요

        System.out.print("정수 입력 : ");
        num = sc.nextInt();

        int temp1 = num, temp2 = num;

        while (temp1 > 0) { // java의 경우 조건의 결과 true/false 여야 함, 참인 경우 반복 수행
            sumWhile1 += temp1;
            temp1--; // 반복문 탈출 위한 조건 변경
        }

        for(int i = 1; i <= num; i++) {
            sumFor += i;
        }

        temp2 = num;
        while (true) {
            sumWhile2 += temp2;
            temp2--;
            if (temp2 == 0) break;
        }

        System.out.println("while1 합계 : " + sumWhile1);
        System.out.println("for 합계 : " + sumFor);
        System.out.println("while2 합계 : " + sumWhile2);
    }
}
