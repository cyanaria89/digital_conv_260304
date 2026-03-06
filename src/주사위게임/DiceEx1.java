package 주사위게임;

// int rand = (int) (Math.random() * 6) + 1; // 1 ~ 6 사이의 임의의 정수를 생성

public class DiceEx1 {
    public static void main(String[] args) {
        // 2개의 주사위를 굴려서 같은 수가 나오면 무인도 탈출
        // 탈출 시 주사위 값 및 시행 횟수 표시
        int rand1 = 0, rand2 = 0, cnt = 0;

        while (true) { // 반복 횟수를 알 수 없을 때 사용, 내부에서 오류발생 시 무한 반복될 수 있으므로 주의
            cnt++;
            rand1 = (int) (Math.random() * 6) + 1;
            rand2 = (int) (Math.random() * 6) + 1;
//            System.out.println("시행 회차 : " + cnt + ", 주사위1 : " + rand1 + ", 주사위2 : " + rand2);
            if (rand1 == rand2) {
                System.out.println("최종 결과 [주사위 숫자 : " + rand1 + ", 시행 횟수 : " + cnt + "회]");
                break;
            }
        }

    }
}
