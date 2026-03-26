package OOP_추상클래스;

public class AndroidPhone extends Phone {

    public AndroidPhone(String name, boolean power) {
        super(name, power);
    }

    // 추상 메서드를 상속받아 자식 클래스에서 Call 기능 구현
    @Override
    public void call() {
        System.out.println("Android 전화 왔다아~");
    }

    @Override
    public void setMode(boolean mode) {
        if (mode) {
            System.out.println("Google Store 기능을 활성화합니다.");
            this.mode = true;
        } else {
            System.out.println("Google Store 기능을 비활성화합니다.");
            this.mode = false;
        }
    }

    @Override
    public boolean getMode() {
        return this.mode;
    }
}
