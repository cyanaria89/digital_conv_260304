package 객체지향_에어컨만들기;

import java.util.Scanner;

public class AirConMain {
    public static void main(String[] args) {
        AirCon ac = new AirCon();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==== 에어컨 제어 메뉴 ====");
            System.out.println("\t[1] 전원 ON/OFF");
            System.out.println("\t[2] 온도 조절");
            System.out.println("\t[3] 냉방 / 난방");
            System.out.println("\t[4] 바람세기");
            System.out.println("\t[5] 현재 상태 조회");
            System.out.println("\t[0] 시스템 종료");
            System.out.println("=".repeat(22));
            System.out.println("메뉴 선택 : ");
            int menu = sc.nextInt(); sc.nextLine();

            switch (menu) {
                case 1:
                    ac.setPower(!ac.getPower());
                    break;
                case 2:
                    ac.printTemperature();
                    System.out.println("* 온도는 1도씩 조절됩니다.");
                    while (true) {
                        System.out.println("[1] UP  [2] DOWN [3] EXIT : ");
                        int tempUpDown = sc.nextInt(); sc.nextLine();
                        if (tempUpDown == 3) break;
                        else if (tempUpDown == 1 || tempUpDown == 2) {
                            ac.tempControl(tempUpDown);
                            ac.printTemperature();
                        } else System.out.println("잘못된 메뉴 선택입니다.");
                    }
                    break;
                case 3:
                    ac.setHeater(!ac.getHeater());
                    ac.setCooler(!ac.getCooler());
                    break;
                case 4:
                    System.out.print("1단계 / 2단계 / 3단계\n선택 : ");
                    int wind = sc.nextInt(); sc.nextLine();
                    if (wind > 0 && wind < 4) ac.setWind(wind);
                    else System.out.print("범위를 벗어났습니다. 메뉴로 돌아갑니다.");
                case 5:
                    ac.status();
                    break;
                case 0:
                    ac.setPower(false);
                    System.exit(0);
                default:
                    System.out.println("잘못된 메뉴 선택입니다.\n다시 선택해주세요.");
            }
        }
    }
}
