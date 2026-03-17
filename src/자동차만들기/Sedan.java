package 자동차만들기;

public class Sedan extends Car {
    public Sedan(String name) {
        this.speed = 200;       // 속도 km / h
        this.fuelEffi = 12.0;   // 연비 km / L
        this.fuelTank = 45;     // 연료탱크 L
        this.seats = 4;         // 좌석 수
        this.name = name;       // 이름
        this.isOn = false;      // 부가기능 ON / OFF
    }

    // Sedan 부가기능 : 트렁크 좌석화 - 좌석 1 추가
    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            seats = 5;  // seats(4) + 1
        }
    }
}
