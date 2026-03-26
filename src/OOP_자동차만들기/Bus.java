package OOP_자동차만들기;

public class Bus extends Car {
    public Bus(String name) {
        this.speed = 150;       // 속도 km / h
        this.fuelEffi = 5.0;    // 연비 km / L
        this.fuelTank = 100;    // 연료탱크 L
        this.seats = 20;        // 좌석 수
        this.name = name;       // 이름
        this.isOn = false;      // 부가기능 ON / OFF
    }

    // Bus 부가기능 : 연료탱크 30L 추가
    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            fuelTank = 130; // fuelTank(100) + 30
        }
    }
}
