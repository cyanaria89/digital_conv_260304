package 자동차만들기;

public class SportsCar extends Car {
    public SportsCar(String name) {
        this.speed = 250;       // km / h
        this.fuelEffi = 8.0;    // km / L
        this.fuelTank = 30;     // L
        this.seats = 2;
        this.name = name;
        this.isOn = false;
    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            speed = 300;    // speed(250) * 1.2
        }
    }
}
