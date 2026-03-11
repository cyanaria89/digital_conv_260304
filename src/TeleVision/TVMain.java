package TeleVision;


import java.util.Scanner;

public class TVMain {
    public static void main(String[] args) {
        // Television 클래스로 TV 객체 5개 생성
        Television tv1 = new Television();
        Television tv2 = new Television();
        Television tv3 = new Television();
        Television tv4 = new Television();
        Television tv5 = new Television();

        /*  메뉴 만들기 : 생성된 객체 중 아무거나 1개 객체 선정
            1. POWER ON
            2. VOLUME
            3. CHANNEL
            4. TV Status
            5. POWER OFF    */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==== TV Control Menu ====");
            System.out.println("\t1. POWER ON");
            System.out.println("\t2. VOLUME");
            System.out.println("\t3. CHANNEL");
            System.out.println("\t4. TV Status");
            System.out.println("\t5. POWER OFF");
            System.out.println("=".repeat(25));
            System.out.print("Menu Select : ");
            int menu = sc.nextInt(); sc.nextLine();

            switch (menu) {
                case 1:
                    tv3.setPower(true);
                    break;
                case 2:
                    System.out.print("Volume -> ");
                    int vol = sc.nextInt(); sc.nextLine();
                    tv3.setVolume(vol);
                    break;
                case 3:
                    System.out.print("Channel -> ");
                    int ch = sc.nextInt(); sc.nextLine();
                    tv3.setChannel(ch);
                    break;
                case 4:
                    tv3.printTV();
                    break;
                case 5:
                    tv3.setPower(false);
                    return;
                default:
                    System.out.println("Menu Select Error!");
                    break;
            }
        }
    }
}
