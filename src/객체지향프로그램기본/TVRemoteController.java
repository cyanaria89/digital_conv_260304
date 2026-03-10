package 객체지향프로그램기본;

// Power, Volume, Channel
public class TVRemoteController {
    // Instance Field 정의 : 내부의 상태값을 저장, 객체의 갯수 만큼 생성됨 (객체마다 독립적인 값을 가짐)
    // 접근 제한자 : private - 클래스 내부에서만 접근 가능, 외부에서 접근 불가 (캡슐화)
    private boolean power;  // Power (On/Off)
    private int volume;     // Volume
    private int channel;    // Channel

    // 생성자 : 클래스가 객체로 만들어 질 때 자동 호출, 클래스 이름과 동일, 반환 타입 없음, 인스턴스 필드에 대한 초기값 부여
    TVRemoteController() {
        power = false;
        volume = 10;
        channel = 11;
    }

    // setter 메서드 : 필드에 값을 쓰는 메서드
    public void setPower(boolean onOff) {
        power = onOff;
        System.out.println("전원을 " + (power ? "ON" : "OFF") + " 합니다.");
    }
    // getter 메서드 : 필드의 값을 읽는 메서드
    public boolean getPower() {
        return power;
    }

    public void setVolume(int vol) {
        volume = vol;
        System.out.println("볼륨을 " + volume + " (으)로 변경합니다.");
    }
    public int getVolume() {
        return  volume;
    }

    public void setChannel(int ch) {
        channel = ch;
        System.out.println("채널을 " + channel + " (으)로 변경합니다.");
    }
    public int getChannel() {
        return  channel;
    }

    // 현재의 리모콘 설정 상태를 출력
    void printRemoteController() {
        System.out.println("--- TV RemoteController Status ---");
        // 전원 : 삼항연산자 사용
        System.out.println("\tP O W E R\t\t:\t" + (power ? "ON" : "OFF"));
        // Channel 정보 출력
        System.out.println("\tC H A N N E L\t:\t" + channel);
        // Volume 정보 출력
        System.out.println("\tV O L U M E\t\t:\t" + volume);
        System.out.println("----------------------------------");
    }
}

