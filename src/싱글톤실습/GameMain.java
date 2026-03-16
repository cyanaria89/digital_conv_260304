package 싱글톤실습;

public class GameMain {
    public static void main(String[] args) {
        Player p1 = new Player("First");
        Player p2 = new Player("Unknown");

        // 게임 설정
        // 720p(HD / 1280 x 720), 1080p(FHD / 1920 x 1080), 1440p(QHD / 2560 x 1440), 2160p(4K UHD / 3840 x 2160)
        p1.changeSettings("4K", 25, "Hard");

        p1.printSettings();
        p2.printSettings();

        // 동일 인스턴스 여부 확인
        GameSettings s1 = GameSettings.getInstance();
        GameSettings s2 = GameSettings.getInstance();
        System.out.println(s1 == s2);   // 주소가 같은지 확인
    }
}
