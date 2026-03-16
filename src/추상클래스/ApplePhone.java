package 추상클래스;

public class ApplePhone extends Phone {

    public ApplePhone(String name, boolean power) {
        super(name, power);
    }

    @Override
    public void call() {
        System.out.println("iOS 전화 왔다아아아아");
    }

    @Override
    public void setMode(boolean mode) {
        if (mode) {
            System.out.println("Air Drop 기능을 활성화합니다.");
            this.mode = true;
        } else {
            System.out.println("Air Drop 기능을 비활성화합니다.");
            this.mode = false;
        }
    }

    @Override
    public boolean getMode() {
        return this.mode;
    }
}
