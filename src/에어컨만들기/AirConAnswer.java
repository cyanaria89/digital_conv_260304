package 에어컨만들기;

public class AirConAnswer {
    boolean power;  // 전원 : ON / OFF
    int tempSet;    // 온도 설정
    int tempNow;    // 현재 온도 표시
    boolean cooler; // 냉방 : ON / OFF
    boolean heater; // 히터 : ON / OFF
    int wind;       // 바람 세기 : 1 / 2 / 3

    public AirConAnswer() {
        this.power = false;
        this.tempSet = 20;
        this.tempNow = 20;
        this.cooler = false;
        this.heater = false;
        this.wind = 1;
    }

    public boolean isPower() { return power; }
    public void setPower(boolean power) { this.power = power; }

    public int getTempSet() { return tempSet; }
    public void setTempSet(int tempSet) { this.tempSet = tempSet; }

    public int getTempNow() { return tempNow; }
    public void setTempNow(int tempNow) { this.tempNow = tempNow; }

    public boolean isCooler() { return cooler; }
    public void setCooler(boolean cooler) { this.cooler = cooler; }

    public boolean isHeater() { return heater; }
    public void setHeater(boolean heater) { this.heater = heater; }

    public int getWind() { return wind; }
    public void setWind(int wind) { this.wind = wind; }

    public void printAirCon() {
        final String[] step = { "", "1단계", "2단계", "3단계" };
        System.out.println("====== 에어컨 정보 ======");
        System.out.println("전원 " + (power ? "On" : "Off"));
        System.out.println("현재 온도 : " + getTempNow());
        System.out.println("설정 온도 : " + getTempSet());
        System.out.println("냉방 모드 : " + (cooler ? "On" : "Off"));
        System.out.println("난방 모드 : " + (heater ? "On" : "Off"));
        System.out.println("바람 세기 : " + step[wind]);
        System.out.println("=".repeat(24));
    }
}
