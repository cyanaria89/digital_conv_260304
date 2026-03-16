package 자동차만들기;

public class Bus extends Car {
    public Bus(String name) {
        this.speed = 150;       // km / h
        this.fuelEffi = 5.0;    // km / L
        this.fuelTank = 100;     // L
        this.seats = 20;
        this.name = name;
        this.isOn = false;
    }

    @Override
    public void setMode(boolean isOn) {
        if (isOn) {
            fuelTank = 130; // fuelTank(100) + 30
        }
    }
}
