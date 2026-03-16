package 자동차만들기;

public class Sedan extends Car {
    public Sedan(String name) {
        this.speed = 200;       // km / h
        this.fuelEffi = 12.0;    // km / L
        this.fuelTank = 45;     // L
        this.seats = 4;
        this.name = name;
        this.isOn = false;
    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            seats = 5;  // seats(4) + 1
        }
    }
}
