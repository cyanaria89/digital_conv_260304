package 자동차만들기;

public abstract class Car {
    protected int speed;            // 속도
    protected double fuelEffi;      // 주유 횟수
    protected int fuelTank;         // 연료탱크 크기
    protected int seats;            // 좌석 수
    protected String name;          // 이름
    protected boolean isOn;         // 부가기능

    public int moves(int passengerCount) {
        // 이동 횟수 = 승객 수 / 좌석 수
         return (int) Math.ceil((double)passengerCount / seats);
    }
    public int refueling(int totalDistance) {
        // 주유 횟수 = 총 연료 소모량 / 연료 탱크 크기
        //          총 연료 소모량 = 이동거리 / 연비
         return (int)(Math.ceil((totalDistance / fuelEffi) / fuelTank));
    }
    public int totalCost(int totalDistance) {
         return (int)(totalDistance / fuelEffi * 2000);
    }
    public double totalTime(int distance, int passengerCount, double weather) {
        // 이동 시간 = 거리 / 속도 * 횟수 * 날씨 보정 계수
        return (double)distance / speed * moves(passengerCount) * weather;
    }

    public abstract void setMode(boolean isOn);
}
