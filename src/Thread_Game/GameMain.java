package Thread_Game;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름(Warrior) : ");
        String warriorName = sc.nextLine();

        System.out.print("이름(Wizard) : ");
        String wizardName = sc.nextLine();

        Character warrior = new Character(warriorName, 8, 2, 0.8, 0.5, 40, 500);
        Character wizard = new Character(wizardName, 2, 28, 0.5, 0.9, 100, 250);

        GameThA gameThA = new GameThA(warrior, wizard);
        GameThB gameThB = new GameThB(warrior, wizard);

        gameThA.start();
        gameThB.start();
    }
}
