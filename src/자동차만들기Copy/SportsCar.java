package 자동차만들기Copy;

public class SportsCar extends Car implements AirCon, Audio {
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
            this.speed *= 1.2;    // speed(250) * 1.2
        }
    }

    @Override
    public String airCon(boolean onOff) {
        if (onOff) {
            this.fuelEffi *= 0.95;
            return "ON";
        }
        return "OFF";
    }

    @Override
    public String audio(boolean onOff) {
        return (onOff ? "ON" : "OFF");
    }
}
