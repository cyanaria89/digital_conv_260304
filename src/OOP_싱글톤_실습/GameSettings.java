package OOP_싱글톤_실습;

public class GameSettings {
    private String resolution;
    private int volume;
    private String difficulty;

    private static GameSettings settings = new GameSettings();

    private GameSettings() {
        resolution = "1080P";
        volume = 20;
        difficulty = "Normal";
    }

    public static GameSettings getInstance() { return settings; }

    public String getResolution() { return resolution; }
    public void setResolution(String resolution) { this.resolution = resolution; }

    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }

    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
}
