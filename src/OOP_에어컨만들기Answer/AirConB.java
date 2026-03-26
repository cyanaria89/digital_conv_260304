package OOP_에어컨만들기Answer;

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Thread.sleep;

/*
    - 기능 설계
      > 냉방기 ON / OFF
      > 난방기 ON / OFF
      > 바람세기 설정 (1단계 / 2단계 / 3단계)
*/
public class AirConB {
    protected boolean power;
    protected int tempNow;
    protected int tempSet;
    protected boolean cooler;
    protected boolean heater;
    protected int wind;

    // 생성자
    public AirConB() {
        final int[] monthTempArr = { -5, -1, 8, 12, 18, 24, 30, 32, 26, 20, 11, 3 };
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);  // 현재 몇 월인지 정보 추출 - 시스템 설정 시간(배열의 인덱스로 가져옴 > 0 ~ 11)
        this.tempNow = monthTempArr[month];        // 현재 월의 온도를 현재 온도 변수에 대입

        this.power = false;
        this.tempSet = 22;
        this.cooler = true;
        this.heater = false;
        this.wind = 1;
    }

    // 전체 정보 표시
    public void status () {
        final String[] step = { "", "1단계", "2단계", "3단계" };
        System.out.println("====== 에어컨 정보 ======");
        System.out.println("전원 " + (power ? "On" : "Off"));
        System.out.println("현재 온도 : " + tempNow);
        System.out.println("설정 온도 : " + tempSet);
        System.out.println("냉방 모드 : " + (cooler ? "On" : "Off"));
        System.out.println("난방 모드 : " + (heater ? "On" : "Off"));
        System.out.println("바람 세기 : " + step[wind]);
        System.out.println("=".repeat(24));
    }

    // 에어컨 동작 메서드
    public void operate() {
        int elapsedTime = 0;            // 경과시간 계산 변수
        boolean changedTemp = false;    // 온도를 변경해야하는 조건

        System.out.println("===== 에어컨 작동을 시작합니다. =====");
        status();

        try {
            while (true) {
                sleep(1000);    // 1초 재움
                elapsedTime++;
                int getTimeThreshold = getTimeFunc();    // 바람 세기에 따른 시간값

                if (elapsedTime >= getTimeThreshold) {   // 온도를 바꿔야 할 상황
                    changedTemp = true;
                }
                if (changedTemp) {          // 온도를 변경해야 할 조건, 1단 60, 2단 30, 3단 20
                    if (cooler) setTempNow(-1);
                    if (heater) setTempNow(1);
                    status();               // 현재 에어컨 상태 출력
                    elapsedTime = 0;        // 경과 시간 초기화
                    changedTemp = false;    // 온도 변경 조건을 false로 변경
                }
                if (tempNow == tempSet) {   // 현재 온도와 설정온도가 같은 경우
                    System.out.println("설정 온도에 도달하여 에어컨 작동을 종료합니다.");
                    power = false;
                    break;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // sleep() 에 대한 예외처리
        }
    }

    // 현재 온도 변경
    protected void setTempNow(int temp) {
        tempNow += temp;
    }

    protected int getTimeFunc() {
        switch (wind) {
            case 1:
                return 60;
            case 2:
                return 30;
            case 3:
                return 20;
            default:
                return 60;
        }
    }

    // 에어컨 설정
    public void setAirCon(Scanner sc) {     // 스캐너 객체를 전달 받음
        System.out.println("현재 온도는 " + tempNow + "도 입니다.");
        System.out.print("온도 설정 : ");
        tempSet = sc.nextInt(); sc.nextLine();
        System.out.print("바람 세기 : ");
        wind = sc.nextInt(); sc.nextLine();

        if (tempNow > tempSet) {    // 온도 내려야 하는 경우
            System.out.println("Cooler 가 동작합니다.");
            cooler = true;
            heater = false;
        } else if (tempNow < tempSet) {     // 온도 올려야 하는 경우
            System.out.println("Heater 가 동작합니다.");
            cooler = false;
            heater = true;
        } else {
            cooler = false;
            heater = false;
        }
    }
    // 전원 설정
    public void setPower(boolean power) { this.power = power; }
}

class SmartAirConB extends AirConB {
    private boolean autoMode;

    public SmartAirConB() {
        this.autoMode = false;
    }

    @Override
    public void setAirCon(Scanner sc) {
        System.out.println("현재 온도는 " + tempNow + "도 입니다.");
        System.out.print("Smart Mode를 켜시겠습니까?\n(온도 [20도], 바람세기 [2단계] 고정) (yes / no) : ");
        String autoOnOff = sc.nextLine();
        if (autoOnOff.equalsIgnoreCase("yes")) {
            System.out.println("Smart Mode를 실행합니다.");
            autoMode = true;
            tempSet = 20;
            wind = 2;

            if (tempNow > tempSet) {    // 온도 내려야 하는 경우
                System.out.println("Cooler 가 동작합니다.");
                cooler = true;
                heater = false;
            } else if (tempNow < tempSet) {     // 온도 올려야 하는 경우
                System.out.println("Heater 가 동작합니다.");
                cooler = false;
                heater = true;
            } else {
                cooler = false;
                heater = false;
            }
        } else {
            System.out.print("온도 설정 : ");
            tempSet = sc.nextInt();
            sc.nextLine();
            System.out.print("바람 세기 : ");
            wind = sc.nextInt();
            sc.nextLine();

            if (tempNow > tempSet) {    // 온도 내려야 하는 경우
                System.out.println("Cooler 가 동작합니다.");
                cooler = true;
                heater = false;
            } else if (tempNow < tempSet) {     // 온도 올려야 하는 경우
                System.out.println("Heater 가 동작합니다.");
                cooler = false;
                heater = true;
            } else {
                cooler = false;
                heater = false;
            }
        }
    }
}