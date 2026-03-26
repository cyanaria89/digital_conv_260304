package OOP_자동차만들기Answer;

public class SportCar extends Car implements AirCon, Audio {
    private boolean isAirCon;
    private boolean isAudio;

    public SportCar(String name) {
        super(250, 8, 30, 2, name);
        this.isAirCon = false;
        this.isAudio = false;
    }

    @Override
    void setMode(boolean isMode) { if (isMode) this.maxSpeed *= 1.2; }

    @Override
    void applyOptions() {
        if (isAirCon) fuelEff = (int) (fuelEff * 0.95);
    }

    @Override
    void printOptions() {
        System.out.println("에어컨 : " + (isAirCon ? "ON" : "OFF"));
        System.out.println("오디오 : " + (isAudio ? "ON" : "OFF"));
    }

    @Override
    public void airConOnOff(boolean isOn) {
        this.isAirCon = isOn;
    }

    @Override
    public void audioOnOff(boolean isOn) {
        this.isAudio = isOn;
    }
}
