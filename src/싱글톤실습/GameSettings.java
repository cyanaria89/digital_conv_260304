package 싱글톤실습;

public class GameSettings {
    int resolution;
    int volume;
    String difficulty;

    private static GameSettings settings = new GameSettings();

    private GameSettings() {
        resolution = 1024;
        volume = 20;
        difficulty = "normal";
    }

    static GameSettings getInstance() { return settings; }
}
