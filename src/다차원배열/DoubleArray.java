package 다차원배열;

/*  개념이해, 코딩테스트용
    백엔드 개발에선 Array List, Linked List, Vector 등을 사용한다고 함 */

/*  ex) 학생 관리 - 이름, 성별, 주소, 연락처, 학번, 학과 등 타입이 다른 자료들을 저장할 때
    // class로 객체를 만들어서 그 객체를 ArrayList로 관리하는 방법을 사용
    DataBase 와 유사한 개념 */

// 5명에 대한 학번, 국어, 영어, 수학 성적을 입력
// 각 학생의 학번, 국어, 영어, 수학, 총점, 평균 출력
// 2차원 배열 사용

import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
        int[][] students = new int[5][5];
        double[] avg = new double[5]; // 데이터 타입이 달라 배열 별도 생성 필요
        Scanner sc = new Scanner(System.in);

        // 2차원 배열에 학번, 성적 입력
        for (int i = 0; i < students.length; i++) { // 행에 대한 길이까지 반복 수행, 각 학생
            System.out.printf("[%d번 학생]\n", i + 1);
            System.out.print("학번 입력 : ");
            students[i][0] = sc.nextInt(); // 학번
            System.out.print("국어, 영어, 수학 성적 : ");
            students[i][1] = sc.nextInt(); // 국어
            students[i][2] = sc.nextInt(); // 영어
            students[i][3] = sc.nextInt(); // 수학
            students[i][4] = students[i][1] + students[i][2] + students[i][3]; // 총점
            avg[i] = (double) students[i][4] / 3; // 평균
        }

        // 출력
        System.out.println("-".repeat(36));
        System.out.println(" 학번   국어   영어   수학   총점   평균");
        System.out.println("-".repeat(36));
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%04d %5d %5d %5d %6d %6.2f\n", students[i][0], students[i][1], students[i][2], students[i][3], students[i][4], avg[i]);
        }
        System.out.println("-".repeat(36));
    }
}
