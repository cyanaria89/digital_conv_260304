package 매개변수의다형성_택배배송시스템;

import java.util.Scanner;

public class DeliveryMainA {
    public static void main(String[] args) {
        ManagerA mA = new ManagerA("J");
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] 일반 배송 [2] 퀵 배송 [3] 항공 배송\n>> ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                mA.send(new ParcelDeliveryA("대한통운"));
                break;
            case 2:
                mA.send(new QuickDeliveryA("한진택배"));
                break;
            case 3:
                mA.send(new ExpressDeliveryA("FedEx"));
                break;
            default:
                System.out.println("없는 번호입니다. 시스템을 종료합니다.");
        }
    }
}
