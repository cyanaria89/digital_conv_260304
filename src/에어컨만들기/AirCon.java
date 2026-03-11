package 에어컨만들기;
/*
    - 기능 설계
      > 냉방기 ON / OFF
      > 난방기 ON / OFF
      > 바람세기 설정 (1단계 / 2단계 / 3단계)
*/
public class AirCon {
    private boolean power;
    private int tempNow;
    private int tempSet;
    private boolean cooler;
    private boolean heater;
    private int wind;
    final String[] step = { "", "1단계", "2단계", "3단계" };

    // 생성자
    public AirCon() {
        this.power = false;
        this.tempNow = 18;
        this.tempSet = 22;
        this.cooler = true;
        this.heater = false;
        this.wind = 1;
    }

    // Getter, Setter
    // 전원 ON / OFF
    public boolean getPower() { return power; }
    public void setPower(boolean power) {
        this.power = power;
        System.out.println("전원 : " + (power ? "ON" : "OFF"));
    }

    public int getTempNow() { return tempNow; }
    public void setTempNow(int tempNow) { this.tempNow = tempNow; }

    public int getTempSet() { return tempSet; }
    public void setTempSet(int tempSet) { this.tempSet = tempSet; }

    public boolean getCooler() { return cooler; }
    public void setCooler(boolean cooler) {
        this.cooler = cooler;
        System.out.println("냉방 : " + (cooler ? "ON" : "OFF"));
    }

    public boolean getHeater() { return heater; }
    public void setHeater(boolean heater) {
        this.heater = heater;
        System.out.println("난방 : " + (heater ? "ON" : "OFF"));
    }

    public int getWind() { return wind; }
    public void setWind(int wind) { this.wind = wind; }

    // 현재 온도 표시
    public void printTemperature () {
        System.out.println("현재 온도 : " + getTempNow());
        System.out.println("설정 온도 : " + getTempSet());
    }

    // 온도 조절 (1도 단위)
    public void tempControl(int t) {
        if (t == 1) tempSet += 1;
        else tempSet -= 1;
    }

    // 전체 정보 표시
    public void status () {
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
