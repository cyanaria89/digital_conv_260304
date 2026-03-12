package 상속TV;

// ProtoTypeTV 를 상속받아 ProductTV Class 생성
public class ProductTV extends ProtoTypeTV {
    String name;
    boolean isSmart;

    ProductTV() {
        super();
        this.name = "TV";
        this.isSmart = false;
    }

    // 생성자 Overloading
    ProductTV(boolean power, int channel, int volume, String name) {
        // 부모의 생성자를 호출, 자식 객체가 만들어지려면 생성자에서 부모의 생성자를 먼저 불러야 함
        super(power, channel, volume);
        this.name = name;
        this.isSmart = false; // this 생략 가능 (변수명이 같으면 생략 시 오류 발생)
    }

    // 봄륨 설정 : 0 ~ 100, 그 외는 오류 처리
    @Override
    void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume : " + volume);
        } else {
            System.out.println("설정 범위를 벗어났습니다.");
        }
    }

    // 채널 설정 (Overriding) : 1 ~ 1999
    @Override
    void setChannel(int channel) {
        if (channel >= 1 && channel <= 1999) {
            this.channel = channel;
            System.out.println("Channel : " + channel);
        } else {
            System.out.println("존재하지 않는 채널입니다.");
        }
    }

    // 오버라이딩 된 기능을 오버로딩해서 스마트 모드 추가
    // 스마트 기능을 켜면 인터넷 기능이 켜지고 채널 설정 무시
    void setChannel(int channel, boolean isSmart) {
        if (isSmart) {
            this.isSmart = true;
        } else {
            setChannel(channel);
        }
    }

    // TV 정보 출력
    void printTVStatus() {
        System.out.println("-".repeat(20));
        System.out.println("\tTV Status");
        System.out.println("Name\t\t: " + name);
        System.out.println("Power\t\t: " + (power ? "ON" : "OFF"));
        System.out.println("Smart Mode\t: " + (isSmart ? "ON" : "OFF"));
        System.out.println("Channel\t\t: " + channel + "번");
        System.out.println("Volume\t\t: " + volume);
        System.out.println("-".repeat(20));
    }
}
