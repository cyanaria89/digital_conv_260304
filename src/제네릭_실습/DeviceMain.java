package 제네릭_실습;

import java.util.Scanner;

public class DeviceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("기기 선택 [1]프린터 [2]모니터 [3]키보드\n선택 : ");
        int choice = sc.nextInt();
        System.out.println("=".repeat(18));

        switch (choice) {
            case 1:
                runDevice(new Printer());
                break;
            case 2:
                runDevice(new Monitor());
                break;
            case 3:
                runDevice(new KeyBoard());
                break;
            default:
                System.out.println("Unknown Device;;;");
        }
    }

    public static <T extends Device> void runDevice(T device) {
        DeviceController<T> ctrl = new DeviceController<>();
        ctrl.setDevice(device);
        System.out.println(ctrl.getDevice());
        ctrl.powerOn();
        ctrl.powerOff();
    }
}
