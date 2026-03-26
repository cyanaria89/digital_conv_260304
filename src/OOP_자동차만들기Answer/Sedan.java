package OOP_자동차만들기Answer;

public class Sedan extends Car implements AirCon, Audio, AutoDrive {
    private boolean isAirCon;
    private boolean isAudio;
    private boolean isAuto;

    public Sedan(String name) {
        super(200, 12, 45, 4, name);
        this.isAirCon = false;
        this.isAudio = false;
        this.isAuto = false;
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) this.seatCnt += 1;
    }

    @Override
    void applyOptions() {
        if (isAirCon) fuelEff = (int) (fuelEff * 0.95);
        if (isAuto) maxSpeed = (int) (maxSpeed * 0.9);
    }

    @Override
    void printOptions() {
        System.out.println("에어컨 : " + (isAirCon ? "ON" : "OFF"));
        System.out.println("오디오 : " + (isAudio ? "ON" : "OFF"));
        System.out.println("자율주행 : " + (isAuto ? "ON" : "OFF"));
    }

    @Override
    public void airConOnOff(boolean isOn) {
        this.isAirCon = isOn;
    }

    @Override
    public void audioOnOff(boolean isOn) {
        this.isAudio = isOn;
    }

    @Override
    public void autoOnOff(boolean isOn) {
        this.isAuto = isOn;
    }
}
