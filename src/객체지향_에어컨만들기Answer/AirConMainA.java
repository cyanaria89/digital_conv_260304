package 객체지향_에어컨만들기Answer;

import java.util.Scanner;

public class AirConMainA {
    public static void main(String[] args) {
        AirConA myAirCon = new AirConA();
        Scanner sc = new Scanner(System.in);

        System.out.print("에어컨을 켜시겠습니까? (yes / no) : ");
        String onOff = sc.nextLine();

        if (onOff.equalsIgnoreCase("yes")) {
            myAirCon.setPower(true);
            myAirCon.setAirCon(sc);
            myAirCon.operate();
        } else {
            System.out.println("에어컨을 켜지 않습니다.");
        }
    }
}
