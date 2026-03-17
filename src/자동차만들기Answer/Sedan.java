package 자동차만들기Answer;

public class Sedan extends Car {
    public Sedan(String name) {
        super(200, 12, 45, 4, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) this.seatCnt += 1;
    }
}
