package 참조타입_배열기본;

// 자바의 배열은 동일한 데이터 타입이 연속적으로 저장되는 자료 구조
// 배열은 여러 개의 값을 하나의 변수에 저장할 수 있도록 해주며, 인덱스를 사용해 각 요소에 접근
//      인덱스는 0부터 시작
// 기본 자료형, 객체 타입(참조형) 모두 사용 가능
// 객체로 취급, 기본적으로 Heap 영역에 메모리가 할당 됨

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        // 국어, 영어, 수학, 과학, 코딩 성적을 입력 받아 촘점과 평균 구하기
        int[] score = new int[5]; // 성적을 입력하기 위한 5칸의 배열을 생성
        String[] subject = {"국어", "영어", "수학", "과학", "코딩"};

        Scanner sc = new Scanner(System.in);
        System.out.print("국 영 수 과 코 성적 차례대로 입력 : ");
        // 배열의 인덱스는 0부터 시작
        score[0] = sc.nextInt(); // 국
        score[1] = sc.nextInt(); // 영
        score[2] = sc.nextInt(); // 수
        score[3] = sc.nextInt(); // 과
        score[4] = sc.nextInt(); // 코
        sc.nextLine();

        int total = 0;
        for (int sub : score) { // Enhanced For, 이터러블 객체를 자동으로 순회
                                // 배열 내부의 값을 변경할 수 없음, 무조건 처음부터 끝까지 순회
            total += sub;
        }
        // for (int i = 0; i < score.length; i++) {
        //     total += score[i]
        // }
        // 일반 for문의 경우 중간에 배열의 내용 값을 바꿔버릴 수 있음
        // 대체로 값을 바꿀 수 없는 방식이 좋음

        double avg = (double) total / score.length;

        // 각 과목의 성적과 총점 평균 출력

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%s : %3d\n", subject[i], score[i]);
        }
        System.out.printf("총점 : %4d, 평균 : %4.2f\n", total, avg);
    }
}
