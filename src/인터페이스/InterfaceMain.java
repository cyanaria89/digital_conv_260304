package 인터페이스;

import java.util.Scanner;

public class InterfaceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("리모콘으로 동작할 제품 선택 [1]TV [2]PS5 : ");
        int menu = sc.nextInt();

        RemoteController rc = null;
        if (menu == 1) {
            /*
                TeleVision tv = new TeleVision();
                tv.turnON();
                tv.setVolume(50);
                tv.setChannel(12);
            */
            rc = new TeleVision();
            rc.turnON();
            rc.setVolume(50);
            TeleVision tv = (TeleVision) rc;     // 다운 캐스팅
            tv.setChannel(70);
        } else {
            /*
                PlayStation5 ps5 = new PlayStation5();
                ps5.turnON();
                ps5.setVolume(40);
                ps5.playGame("Elden Ring");
            */
            rc = new PlayStation5();
            rc.turnON();
            rc.setVolume(30);
            PlayStation5 ps5 = (PlayStation5) rc;
            ps5.playGame("Dark Souls Ⅲ");
        }

        // 익명 객체
        RemoteController audio = new RemoteController() {
            private int vol = 0;
            @Override
            public void turnON() {
                System.out.println("Audio Power On!!");
            }

            @Override
            public void turnOFF() {
                System.out.println("Audio Power Off!");
            }

            @Override
            public void setVolume(int volume) {
                if (vol > RemoteController.MAX_VOLUME) {
                    this.vol = RemoteController.MAX_VOLUME;
                } else if (vol < RemoteController.MIN_VOLUME) {
                    this.vol = RemoteController.MIN_VOLUME;
                } else {
                    this.vol = volume;
                }
                System.out.println("Now! Volume : " + this.vol);
            }
        };
        audio.turnON();
        audio.setVolume(70);
        audio.turnOFF();
    }
}
