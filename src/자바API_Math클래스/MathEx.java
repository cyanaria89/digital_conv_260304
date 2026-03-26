package 자바API_Math클래스;
/*
    실습문제
    1. 일주일 기온 데이터 출력
    2. 최저기온, 최고기온, 주간 온도차 출력
*/
public class MathEx {
    public static void main(String[] args) {
        int[] temps = { -5, 3, -12, 7, -1, 15, -8 };
        String[] day = { "월", "화", "수", "목", "금", "토", "일" };
        System.out.println("=== 일평균 기온 ===");
        // 기온 데이터 출력
        for (int i = 0; i < temps.length; i++) {
            System.out.printf("  %s요일 : %3d도\n", day[i], temps[i]);
        }
        System.out.println("------------------");
        // 최저기온, 최고기온, 주간 온도차
        int max = temps[0], min = temps[0], abs;
        for (int i = 1; i < temps.length; i++) {
            max = Math.max(max, temps[i]);
            min = Math.min(min, temps[i]);
        }
        abs = Math.abs(max - min);
        System.out.printf("최저기온 : %3d도\n최고기온 : %3d도\n주간 온도차 : %3d도\n", min, max, abs);
        System.out.println("==================");
    }
}
