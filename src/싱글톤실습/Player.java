package 싱글톤실습;

public class Player {
    GameSettings settings = GameSettings.getInstance();

    void setSettings(int resolution, int volume, String difficulty) {
        settings.resolution = resolution;
        settings.volume = volume;
        settings.difficulty = difficulty;
    }

    void printSettings() {
        System.out.println("해상도\t: " + settings.resolution);
        System.out.println("음량\t\t: " + settings.volume);
        System.out.println("난이도\t: " + settings.difficulty);
    }

    private int res;
    private int vol;
    private String diff;

    public void setPlayerSettings (int res, int vol, String diff) {
        this.res = res;
        this.vol = vol;
        this.diff = diff;
    }

    public int getRes() { return res; }
    public int getVol() { return vol; }
    public String getDiff() { return diff; }
}
