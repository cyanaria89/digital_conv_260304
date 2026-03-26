package 제어문_조건문;

// 제어문 : 조건문, 반복문, 프로그램의 순차적인 흐름을 제어하는 목적
// 조건문 : 주어진 조건식의 결과(분기)에 따라 정해진 명령을 실행
// 반복문 : 주어진 조건이 참인 경우인 동안 정해진 명령을 반복 실행

// 조건문의 종류
// if, if ~ else, if ~ else if ~ else : 조건식을 이용해 분기, 모든 경우에 사용 가능
// switch ~ case : 조건 값에 의한 분기, 정수값, 문자, 문자열 가능, 실수값은 불가능
// 삼항연산자 : 참과 거짓만 분기 할 때 사용, 연산자이기 때문에 출력 구문 내에서 사용 가능
//            if문 처럼 사용 가능 (대신 코드가 길어짐)
// 삼항연산자 - switch문 - if문 우선순위로 사용하는게 좋음
// python은 switch문이 없음, if문을 switch문 처럼 사용?

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력! : ");
        int num = sc.nextInt(); // 정수값 입력
        if (num > 100) System.out.println(num + "은 100보다 큽니다.");
        // 조건 식이 참인 경우, (* else문이 반드시 필요한 것은 아님
        else if (num == 100) System.out.println(num + " = 100 !");
        else System.out.println(num + "은 100보다 작습니다.");

        // 이름, 국어, 영어, 수학 성적을 입력 받기
        // 각각의 성적이 0 ~ 100 사이가 아니면 성적 입력 오류 후 종료
        // 제대로 입력 되면 총점과 평균 계산
        // 평균이 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 나머지 F
        // 이름, 총점, 평균, 등급 출력

        sc.nextLine();

        String name;
        int kor, eng, mat, tot;
        double avg;
        char grade;

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어 점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        mat = sc.nextInt();

        if ((kor < 0 || kor > 100) || (eng < 0 || eng > 100) || (mat < 0 || mat > 100)) {
            System.out.println("!! 성적 입력 오류 !!");
            return; // main() 메서드 실행 결과 반환
        }

        tot = kor + eng + mat;
        avg = tot / 3.0;

        if (avg >= 90) grade = 'A';
        else if (avg >= 80) grade = 'B';
        else if (avg >= 70) grade = 'C';
        else if (avg >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("=".repeat(20));
        System.out.println("\t간이 성적표");
        System.out.println("-".repeat(20));
        System.out.println("\t이름 : " + name);
        System.out.println("\t총점 : " + tot);
        System.out.printf("\t%s : %.2f\n", "평균", avg);
        System.out.println("\t등급 : " + grade);
        System.out.println("=".repeat(20));
    }
}