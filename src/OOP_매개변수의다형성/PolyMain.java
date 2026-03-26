package OOP_매개변수의다형성;

import java.util.Scanner;

/*
    OverLoading : 정적 다형성, Method 이름은 동일, 매개변수의 개수나 타입으로 호출할 Method를 결정
    Overriding : 동적 다형성, 부모 클래스로 부터 상속받은 Method를 재정의해서 사용하는 것
*/
public class PolyMain {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[1] TV\n[2] Phone\n[3] Computer\n[4] Buyer Info\n[5] Exit");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    buyer.buy(new TV());
                    break;
                case 2:
                    buyer.buy(new Phone());
                    break;
                case 3:
                    buyer.buy(new Computer());
                    break;
                case 4:
                    buyer.printInfo();
                    break;
                case 5:
                    System.out.println("Shutdown!");
                    return;
                default:
                    System.out.println("Menu! Select! Error!");
            }
        }
    }
}
