package OOP_인터페이스;
/*
    인터페이스 : 클래스가 구현해야 할 메서드들의 설계 명세서
    - "이런 기능을 제공해야 함"이라는 규칙 또는 약속을 정의(강제)
    - 이를 통해 다양한 클래스가 동일한 기능을 일관된 형식으로 구현
    - 기본적으로 모든 메서드가 추상메서드 (예외 사항 있음)
    - 모든 필드는 상수로 변경 (public static final 이 자동 추가됨) - 상속 X, 객체 생성 X
    - 다중 상속?구현? 가능 (여러개의 implements 가능)
    - 선언 interface, 호출 implements

    default method : 인터페이스에 있는 구현 메서드
*/
public interface RemoteController {
    // 단순 참고용? 상속 안됨
    // 자동으로 public static final 이 붙는다고 생각
    int MIN_VOLUME = 0;
    int MAX_VOLUME = 100;

    // interface는 모두 추상 메서드이기 때문에 abstract 키워드 안써도 됨 (물론 써도 됨)
    // public abstract 가 자동으로 붙는다고 생각하면 됨
    void turnON();
    void turnOFF();
    void setVolume(int volume);

    static void changeBattery() {
        System.out.println("건전지를 교체 합니다.");
    }

    // default 키워드를 사용해 interface 내부에 구현 메서드 작성 가능
    default void setMute(boolean mute) {
        if (mute) System.out.println("음소거 ON");
        else System.out.println("음소거 OFF");
    }
}
