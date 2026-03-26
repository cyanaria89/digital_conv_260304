package 자바API_Math클래스;

import java.util.Arrays;
/*
    Math Class : 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스
    - 객체를 만들어 사용하지 않음
*/
public class MathMain {
    public static void main(String[] args) {
        System.out.println(Math.cos(45));

        // random() : 0.0 ~ 1.0 범위에서 임의의 실수(double)값을 생성하여 반환
        // 1 ~ 100 까지의 임의의 수 10개 생성
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d", (int)((Math.random() * 100) + 1));
        }
        System.out.println();

        // 로또 번호 생성기
        int[] lotto = new int[6];           // 정수형 6칸 배열 생성, 자바의 배열은 heap 영역에 동적 할당
        boolean isExist = false;            // 중복 여부 확인
        int index = 0;

        while (true) {                      // 몇번이나 중복이 발생할지 모르기 때문
            int random = (int) ((Math.random() * 45) + 1);  // 1 ~ 45 사이 정수 값 생성
            for (int i = 0; i < lotto.length; i++) {
                if (lotto[i] == random) isExist = true;
            }
            if (!isExist) lotto[index++] = random;
            if (index == lotto.length) break;
            isExist = false;
        }
        Arrays.sort(lotto);
        for (int e : lotto) { System.out.printf("%d ", e); }
        System.out.println();

        // abs() : 절대값 구하기
        System.out.println(Math.abs(25));
        System.out.println(Math.abs(-25));

        // ceil() : 소수점 이하 올림(double), round() : 소수점 이하 반올림(long), floor() : 소수점 이하 버림(double)
        System.out.println(Math.ceil(12.24));
        System.out.println(Math.round(12.79));
        System.out.println(Math.round(12.24));
        System.out.println(Math.floor(12.79));

        // min(), max() : 두 값 중에서 작은 값과 큰 값 판별
        System.out.println(Math.max(12, 59));
        System.out.println(Math.min(12, 59));
    }
}
