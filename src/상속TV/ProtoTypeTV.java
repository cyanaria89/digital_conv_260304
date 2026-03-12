package 상속TV;

// 상속을 주기 위한 TV 만들기

public class ProtoTypeTV {
    // 전원
    protected boolean power;
    // 채널
    protected int channel;
    // 볼륨
    protected int volume;

    // 매개변수 없는 생성자 - 기본 생성자, 자동 생성됨
    ProtoTypeTV() {
        this.power = false;
        this.channel = 10;
        this.volume = 15;
    }

    // 매개변수 전부 있는 생성자
    ProtoTypeTV(boolean power, int channel, int volume) {
        this.power = power;
        this.channel = channel;
        this.volume = volume;
    }

    // 전원 On / Off
    void setPower(boolean power) {
        this.power = power;
        System.out.println("POWER " + (power ? "ON" : "OFF"));
    }

    // 채널은 1 ~ 999
    void setChannel(int channel) {
        if (channel > 0 && channel < 1000) {
            this.channel = channel;
        } else {
            System.out.println("존재하지 않는 채널");
        }
    }

    // 볼륨 설정
    void setVolume(int volume) {
        this.volume = volume;
    }
}
