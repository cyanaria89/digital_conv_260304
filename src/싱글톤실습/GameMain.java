package 싱글톤실습;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();

        System.out.println("-- Player1 Settings --");
        System.out.println("해상도 : 4096\n음량 : 30\n난이도 : Hard");
        p1.setPlayerSettings(4096, 30, "Hard");
        System.out.println("-- Player2 Settings --");
        System.out.println("해상도 : 2048\n음량 : 12\n난이도 : Normal");
        p2.setPlayerSettings(2048, 12, "Normal");

        Scanner sc = new Scanner(System.in);
        System.out.println("-- Choose Player --");
        System.out.print("p1 or p2 : ");
        String choose = sc.nextLine();
        if (choose.equals("p1")) {
            p1.setSettings(p1.getRes(), p1.getVol(), p1.getDiff());
            p1.printSettings();
        } else if (choose.equals("p2")) {
            p2.setSettings(p2.getRes(), p2.getVol(), p2.getDiff());
            p2.printSettings();
        } else {
            System.out.println("Choose Error!");
        }

//        p1.setSettings(4096, 25, "Hard");
//        p2.printSettings();
    }
}
