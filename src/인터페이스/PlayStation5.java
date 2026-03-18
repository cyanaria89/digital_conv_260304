package 인터페이스;

public class PlayStation5 implements RemoteController {
    private int volume;
    private String title;

    @Override
    public void turnON() {
        System.out.println("WELCOME TO PLAYSTATION5!");
    }

    @Override
    public void turnOFF() {
        System.out.println("GOOD BYE~");
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
        System.out.println("PS5 VOLUME : " + this.volume);
    }

    public void playGame(String title) {
        System.out.printf("게임 [%s]를 실행합니다.\n", title);
    }
}
