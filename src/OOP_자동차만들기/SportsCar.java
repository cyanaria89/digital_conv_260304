package OOP_자동차만들기;

public class SportsCar extends Car {
    public SportsCar(String name) {
        this.speed = 250;       // 속도 km / h
        this.fuelEffi = 8.0;    // 연비 km / L
        this.fuelTank = 30;     // 연료탱크 L
        this.seats = 2;         // 좌석 수
        this.name = name;       // 이름
        this.isOn = false;      // 부가기능 ON / OFF
    }

    // SportsCar 부가기능 : turbo - speed 20% 증가
    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            speed = 300;    // speed(250) * 1.2
        }
    }
}
