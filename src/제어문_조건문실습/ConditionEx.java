package 제어문_조건문실습;

// 시간과 분을 입력받아 입력받은 시간보다 45분 일찍 설정 되도록 구현
// ex) 23:45 > 23:00
//     00:30 > 23:45

// 슈도 코딩 - 실제 코딩이 아니라 흐름에 따라 순서를 작성해보는 것

import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {
        int h, m, minute;

        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 시간 / 분 입력 받기
        System.out.print("시간\t(0 ~ 23) : ");
        h = sc.nextInt();
        if (h > 23 || h < 0) { System.out.println("입력 오류"); return; }
        System.out.print("분\t(0 ~ 59) : ");
        m = sc.nextInt();
        if (m > 59 || m < 0) { System.out.println("입력 오류"); return; }

        // 계산 편의를 위해서 전부 분으로 환산
        minute = (h * 60) + m;

        // 환산된 분이 45 미만이면 하루치 시간을 더 해줌
        if (minute < 45) minute += (24 * 60);

        // 환산된 시간에서 -45
        minute -= 45;

        // 다시 시간과 분으로 환산 후 출력
        h = minute / 60;
        m = minute % 60;
        System.out.printf("%s\t : %d : %d\n","설정 시각", h, m);
    }
}
