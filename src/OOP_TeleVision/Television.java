package OOP_TeleVision;

// 전원 ON / OFF
// 볼륨 조절
// 채널 변경

public class Television {
    // 인스턴스 필드 생성, TV의 상태값을 저장
    // 접근제한자 : private, default(키워드 없음), protected, public
    private boolean power;  // 전원 ON / OFF
    private int volume;
    private int channel;

    // 생성자 : 클래스가 객체로 만들어 질 때 호출, 클래스 이름과 동일, 반환 타입 없음, 오버로딩 가능
    //          생성자를 만들지 않으면 숨겨진 기본 생성자가 동작함
    // 생성자의 역할은 인스턴스 필드값을 초기화 하는 목적
    public Television() {
        power = false;
        volume = 10;
        channel = 12;
    }

    // 생성자 오버로딩 : 매개변수의 갯수나 타입에 따라 자동으로 호출 됨 (정적 다형성)
    public Television(boolean onOff, int vol, int ch) {
        power = onOff;
        volume = vol;
        channel = ch;
    }

    // Setter Method : 외부에서 접근 불가능한 인스턴스 필드의 값을 변경하기 위해 사용하는 메서드
    public void setPower(boolean power) {
        this.power = power; // 매개변수 이름과 인스턴스 필드 이름이 동일하면 this(해당객체) 키워드 사용
        System.out.printf("POWER %s\n", (power ? "ON" : "OFF"));
    }
    // Getter Method : 외부에서 접근 불가능한 필드의 값을 읽기 위해 사용하는 메서드
    public boolean getPower() {
        return power;
    }

    public void setVolume(int volume) {
        this.volume = volume;
//        System.out.printf("VOLUME : %d\n", volume);
    }
    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
//        System.out.printf("CHANNEL : %d\n", channel);
    }
    public int getChannel() {
        return channel;
    }

    public void printTV() {
        System.out.println("----- TV Information -----");
        System.out.printf("\tPOWER   : %s\n", (power ? "ON" : "OFF"));
        System.out.printf("\tVOLUME  : %d\n", volume);
        System.out.printf("\tCHANNEL  : %d\n", channel);
        System.out.println("-".repeat(26));
    }

}
