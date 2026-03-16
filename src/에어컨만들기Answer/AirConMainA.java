package 에어컨만들기Answer;

import java.util.Scanner;

public class AirConMainA {
    public static void main(String[] args) {
        AirConA myAirCon = new AirConA();
        Scanner sc = new Scanner(System.in);

        System.out.print("에어컨을 켜시겠습니까? (yes / no) : ");
        String onOff = sc.nextLine();

        if (onOff.equalsIgnoreCase("yes")) {
            myAirCon.power = true;  // 원래는 Getter를 사용하는게 원칙
            myAirCon.setAirCon(sc);
            myAirCon.operate();
        } else {
            System.out.println("에어컨을 켜지 않습니다.");
        }
    }
}
