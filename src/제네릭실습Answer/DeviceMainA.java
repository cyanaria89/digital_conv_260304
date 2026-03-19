package 제네릭실습Answer;

import java.util.Scanner;

public class DeviceMainA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DController<DeviceA> dc = new DController<>();
        DeviceA device = null;
        System.out.print("기기 선택 [1]프린터 [2]모니터 [3]키보드\n선택 : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1: device = new PrinterA(); break;
            case 2: device = new MonitorA(); break;
            case 3: device = new KeyBoardA(); break;
            default: System.out.println("기기 성택이 잘못되었습니다.");
        }

        dc.setDevice(device);
        dc.powerOn();
        dc.powerOff();

        sc.close();
    }
}
