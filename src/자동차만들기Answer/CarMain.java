package 자동차만들기Answer;

import java.util.Scanner;

import static 자동차만들기Answer.Common.DISTANCE;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 부모클래스 참조 변수
        Car car = null;
        // loc : 거리, cnt : 승객 수, type : 차량 타입, option : 부가기능, weather : 날씨 계수
        int loc, cnt, type, option, weather;

        // 이동 지역
        while (true) {
            System.out.print("\n이동 지역 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            loc = sc.nextInt();
            if (loc >= 1 && loc <= 4) break;
            System.out.println("이동할 지역 선택이 잘못되었습니다.");
        }

        // 승객 수
        while (true) {
            System.out.print("이동할 승객 수 입력 (1 ~ 100) : ");
            cnt = sc.nextInt();
            if (cnt >= 1 && cnt <= 100) break;
            System.out.println("승객 수는 1 ~ 100명 사이어야 합니다.");
        }

        // 차량 선택
        while (true) {
            System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            type = sc.nextInt();
            if (type >= 1 && type <= 3) break;
            System.out.println("차량 선택이 잘못되었습니다.");
        }

        // 부가 기능
        while (true) {
            System.out.print("부가 기능 [1]ON [2]OFF : ");
            option = sc.nextInt();
            if (option >= 1 && option <= 2) break;
            System.out.println("모드 선택이 잘못되었습니다.");
        }
        boolean isMode = (option == 1);

        // 자동차 객체 대입
        switch (type) {
            case 1: car = new SportCar("아벤타도르"); break;
            case 2: car = new Sedan("G70"); break;
            case 3: car = new Bus("County"); break;
            default: System.out.println("없는 차량 입니다.");
        }

        car.setMode(isMode);

        // 날씨 보정 계수
        while (true) {
            System.out.print("날씨 선택 [1]맑음 [2]비 [3]눈 : ");
            weather = sc.nextInt();
            if (weather >= 1 && weather <= 3) break;
            System.out.println("날씨 선택이 잘못되었습니다.");
        }

        int moveCnt = car.getMovingCnt(cnt);
        System.out.println("=".repeat(7) + car.getName() + "=".repeat(7));
        System.out.println("총 비용 : " + car.getTotalCost(DISTANCE[loc], moveCnt) + "원");
        System.out.println("총 주유 횟수 : " + car.getRefuelCnt(DISTANCE[loc], moveCnt) + "회");
        System.out.println("이동 시간 : " + car.getMovingTime(DISTANCE[loc], moveCnt, weather));
    }
}
