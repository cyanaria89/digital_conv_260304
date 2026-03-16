package 싱글톤실습;

public class Player {
    private String name;

    public Player(String name) { this.name = name; }

    // 설정 변경
    public void changeSettings(String resolution, int volume, String difficulty) {
        GameSettings settings = GameSettings.getInstance();

        settings.setResolution(resolution);
        settings.setVolume(volume);
        settings.setDifficulty(difficulty);

        System.out.println(name + " > 설정 완료!");
    }

    // 현재 설정 확인
    public void printSettings() {
        GameSettings settings = GameSettings.getInstance();

        System.out.println("해상도\t: " + settings.getResolution());
        System.out.println("음량\t\t: " + settings.getVolume());
        System.out.println("난이도\t: " + settings.getDifficulty());
    }
}
