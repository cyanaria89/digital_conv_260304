package 매개변수의다형성_택배배송시스템;

import java.util.Scanner;

public class DeliveryMain {
    public static void main(String[] args) {
        Manager m = new Manager("M");
        Scanner sc = new Scanner(System.in);

        System.out.print("> Goods 배송 시스템 <\n원하는 배송 방식을 선택하세요\n[1] 일반 배송 [2] 퀵 배송 [3] 항공 배송\n > ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                m.send(new ParcelDelivery("SOOP"));
                break;
            case 2:
                m.send(new QuickDelivery("Chzzk"));
                break;
            case 3:
                m.send(new AirDelivery("Twitch"));
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
        }
    }
}
