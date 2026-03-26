package OOP_자동차만들기Answer;

public class Bus extends Car implements AirCon, AutoDrive{
    private boolean isAirCon;
    private boolean isAuto;

    public Bus(String name) {
        super(150, 5, 100, 20, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) this.fuelTank += 30;
    }

    @Override
    void applyOptions() {
        if (isAirCon) fuelEff = (int) (fuelEff * 0.95);
        if (isAuto) maxSpeed = (int) (maxSpeed * 0.9);
    }

    @Override
    void printOptions() {
        System.out.println("에어컨 : " + (isAirCon ? "ON" : "OFF"));
        System.out.println("자율주행 : " + (isAuto ? "ON" : "OFF"));
    }

    @Override
    public void airConOnOff(boolean isOn) {
        this.isAirCon = isOn;
    }

    @Override
    public void autoOnOff(boolean isOn) {
        this.isAuto = isOn;
    }
}
