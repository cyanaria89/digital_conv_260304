package OOP_상속_TV;

import java.util.Scanner;

public class TVMain {
    public static void main(String[] args) {
        ProductTV smartTV = new ProductTV(false, 24, 12, "Samsung Smart TV");
        Scanner sc = new Scanner(System.in);

/*      TV 메뉴 만들기
        1. TV 켜기
        2. Volume 설정
        3. Channel 변경 시 Smart 기능 켜면 채널 설정은 없음
            - Smart 기능 끄면 채널 설정 활성화
*/

        while (true) {
            System.out.println("ㆍㆍㆍ☞ TV Menu ☜ㆍㆍㆍ");
            System.out.println("\t1. POWER ON");
            System.out.println("\t2. VOLUME");
            System.out.println("\t3. CHANNEL");
            System.out.println("\t4. TV Status");
            System.out.println("\t5. POWER OFF");
            System.out.println("ㆍ".repeat(13));
            System.out.print("Menu Select : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    /*
                    System.out.print("TV 전원을 켜시겠습니까? (yes / no) : ");
                    String power = sc.next();
                    if (power.equals("yes")) smartTV.setPower(true);
                    else smartTV.setPower(false);
                    */
                    smartTV.setPower(true);
                    break;
                case 2:
                    /*
                    System.out.print("볼륨값 입력 : ");
                    int vol = sc.nextInt();
                    smartTV.setVolume(vol);
                    */
                    System.out.print("Volume (0 ~ 100) : ");
                    int vol = sc.nextInt();
                    smartTV.setVolume(vol);
                    break;
                case 3:
                    /*
                    System.out.print("스마트 모드 켜기 (ON/OFF) : ");
                    String smart = sc.next().toUpperCase();
                    if (smart.equals("ON")) {
                        smartTV.setChannel(0, true);
                    } else {
                        System.out.print("채널값 입력 : ");
                        int ch = sc.nextInt();
                        smartTV.setChannel(ch);
                    }
                    */
                    System.out.print("Smart Mode [Y / N] : ");
                    char sMode = sc.next().toUpperCase().charAt(0);
                    if (sMode == 'Y') {
                        smartTV.setChannel(0, true);
                    } else if (sMode == 'N') {
                        System.out.print("Channel (1 ~ 1999) : ");
                        int ch = sc.nextInt();
                        smartTV.setChannel(ch);
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                case 4:
                    smartTV.printTVStatus();
                    break;
                case 5:
                    System.out.println("POWER OFF!");
                    return;
                default:
                    System.out.println("Menu Select Error!");
            }
        }
    }
}
