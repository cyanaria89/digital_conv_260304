package 추상클래스;
/*
    추상클래스
    - 객체를 만들 수 없는 클래스 (구현부가 없기 때문)
    - 일반 메서드와 추상 메서드가 공존하는 경우도 있음
    - 공통 기능은 묶어 제공하고, 자식 클래스가 구현해야 할 메서드를 강제
    - 일반상속(extends)은 1개만 가능, 추상상속?(Interface)은 제한 없음
*/
public class AbstractMain {
    public static void main(String[] args) {
        AndroidPhone andPhone = new AndroidPhone("Samsung", true);
        ApplePhone appPhone = new ApplePhone("Apple", true);

        andPhone.call();
        andPhone.setMode(true);
        appPhone.call();
        appPhone.setMode(true);

    }
}
