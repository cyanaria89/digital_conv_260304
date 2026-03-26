package OOP_인터페이스;

public class TeleVision implements RemoteController {
    private int volume;
    private int channel;

    @Override
    public void turnON() {
        System.out.println("TV POWER ON!!");
    }

    @Override
    public void turnOFF() {
        System.out.println("TV POWER OFF!");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteController.MAX_VOLUME) {
            this.volume = RemoteController.MAX_VOLUME;
        } else if (volume < RemoteController.MIN_VOLUME) {
            this.volume = RemoteController.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 음량 : " + this.volume);
    }

    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 999) {
            this.channel = channel;
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
}
