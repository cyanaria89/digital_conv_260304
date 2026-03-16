package 에어컨만들기Answer;

import java.util.Scanner;

public class AirConMainB {
    public static void main(String[] args) {
        AirConB myAirCon = new AirConB();
        SmartAirConB mySmartAC = new SmartAirConB();
        Scanner sc = new Scanner(System.in);

        System.out.print("에어컨을 켜시겠습니까? (yes / no) : ");
        String onOff = sc.nextLine();

        if (onOff.equalsIgnoreCase("yes")) {
            mySmartAC.setPower(true);
            mySmartAC.setAirCon(sc);
            mySmartAC.operate();
        } else {
            System.out.println("에어컨을 켜지 않습니다.");
        }
    }
}
