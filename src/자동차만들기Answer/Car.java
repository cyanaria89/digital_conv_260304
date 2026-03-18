package 자동차만들기Answer;

import java.text.DecimalFormat;

import static 자동차만들기Answer.Common.FUEL_PRICE;

public abstract class Car {
    protected int maxSpeed; // 최고 속도
    protected int fuelEff;  // 연비 (리터 당 주행 거리)
    protected int fuelTank; // 연료 탱크 크기
    protected int seatCnt;  // 좌석 수
    protected String name;  // 자동차 이름

    // 매개변수가 있는 생성자 생성 -> 기본 생성자 없음
    public Car(int maxSpeed, int fuelEff, int fuelTank, int seatCnt, String name) {
        this.maxSpeed = maxSpeed;
        this.fuelEff = fuelEff;
        this.fuelTank = fuelTank;
        this.seatCnt = seatCnt;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 총 이동 횟수
    int getMovingCnt(int passCnt) {
        return (int) Math.ceil((double) passCnt / seatCnt);
    }

    // 총 주유 횟수
    int getRefuelCnt(int dist, int moveCnt) {
        double totalDistance = dist * moveCnt;          // 총 이동 거리
        double totalFuel = totalDistance / fuelEff;     // 총 사용 연료
        return (int) Math.ceil(totalFuel / fuelTank);   // 주유 횟수
    }

    // 총 이동 비용
    String getTotalCost(int dist, int moveCnt) {
        double totalDistance = dist * moveCnt;
        double totalFuel = totalDistance / fuelEff;
        long totalCost = Math.round(totalFuel * FUEL_PRICE);
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(totalCost);
    }

    // 총 소요 시간
    String getMovingTime(int dist, int moveCnt, int weather) {
        double getTime = (double) dist * moveCnt / maxSpeed;

        switch (weather) {
            case 2: getTime *= 1.2; break;
            case 3: getTime *= 1.4; break;
            default:
        }

        int totalMinute = (int) (getTime * 60);
        int hour = totalMinute / 60;
        int minute = totalMinute % 60;
        return String.format("%d시간 %d분", hour, minute);
    }

    // 부가기능
    abstract void setMode(boolean isMode);  // 상속받은 차량의 특수 기능
    abstract void applyOptions();           // 에어컨, 오디오, 자율주행 기능이 주행에 미치는 영향 구현
    abstract void printOptions();           // 옵션 OnOff 출력
}
