package 자동차만들기Answer;

public class Bus extends Car {

    public Bus(String name) {
        super(150, 5, 100, 20, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) this.fuelTank += 30;
    }
}
